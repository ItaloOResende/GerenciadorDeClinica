/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Utilitarios.ModeloTabela;
import Utilitarios.conectaBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Italo O
 */
public class RelatorioMedico extends javax.swing.JFrame {
    
    conectaBanco conecta= new conectaBanco();
    ArrayList dados=new ArrayList();
    String[] ColunasRelatorios=new String[]{"ORDEM","NOME","TELEFONE","CPF","ESPECIALIDADE","PROFISSIONAL","DIA","HORARIO","RELATORIO"};
    
    public RelatorioMedico() {
        initComponents();
        ModeloTabela ModeloTabela2=new ModeloTabela(dados,ColunasRelatorios);
        jTableRelatorios.setModel(ModeloTabela2);  
        conecta.conexao();
        preencherJComboBoxEspecialidade();
        preencherJComboBoxProfissional();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorios = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonEditarRelatorio = new javax.swing.JButton();
        jComboBoxProfissional = new javax.swing.JComboBox<>();
        jComboBoxEspecialidade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonLogar = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldOrdem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextFieldTelefone = new javax.swing.JFormattedTextField();
        jTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNome.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RELATÓRIO MÉDICO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("CPF:");

        jTableRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRelatoriosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRelatorios);

        jButton7.setText("PESQUISAR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Relatório:");

