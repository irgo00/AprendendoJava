package aprendizado.poo.AulaPOO21704bd.src;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CadastroVendasGUI extends javax.swing.JFrame {

    /**
     * Creates new form CadastroVendasGUI
     */
    public CadastroVendasGUI() {
        initComponents();
        setSize(500, 400);
        atualizarTela();        
        PrecoTotalComboHandler comboHandler = 
                new PrecoTotalComboHandler();
        jComboBoxProduto.addItemListener(comboHandler);
        PrecoTotalSpinnerHandler spinnerHandler = 
                new PrecoTotalSpinnerHandler();
        jSpinnerQuantidade.addChangeListener(spinnerHandler);

    }

    private void atualizarTela() {

        //buscar produtos ordenado por nome
        //atualizar combobox de produtos
        List<Produto> produtos = this.buscarProdutos();
        DefaultComboBoxModel modelProdutos = new DefaultComboBoxModel(produtos.toArray());
        this.jComboBoxProduto.setModel(modelProdutos);

        //buscar plataformas ordenado por nome
        //atualizar combobox de plataformas
        List<Plataforma> plataformas = this.buscarPlataformas();
        DefaultComboBoxModel modelPlataformas = new DefaultComboBoxModel(plataformas.toArray());
        this.jComboBoxPlataforma.setModel(modelPlataformas);

        //buscar lojas ordenado por nome
        //atualizar combobox de lojas
        List<Loja> lojas = this.buscarLojas();
        DefaultComboBoxModel modelLojas = new DefaultComboBoxModel(lojas.toArray());
        this.jComboBoxLoja.setModel(modelLojas);

        prePreencherFormulario();
    }

    private List<Produto> buscarProdutos() {

        List<Produto> produtos = new ArrayList<>();
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "select id, nome, preco_unitario from produto order by nome asc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                double preco = rs.getDouble(3);
                Produto p = new Produto(id, nome, preco);
                produtos.add(p);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return produtos;
    }

    private List<Plataforma> buscarPlataformas() {

        List<Plataforma> plataformas = new ArrayList<>();
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "select id, nome from plataforma order by nome asc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                plataformas.add(new Plataforma(id, nome));
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return plataformas;
    }

    private List<Loja> buscarLojas() {

        List<Loja> lojas = new ArrayList<>();
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "select id, nome from loja order by nome asc";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                lojas.add(new Loja(id, nome));
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lojas;
    }

    private void prePreencherFormulario() {
        String meses[] = new String[]{"Janeiro", "Fevereiro",
            "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"};
        java.util.Date dataAtual = new java.util.Date();
        int ano = dataAtual.getYear() + 1900;
        int mes = dataAtual.getMonth();
        jTextFieldAno.setText(String.valueOf(ano));
        jTextFieldMês.setText(meses[mes]);
        jSpinnerQuantidade.setValue(1);
        calcularPrecoTotal();
    }

    private void calcularPrecoTotal() {
        Produto p = (Produto) jComboBoxProduto.getSelectedItem();
        int qtd = (int) jSpinnerQuantidade.getValue();
        double precoTotal = p.getPrecoUnitario() * qtd;
        jTextFieldValorTotal.setText(String.valueOf(precoTotal));
    }

    private class PrecoTotalComboHandler implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            calcularPrecoTotal();
        }

    }
    
    private class PrecoTotalSpinnerHandler implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent e) {
            calcularPrecoTotal();
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelBotoes = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMês = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxPlataforma = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxLoja = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Vendas");
        setResizable(false);

        jPanelBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanelBotoes.add(jButtonSalvar);

        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jPanelBotoes.add(jButtonCancelar);

        getContentPane().add(jPanelBotoes, java.awt.BorderLayout.PAGE_END);

        java.awt.GridBagLayout jPanelFormularioLayout = new java.awt.GridBagLayout();
        jPanelFormularioLayout.columnWidths = new int[] {0, 11, 0};
        jPanelFormularioLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        jPanelFormulario.setLayout(jPanelFormularioLayout);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Ano");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanelFormulario.add(jLabel1, gridBagConstraints);

        jTextFieldAno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldAno.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        jPanelFormulario.add(jTextFieldAno, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Mês");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanelFormulario.add(jLabel2, gridBagConstraints);

        jTextFieldMês.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldMês.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanelFormulario.add(jTextFieldMês, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Produto");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanelFormulario.add(jLabel3, gridBagConstraints);

        jComboBoxProduto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProduto.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanelFormulario.add(jComboBoxProduto, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Plataforma");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanelFormulario.add(jLabel4, gridBagConstraints);

        jComboBoxPlataforma.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxPlataforma.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanelFormulario.add(jComboBoxPlataforma, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Loja");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanelFormulario.add(jLabel5, gridBagConstraints);

        jComboBoxLoja.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jComboBoxLoja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLoja.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        jPanelFormulario.add(jComboBoxLoja, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Quantidade");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        jPanelFormulario.add(jLabel6, gridBagConstraints);

        jSpinnerQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jSpinnerQuantidade.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        jPanelFormulario.add(jSpinnerQuantidade, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Valor total");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        jPanelFormulario.add(jLabel7, gridBagConstraints);

        jTextFieldValorTotal.setEditable(false);
        jTextFieldValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldValorTotal.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        jPanelFormulario.add(jTextFieldValorTotal, gridBagConstraints);

        getContentPane().add(jPanelFormulario, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        //ano
        int ano = Integer.parseInt(jTextFieldAno.getText());
        //mes
        String mes = jTextFieldMês.getText();
        //produto
        Produto produto = (Produto) jComboBoxProduto.getSelectedItem();
        //plataforma
        Plataforma plataforma = (Plataforma) jComboBoxPlataforma.getSelectedItem();
        //loja
        Loja loja = (Loja) jComboBoxLoja.getSelectedItem();
        //quantidade
        int quantidade = (int) jSpinnerQuantidade.getValue();
        //precoTotal
        double precoTotal = Double.parseDouble(jTextFieldValorTotal.getText());
        
        Venda venda = new Venda(0, plataforma, mes, ano, 
                quantidade, precoTotal, loja, produto);
        
        cadastrarVenda(venda);
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    public void cadastrarVenda(Venda v){
        
        try {
            Conexao conexao = new Conexao();
            Connection con = conexao.conectar();
            String sql = "insert into venda "
                    + "(mes, ano, quantidade, valorTotal, "
                    + "fkIdPlataforma, fkIdLoja, fkIdProduto) values "
                    + "(?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,v.getMes());
            ps.setInt(2, v.getAno());
            ps.setInt(3, v.getQuantidade());
            ps.setDouble(4, v.getValorTotal());
            ps.setInt(5, v.getPlataforma().getId());
            ps.setInt(6, v.getLoja().getId());
            ps.setInt(7, v.getProduto().getId());
            ps.execute();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        atualizarTela();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroVendasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVendasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVendasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVendasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVendasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxLoja;
    private javax.swing.JComboBox<String> jComboBoxPlataforma;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldMês;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
