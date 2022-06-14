/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventory.management.view;

import inventory.management.controller.UserController;
import inventory.management.model.User;

/**
 *
 * @author MONARIS
 */
public class FrmCadUser extends javax.swing.JFrame {

    /** Creates new form FrmCadastro */
    public FrmCadUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeAplicacao = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lblSenha2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordConfir = new javax.swing.JPasswordField();
        jCheckBoxShowPassword = new javax.swing.JCheckBox();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblCadastrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNomeAplicacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNomeAplicacao.setText("Inventory Management");

        lblEmail.setText("Email:");

        lblSenha1.setText("Senha:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblSenha2.setText("Senha:");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPasswordConfir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jCheckBoxShowPassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jCheckBoxShowPassword.setText("Mostrar palavra-passe");
        jCheckBoxShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxShowPasswordMouseClicked(evt);
            }
        });
        jCheckBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPasswordActionPerformed(evt);
            }
        });

        lblName.setText("Nome:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCadastrar.setForeground(new java.awt.Color(0, 51, 255));
        lblCadastrar.setText("Já possuo conta");
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(txtNomeAplicacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEmail)
                                            .addComponent(lblName)))
                                    .addComponent(lblSenha2)
                                    .addComponent(lblSenha1))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtPasswordConfir)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBoxShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCadastrar)
                                        .addComponent(lblCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtNomeAplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordConfir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha2))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxShowPassword)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCadastrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        User user = new User();
        UserController userControll = new UserController();
        
        user.setName(txtEmail.getText());
        user.setEmail(txtName.getText());
        user.setPassword(String.valueOf(txtPassword.getPassword()));
        String senhaConfir = String.valueOf(txtPasswordConfir.getPassword());
        
        userControll.actionUserCadControll(user, senhaConfir);
        new FrmLoginUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jCheckBoxShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordMouseClicked
        if(jCheckBoxShowPassword.isSelected() == true){
            jCheckBoxShowPassword.setSelected(true);
            txtPassword.setEchoChar('\u0000');
            txtPasswordConfir.setEchoChar('\u0000');       
        }else{
            jCheckBoxShowPassword.setSelected(false);
            txtPassword.setEchoChar('\u2022');
            txtPasswordConfir.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_jCheckBoxShowPasswordMouseClicked

    private void jCheckBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordActionPerformed

    }//GEN-LAST:event_jCheckBoxShowPasswordActionPerformed

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        new FrmLoginUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCadastrarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox jCheckBoxShowPassword;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblSenha2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtNomeAplicacao;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordConfir;
    // End of variables declaration//GEN-END:variables

}