        jButtonEditarRelatorio.setText("EDITAR RELATÓRIO");
        jButtonEditarRelatorio.setEnabled(false);
        jButtonEditarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarRelatorioActionPerformed(evt);
            }
        });

        jComboBoxProfissional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspecialidadeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Especialidade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Profissional:");

        jButtonLogar.setText("LOGAR");
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Dia:");

        jTextFieldOrdem.setEnabled(false);

        jScrollPane2.setViewportView(jEditorPane1);

        try {
            jTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldTelefone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldTelefone.setEnabled(false);

        try {
            jTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldCPF.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCPF.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNome)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEditarRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxProfissional, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLogar))))
                    .addComponent(jScrollPane2)
                    .addComponent(jTextFieldTelefone)
                    .addComponent(jTextFieldCPF))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel12)
                        .addComponent(jLabel8))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogar)
                    .addComponent(jTextFieldOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditarRelatorio)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEspecialidadeActionPerformed

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed
        // TODO add your handling code here:
        preencherTabelaDeRelatorioLogar();
    }//GEN-LAST:event_jButtonLogarActionPerformed

    private void jTableRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRelatoriosMouseClicked
        String ORDEM=""+jTableRelatorios.getValueAt(jTableRelatorios.getSelectedRow(), 0);
        jTextFieldOrdem.setText(ORDEM);
        String NOME=""+jTableRelatorios.getValueAt(jTableRelatorios.getSelectedRow(), 1);
        jTextFieldNome.setText(NOME);
        String TELEFONE=""+jTableRelatorios.getValueAt(jTableRelatorios.getSelectedRow(), 2);
        jTextFieldTelefone.setText(TELEFONE);
        String CPF=""+jTableRelatorios.getValueAt(jTableRelatorios.getSelectedRow(), 3);
        jTextFieldCPF.setText(CPF);
        String RELATORIO=""+jTableRelatorios.getValueAt(jTableRelatorios.getSelectedRow(), 8);
        jEditorPane1.setText(RELATORIO);
       
        jTextFieldCPF.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);
        jButtonEditarRelatorio.setEnabled(true);
    }//GEN-LAST:event_jTableRelatoriosMouseClicked

    private void jButtonEditarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarRelatorioActionPerformed
        // TODO add your handling code here:  
        try {
            PreparedStatement pst=conecta.conn.prepareStatement("update relatoriomedico set RELATORIO=? where ORDEM=?");
            pst.setString(1, jEditorPane1.getText());
            pst.setString(2,jTextFieldOrdem.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Relatório preenchido com sucesso!");
            EsvaziarCamposDeTexto();
            preencherTabelaDeRelatorioLogar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao editar\n Erro:"+ex);
            }   
    }//GEN-LAST:event_jButtonEditarRelatorioActionPerformed
    public void preencherColunasDaTabelaDeRelatorio(String SQL){
        ArrayList dados=new ArrayList();
        String[] Colunas=new String[]{"ORDEM","NOME","TELEFONE","CPF","ESPECIALIDADE","PROFISSIONAL","DIA","HORARIO","RELATORIO"};
        conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
            dados.add(new Object[]{conecta.rs.getInt("ORDEM"),conecta.rs.getString("NOME"),conecta.rs.getString("TELEFONE"),
                conecta.rs.getString("CPF"),conecta.rs.getString("ESPECIALIDADE"),conecta.rs.getString("PROFISSIONAL"),
                conecta.rs.getString("DIA"),conecta.rs.getString("HORARIO"),conecta.rs.getString("RELATORIO")});
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher tabela ou tabela vazia!\n Erro:"+ex);
        }
        ModeloTabela ModeloTabela=new ModeloTabela(dados,Colunas);
        jTableRelatorios.setModel(ModeloTabela);  
    }
    public void preencherTabelaDeRelatorio(){
        preencherColunasDaTabelaDeRelatorio("select * from relatoriomedico");
    }
    public void preencherTabelaDeRelatorioLogar(){
        try {
            conecta.executaSQL("select * from usuarioprofissional where nome='"+jComboBoxProfissional.getSelectedItem()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("senha").equals(jPasswordField1.getText())){
                SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String date=(DateFormat.format(jDateChooser1.getDate()));
                preencherColunasDaTabelaDeRelatorio("select * from relatoriomedico where ESPECIALIDADE like'%"+jComboBoxEspecialidade.getSelectedItem()+"%'"
                        + "and PROFISSIONAL like'%"+jComboBoxProfissional.getSelectedItem()+"%'"
                        + "and DIA like'%"+date+"%'"        
                        + "ORDER BY HORARIO");
            }else{
                JOptionPane.showMessageDialog(rootPane,"Senha invalida!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Usuário ou senha invalidos!\n"+ex);
        }
        jPasswordField1.setText("");
    }
    public void preencherJComboBoxEspecialidade(){
        conecta.conexao();
        conecta.executaSQL("select distinct ESPECIALIDADE from usuarioprofissional order by ESPECIALIDADE");
        try {
            conecta.rs.first();
            jComboBoxEspecialidade.removeAllItems();
            jComboBoxEspecialidade.addItem("Todas as especialidades");
            do{
                if(!conecta.rs.getString("ESPECIALIDADE").isEmpty()){
                    jComboBoxEspecialidade.addItem(conecta.rs.getString("ESPECIALIDADE"));
                }
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane,"Erro ao preencher JComboBox!\n Erro:"+ ex);
        }
    }
    public void preencherJComboBoxProfissional(){
        conecta.conexao();
        conecta.executaSQL("select distinct NOME from usuarioprofissional order by NOME");
        try {
            conecta.rs.first();
            jComboBoxProfissional.removeAllItems();
            jComboBoxProfissional.addItem("Todas os profissionais");
            do{
                if(!conecta.rs.getString("NOME").isEmpty()){
                    jComboBoxProfissional.addItem(conecta.rs.getString("NOME"));
                }
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(rootPane,"Erro ao preencher JComboBox!\n Erro:"+ ex);
        }
    }
    public void EsvaziarCamposDeTexto(){
       jTextFieldNome.setText("");
       jTextFieldCPF.setText("");
       jTextFieldTelefone.setText("");
       jEditorPane1.setText("");
    }

    /**
    /**
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
            java.util.logging.Logger.getLogger(RelatorioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonEditarRelatorio;
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JComboBox<String> jComboBoxEspecialidade;
    private javax.swing.JComboBox<String> jComboBoxProfissional;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableRelatorios;
    private javax.swing.JFormattedTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldOrdem;
    private javax.swing.JFormattedTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
