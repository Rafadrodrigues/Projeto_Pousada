
package View;

import static Controller.Sistema.signup;
import javax.swing.JOptionPane;


public class Signup extends javax.swing.JFrame {


    public Signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        usuariocadastro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        senhacadastro = new javax.swing.JPasswordField();
        emailcadastro = new javax.swing.JPasswordField();
        enviarcadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefonecadastro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cpfcadastro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        enderecocadastro = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        usuariocadastro1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        senhacadastro1 = new javax.swing.JPasswordField();
        enviarcadastro1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cpfcadastro1 = new javax.swing.JFormattedTextField();
        telefonecadastro1 = new javax.swing.JFormattedTextField();
        emailcadastro1 = new javax.swing.JTextField();
        enderecocadastro1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        nomecadastro1 = new javax.swing.JTextField();

        jButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 102));
        jButton4.setText("Logar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel12.setText("Endereço");

        usuariocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariocadastroActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel13.setText("E-mail");

        emailcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailcadastroActionPerformed(evt);
            }
        });

        enviarcadastro.setBackground(new java.awt.Color(36, 0, 70));
        enviarcadastro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        enviarcadastro.setForeground(new java.awt.Color(255, 255, 255));
        enviarcadastro.setText("Login");
        enviarcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarcadastroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel2.setText("Usuário");

        jLabel9.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel9.setText("Senha");

        jLabel10.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel10.setText("CPF");

        jLabel11.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel11.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 0, 70));
        jLabel7.setText("Signup");

        cpfcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfcadastroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 12)); // NOI18N
        jLabel8.setText("Já tem uma conta?");

        enderecocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecocadastroActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(86, 0, 140));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("copyright © Rafael Dias Rodrigues all rights reserved");

        jLabel6.setFont(new java.awt.Font("Gabriola", 0, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pousada Milho Verde");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(64, 64, 64))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 102, 102));
        jButton5.setText("Logar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        usuariocadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariocadastro1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel15.setText("E-mail");

        enviarcadastro1.setBackground(new java.awt.Color(36, 0, 70));
        enviarcadastro1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        enviarcadastro1.setForeground(new java.awt.Color(255, 255, 255));
        enviarcadastro1.setText("Criar");
        enviarcadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarcadastro1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Usuário");

        jLabel16.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel16.setText("Senha");

        jLabel17.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel17.setText("CPF");

        jLabel18.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel18.setText("Telefone");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(36, 0, 70));
        jLabel19.setText("Signup");

        jLabel20.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 12)); // NOI18N
        jLabel20.setText("Já tem uma conta?");

        jPanel2.setBackground(new java.awt.Color(86, 0, 140));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel21.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("copyright © Rafael Dias Rodrigues all rights reserved");

        jLabel22.setFont(new java.awt.Font("Gabriola", 0, 40)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Pousada Milho Verde");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(64, 64, 64))
        );

        jLabel23.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel23.setText("Endereço");

        try {
            cpfcadastro1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            telefonecadastro1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        emailcadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailcadastro1ActionPerformed(evt);
            }
        });

        enderecocadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecocadastro1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        jLabel24.setText("Nome");

        nomecadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomecadastro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(usuariocadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enviarcadastro1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel23)
                    .addComponent(jLabel18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(telefonecadastro1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(cpfcadastro1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(emailcadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecocadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(senhacadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomecadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariocadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhacadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomecadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfcadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonecadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailcadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecocadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enviarcadastro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void usuariocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariocadastroActionPerformed

    private void emailcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailcadastroActionPerformed

    private void enviarcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarcadastroActionPerformed

    private void cpfcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfcadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfcadastroActionPerformed

    private void enderecocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecocadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecocadastroActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void usuariocadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariocadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariocadastro1ActionPerformed

    private void enviarcadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarcadastro1ActionPerformed
        // TODO add your handling code here:
        if(usuariocadastro1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo de usuário");
        }else if(senhacadastro1.getPassword().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo de senha");
        }else if(cpfcadastro1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo de CPF");
        }else if(emailcadastro1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo de E-mail");
        }else if(telefonecadastro1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo de Telefone");
        }else if(enderecocadastro1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor preencha o campo de Endereço");
        }
        String user = usuariocadastro1.getText();
        String password = senhacadastro1.getText();
        String nome = nomecadastro1.getText();
        String cpf = cpfcadastro1.getText();
        String email = emailcadastro1.getText();
        String telefone = telefonecadastro1.getText();
        String endereco = enderecocadastro1.getText();

        signup(user,password,nome,cpf,endereco,email,telefone);
        JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
        
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_enviarcadastro1ActionPerformed

    private void emailcadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailcadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailcadastro1ActionPerformed

    private void enderecocadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecocadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecocadastro1ActionPerformed

    private void nomecadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomecadastro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomecadastro1ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfcadastro;
    private javax.swing.JFormattedTextField cpfcadastro1;
    private javax.swing.JPasswordField emailcadastro;
    private javax.swing.JTextField emailcadastro1;
    private javax.swing.JPasswordField enderecocadastro;
    private javax.swing.JTextField enderecocadastro1;
    private javax.swing.JButton enviarcadastro;
    private javax.swing.JButton enviarcadastro1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomecadastro1;
    private javax.swing.JPasswordField senhacadastro;
    private javax.swing.JPasswordField senhacadastro1;
    private javax.swing.JTextField telefonecadastro;
    private javax.swing.JFormattedTextField telefonecadastro1;
    private javax.swing.JTextField usuariocadastro;
    private javax.swing.JTextField usuariocadastro1;
    // End of variables declaration//GEN-END:variables
}
