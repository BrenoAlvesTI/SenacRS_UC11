package dao;

<<<<<<< HEAD
<<<<<<< HEAD
import conexao.Conexao;
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
import model.ProdutosDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ProdutosDAO {
    
<<<<<<< HEAD
<<<<<<< HEAD
    private Conexao conexao;
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
    Connection conn;
    PreparedStatement prep;
    ResultSet resultset;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
<<<<<<< HEAD
<<<<<<< HEAD
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
=======
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
    public void cadastrarProduto (ProdutosDTO produto){
        
        
        //conn = new conectaDAO().connectDB();
        
        
<<<<<<< HEAD
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }
                
}

