package sistema;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author senac
 */
public class reserva extends javax.swing.JFrame implements KeyListener {
final DefaultTableModel modelo = new DefaultTableModel();

    public reserva () {
        modelo.addColumn("nome");
	modelo.addColumn("vaga");
	modelo.addColumn("carga");
	modelo.addColumn("valor");
        modelo.addColumn("codigo_curso");
        modelo.addColumn("turno");
 
         
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelareserva.getModel();
        
        modelo.setRowCount(0);
        try {
            // Inicia a conexão e o Statement
            Connection connection = new sistema.Conexao().getConnection();
            System.out.println("Conexão aberta!");
            PreparedStatement stmt = connection.prepareStatement("select * from reserva");
            // executa comando
            ResultSet rs = stmt.executeQuery();
            // Define resultados
            while (rs.next()) {
                String codigo1 = rs.getString("codigo_curso");
                String codigo2 = rs.getString("codigo_aluno");
                String codigo3 = rs.getString("codigo_reserva");
                
                
               
                modelo.addRow(new Object[]{codigo1,codigo2,codigo3});
            }
            rs.close();
            stmt.close();
            connection.close();
            System.out.println("Conexão fechada!");
        } catch (Exception e) {
            System.out.println("Deu erro!");
        }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelareserva = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        erro_campo_reserva = new javax.swing.JLabel();
        obrigatorioreserva = new javax.swing.JLabel();
        codigocurso = new javax.swing.JLabel();
        matriculaaluno = new javax.swing.JLabel();
        campocodigocurso = new javax.swing.JTextField();
        campomatricula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        camporeservavagas = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Matricula_aluno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campobuscarmatricula = new javax.swing.JTextField();
        resultadoaluno = new javax.swing.JLabel();
        buscarmatricula = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        botaobuscacurso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campobuscarcurso = new javax.swing.JTextField();
        resultadocurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        tabelareserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo curso", "Matricula aluno", "Codigo reserva"
            }
        ));
        jScrollPane1.setViewportView(tabelareserva);

        erro_campo_reserva.setForeground(new java.awt.Color(255, 0, 0));

        obrigatorioreserva.setForeground(new java.awt.Color(255, 0, 0));

        codigocurso.setText("Codigo curso");

        matriculaaluno.setText("Matricula aluno");

        jLabel1.setText("Codigo vagas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(erro_campo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(camporeservavagas, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obrigatorioreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(codigocurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campocodigocurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(matriculaaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campomatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(424, 424, 424))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigocurso)
                    .addComponent(campocodigocurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculaaluno)
                    .addComponent(campomatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(obrigatorioreserva)
                    .addComponent(camporeservavagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erro_campo_reserva)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        Matricula_aluno.setText("Matricula do aluno");

        jLabel5.setText("Nome do aluno");

        buscarmatricula.setText("Buscar");
        buscarmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarmatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Matricula_aluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campobuscarmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultadoaluno, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                        .addComponent(buscarmatricula)
                        .addGap(44, 44, 44))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Matricula_aluno)
                    .addComponent(campobuscarmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resultadoaluno)
                    .addComponent(buscarmatricula))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        botaobuscacurso.setText("Buscar");
        botaobuscacurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaobuscacursoActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nome do curso");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(resultadocurso, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaobuscacurso)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(campobuscarcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campobuscarcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaobuscacurso))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(resultadocurso))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoExcluir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoInserir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed

        if (tabelareserva.getSelectedRowCount() != 0) {

            int linha = tabelareserva.getSelectedRow();
            int coluna = tabelareserva.getSelectedColumn();
            String resultado = (String) tabelareserva.getValueAt(linha, coluna);
            String codigo = "Tem certeza que deseja deletar o\nRegistro do curso " + tabelareserva.getValueAt(linha, 1).toString() + "?";
            int opcao_escolhida = JOptionPane.showConfirmDialog(null, codigo, "Exclusão ", JOptionPane.YES_NO_OPTION);
            if (opcao_escolhida == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM reserva WHERE codigo_reserva="+resultado+";";
                try{
                    Connection conexao = new Conexao().getConnection();
                    PreparedStatement stmt = conexao.prepareStatement(sql);
                    stmt.executeUpdate();
                    conexao.close();
                    JOptionPane.showMessageDialog(null,"Registro Excluído!");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Selecione a coluna 'Codigo'");
                }
            }else{
                return;
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
        }
        modelo.setRowCount(0);
        String sql = "SELECT * FROM reserva";

        DefaultTableModel modelo = (DefaultTableModel)tabelareserva.getModel();
        modelo.setRowCount(0);

        try {
            // Inicia a conexão e o Statement
            Connection connection = new sistema.Conexao().getConnection();
            System.out.println("Conexão aberta!");
            PreparedStatement stmt = connection.prepareStatement("select * from reserva");
            // executa comando
            ResultSet rs = stmt.executeQuery();
            // Define resultados
            while (rs.next()) {

                String codigo1 = rs.getString("codigo_curso");
                String codigo2 = rs.getString("codigo_aluno");
                String codigo3 = rs.getString("codigo_reserva");
                modelo.addRow(new Object[]{codigo1,codigo2,codigo3});
            }
            rs.close();
            stmt.close();
            connection.close();
            System.out.println("Conexão fechada!");
        } catch (Exception e) {
            System.out.println("Deu erro!");
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados", "Erro ", JOptionPane.ERROR_MESSAGE);
        }

        DefaultTableModel mds = (DefaultTableModel) tabelareserva.getModel();
        mds.setRowCount(0);
        try {
            // Inicia a conexão e o Statement
            Connection connection = new sistema.Conexao().getConnection();
            System.out.println("Conexão aberta!");
            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement("select * from reserva");
            // executa comando
            ResultSet rs = stmt.executeQuery();
            // Define resultados
            while (rs.next()) {
                String codigo1 = rs.getString("codigo_curso");
                String codigo2 = rs.getString("codigo_aluno");
                String codigo3 = rs.getString("codigo_reserva");
                modelo.addRow(new Object[]{codigo1,codigo2,codigo3});
            }
            rs.close();
            stmt.close();
            connection.close();
            System.out.println("Conexão fechada!");
        } catch (Exception e) {
        }

    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed

        String codigo = campocodigocurso.getText();
        String matricula = campomatricula.getText();
        String reserva = camporeservavagas.getText();
       
        try {
            // Inicia a conexão e o Statement
            Connection connection = new Conexao().getConnection();
            System.out.println("Conexão aberta!");
            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement("insert into reserva (codigo_reserva,codigo_curso,codigo_aluno) values "
                + "('"+reserva+"','"+codigo+"','"+matricula+"')");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro feito com sucesso","Aviso", JOptionPane.INFORMATION_MESSAGE);
            stmt.close();
            //Fecha a conexão
            connection.close();
            System.out.println("Conexão fechada!");
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao inserir dado", "Erro ", JOptionPane.ERROR_MESSAGE);
        }

        DefaultTableModel modelo = (DefaultTableModel) tabelareserva.getModel();
        modelo.setRowCount(0);
        try {
            // Inicia a conexão e o Statement
            Connection connection = new sistema.Conexao().getConnection();
            System.out.println("Conexão aberta!");
            com.mysql.jdbc.PreparedStatement stmt = (com.mysql.jdbc.PreparedStatement) connection.prepareStatement("select * from reserva");
            // executa comando
            ResultSet rs = stmt.executeQuery();
            // Define resultados
            while (rs.next()) {
                String codigo3 = rs.getString("codigo_curso");
                String codigo4 = rs.getString("codigo_aluno");
                String codigo5 = rs.getString("codigo_reserva");
                modelo.addRow(new Object[]{codigo3,codigo4,codigo5});
            }
            rs.close();
            stmt.close();
            connection.close();
            System.out.println("Conexão fechada!");
        } catch (Exception e) {
        }

    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaobuscacursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaobuscacursoActionPerformed
        // TODO add your handling code here:
        String codigo = campobuscarcurso.getText();

        try {
            // Inicia a conexão e o Statement
            Connection connection = new sistema.Conexao().getConnection();
            System.out.println("Conexão aberta!");
            PreparedStatement stmt = connection.prepareStatement("select * from curso where codigo_curso='"+codigo+"'");
            // executa comando
            ResultSet rs = stmt.executeQuery();
            // Define resultados
            while (rs.next()) {

                String nome = rs.getString("nome");
                resultadocurso.setText(nome);

            }
            rs.close();
            stmt.close();
            connection.close();
            System.out.println("Conexão fechada!");
        } catch (Exception e) {
            System.out.println("Deu erro!");
        }
    }//GEN-LAST:event_botaobuscacursoActionPerformed

    private void buscarmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarmatriculaActionPerformed
       
         String codigo =campobuscarmatricula.getText();

        try {
            // Inicia a conexão e o Statement
            Connection connection = new sistema.Conexao().getConnection();
            System.out.println("Conexão aberta!");
            PreparedStatement stmt = connection.prepareStatement("select * from aluno where codigo_aluno='"+codigo+"'");
            // executa comando
            ResultSet rs = stmt.executeQuery();
            // Define resultados
            while (rs.next()) {
		String nome = rs.getString("nome");
                resultadoaluno.setText(nome);

            }
            rs.close();
            stmt.close();
            connection.close();
            System.out.println("Conexão fechada!");
        } catch (Exception e) {
            System.out.println("Deu erro!");
        }
        
        
    }//GEN-LAST:event_buscarmatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Matricula_aluno;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaobuscacurso;
    private javax.swing.JButton buscarmatricula;
    private javax.swing.JTextField campobuscarcurso;
    private javax.swing.JTextField campobuscarmatricula;
    private javax.swing.JTextField campocodigocurso;
    private javax.swing.JTextField campomatricula;
    private javax.swing.JTextField camporeservavagas;
    private javax.swing.JLabel codigocurso;
    private javax.swing.JLabel erro_campo_reserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel matriculaaluno;
    private javax.swing.JLabel obrigatorioreserva;
    private javax.swing.JLabel resultadoaluno;
    private javax.swing.JLabel resultadocurso;
    private javax.swing.JTable tabelareserva;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
