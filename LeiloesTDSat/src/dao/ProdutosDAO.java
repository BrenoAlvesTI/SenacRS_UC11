package dao;

import conexao.Conexao;
import model.ProdutosDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProdutosDAO {
    
    private Conexao conexao;
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public ProdutosDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public boolean Salvar(ProdutosDTO produto) {
        String sql = ("INSERT INTO produtos(nome, valor, status) VALUES "
                + "(?, ?, ?)");
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setDouble(2, produto.getValor());
            ps.setString(3, produto.getStatus());
            
            int linhasAfetadas = ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Êxito", JOptionPane.INFORMATION_MESSAGE);
            return linhasAfetadas > 0;           
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + e.getMessage() + "", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public List<ProdutosDTO> getProdutosTotal() { 
        String sql = "SELECT * FROM produtos"; // Seleciona todos os produtos

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<ProdutosDTO> listaProdutos = new ArrayList<>();

            while (rs.next()) { 
                ProdutosDTO produto = new ProdutosDTO();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getDouble("valor"));
                produto.setStatus(rs.getString("status"));
                listaProdutos.add(produto);
            }

            return listaProdutos;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean atualizarStatus(int id, String novoStatus) {
        String sql = "UPDATE produtos SET status = ? WHERE id = ?";

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, novoStatus); // Define o novo status
            ps.setInt(2, id);           // Define o ID do produto a ser atualizado

            int linhasAfetadas = ps.executeUpdate(); // Executa a atualização

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Produto vendido com sucesso!", "Êxito", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar status: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public List<ProdutosDTO> getProdutosVendidos() { 
        String sql = "SELECT * FROM produtos WHERE status = 'Vendido'"; // Seleciona todos os produtos

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<ProdutosDTO> listaProdutos = new ArrayList<>();

            while (rs.next()) { 
                ProdutosDTO produto = new ProdutosDTO();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getDouble("valor"));
                produto.setStatus(rs.getString("status"));
                listaProdutos.add(produto);
            }

            return listaProdutos;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
                
}

