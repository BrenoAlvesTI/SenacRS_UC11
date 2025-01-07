package telas;

import model.ProdutosDTO;
import dao.ProdutosDAO;
import javax.swing.JOptionPane;

public class cadastroVIEW extends javax.swing.JFrame {


    public cadastroVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel1.setText("Sistema de Leilões");

        jLabel3.setText("Cadastre um novo produto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Valor:");

        btnCadastrar.setBackground(new java.awt.Color(153, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnProdutos.setText("Consultar Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(txtValor)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
<<<<<<< HEAD
<<<<<<< HEAD
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
=======
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnProdutos)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!camposVazios()){
            Cadastrar();
        }        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        listagemVIEW listagem = new listagemVIEW(); 
        listagem.setVisible(true);
    }//GEN-LAST:event_btnProdutosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    private boolean camposVazios(){
        
        boolean empty = true;
        
        if (txtNome.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ATENÇÃO! O Campo Nome não pode estar vazio.", "Erro!", JOptionPane.ERROR_MESSAGE);
            txtNome.requestFocus();
        }
        else if (txtValor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ATENÇÃO! O Campo Valor não pode estar vazio.", "Erro!", JOptionPane.ERROR_MESSAGE);
            txtValor.requestFocus();
        }
<<<<<<< HEAD
<<<<<<< HEAD
        else if (!txtNome.getText().trim().matches("[\\p{L} ]+")){
            JOptionPane.showMessageDialog(null, "ATENÇÃO! O Campo Nome só pode conter letras.", "Erro!", JOptionPane.ERROR_MESSAGE);            
            txtNome.setText("");
            txtNome.requestFocus();
        }
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
        else {
            empty = false;
        }
        
        return empty;
    }
    
    private void Cadastrar() {
        ProdutosDTO produto = new ProdutosDTO();
        String nome = txtNome.getText();
        String valor = txtValor.getText();
        String status = "A Venda";
        produto.setNome(nome);
<<<<<<< HEAD
<<<<<<< HEAD
        produto.setValor(Double.parseDouble(valor.replace(",", ".")));
        produto.setStatus(status);
        
        ProdutosDAO produtodao = new ProdutosDAO();
        produtodao.Salvar(produto);
        
        txtNome.setText("");
        txtValor.setText("");
        txtNome.requestFocus();
=======
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
        produto.setValor(Integer.parseInt(valor));
        produto.setStatus(status);
        
        ProdutosDAO produtodao = new ProdutosDAO();
        produtodao.cadastrarProduto(produto);
<<<<<<< HEAD
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
=======
>>>>>>> c450c737a71acf335b855c0a1a2612704236b0fa
    }

}
