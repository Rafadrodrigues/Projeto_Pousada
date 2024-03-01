/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

/**
 * Classe que gerencia a tela inicia do sistema, logo após a tela de login
 * @author rafar
 */
public class Home extends javax.swing.JFrame {

    /**
     * Construtor padrão da classe
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaosair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botaofuncionario = new javax.swing.JButton();
        botaoreserva = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botaocliente = new javax.swing.JButton();
        botaocliente1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(86, 0, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");

        botaosair.setFont(new java.awt.Font("Zilla Slab SemiBold", 0, 14)); // NOI18N
        botaosair.setForeground(new java.awt.Color(204, 51, 0));
        botaosair.setText("Sair");
        botaosair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(240, 240, 240)
                .addComponent(botaosair)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaosair)
                    .addComponent(jLabel1))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel2.setText("Pousada Milho Verde");

        jLabel3.setFont(new java.awt.Font("Open Sans SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Telefone : (33) 999880-1111");

        jLabel4.setFont(new java.awt.Font("Open Sans SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("CNPJ:839183908291389012");

        jLabel7.setFont(new java.awt.Font("Raleway Light", 0, 10)); // NOI18N
        jLabel7.setText("O seu bem estar é nossa maior conquista!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(23, 23, 23))
        );

        botaofuncionario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botaofuncionario.setForeground(new java.awt.Color(0, 102, 51));
        botaofuncionario.setText("Funcionário");
        botaofuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaofuncionarioActionPerformed(evt);
            }
        });

        botaoreserva.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botaoreserva.setForeground(new java.awt.Color(0, 102, 51));
        botaoreserva.setText("Reservas");
        botaoreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoreservaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(86, 0, 140));

        jLabel9.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("copyright © Rafael Dias Rodrigues all rights reserved");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(219, 219, 219)
                    .addComponent(jLabel9)
                    .addContainerGap(219, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabel9)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 30)); // NOI18N
        jLabel6.setText("Seja Bem-Vindo");

        botaocliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botaocliente.setForeground(new java.awt.Color(0, 102, 51));
        botaocliente.setText("Financeiro");
        botaocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoclienteActionPerformed(evt);
            }
        });

        botaocliente1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        botaocliente1.setForeground(new java.awt.Color(0, 102, 51));
        botaocliente1.setText("Clientes");
        botaocliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(botaocliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63)
                .addComponent(botaocliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(botaofuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(botaoreserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoreserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaofuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaocliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaocliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaofuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaofuncionarioActionPerformed
        /*Esse trecho de código corresponde ao botão voltar, quando acionado tende 
        a voltar a uma tela anterior*/
        FuncionarioTela func = new FuncionarioTela();
        func.setVisible(true);
        func.setLocationRelativeTo(null);
        func.pack();
        /*Fecha a tela que estavamos*/
        this.dispose();
    }//GEN-LAST:event_botaofuncionarioActionPerformed

    private void botaoreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoreservaActionPerformed
        /*Esse trecho de código corresponde ao botão voltar, quando acionado tende 
        a voltar a uma tela anterior*/
        Reserva reserva = new Reserva();
        reserva.setVisible(true);
        reserva.setLocationRelativeTo(null);
        reserva.pack();
        /*Fecha a tela que estavamos*/
        this.dispose();
    }//GEN-LAST:event_botaoreservaActionPerformed

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
        // TODO add your handling code here:
        int opcao = JOptionPane.showConfirmDialog(Home.this, "Tem certeza que deseja sair?", "Confirmação",JOptionPane.YES_NO_OPTION);
                // Se o usuário clicar em "Sim" (YES_OPTION), fecha a aplicação
                if (opcao == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
    }//GEN-LAST:event_botaosairActionPerformed

    private void botaoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoclienteActionPerformed
        /*Esse trecho de código corresponde ao botão voltar, quando acionado tende 
        a voltar a uma tela anterior*/
        FinanceiroTela financeiro = new FinanceiroTela();
        financeiro.setVisible(true);
        financeiro.setLocationRelativeTo(null);
        financeiro.pack();
        /*Fecha a tela que estavamos*/
        this.dispose();
    }//GEN-LAST:event_botaoclienteActionPerformed

    private void botaocliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocliente1ActionPerformed
        /*Esse trecho de código corresponde ao botão voltar, quando acionado tende 
        a voltar a uma tela anterior*/
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        cliente.pack();
        /*Fecha a tela que estavamos*/
        this.dispose();
    }//GEN-LAST:event_botaocliente1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaocliente;
    private javax.swing.JButton botaocliente1;
    private javax.swing.JButton botaofuncionario;
    private javax.swing.JButton botaoreserva;
    private javax.swing.JButton botaosair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
