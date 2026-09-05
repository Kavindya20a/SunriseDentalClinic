/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sunrisedental.ui;

import com.sunrisedental.client.ServiceClient;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author my pc
 */
public class RegisterFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegisterFrame.class.getName());

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        pn1Patient = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("SUNRISE DENTAL CLINIC");

        lblSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubtitle.setText("CREATE ACCOUNT");

        lblUsername.setText("Username");

        lblEmail.setText("Email");

        lblPassword.setText("Password");

        btnClear.setBackground(new java.awt.Color(0, 102, 204));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(this::btnClearActionPerformed);

        btnRegister.setBackground(new java.awt.Color(0, 102, 204));
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(this::btnRegisterActionPerformed);

        btnBack.setBackground(new java.awt.Color(0, 102, 204));
        btnBack.setText("BACK");
        btnBack.addActionListener(this::btnBackActionPerformed);

        javax.swing.GroupLayout pn1PatientLayout = new javax.swing.GroupLayout(pn1Patient);
        pn1Patient.setLayout(pn1PatientLayout);
        pn1PatientLayout.setHorizontalGroup(
            pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1PatientLayout.createSequentialGroup()
                .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1PatientLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn1PatientLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear))
                        .addGap(24, 24, 24)
                        .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmail)
                                .addComponent(txtPassword)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn1PatientLayout.createSequentialGroup()
                                .addComponent(btnRegister)
                                .addGap(29, 29, 29)
                                .addComponent(btnBack))))
                    .addGroup(pn1PatientLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        pn1PatientLayout.setVerticalGroup(
            pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1PatientLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(26, 26, 26)
                .addComponent(lblSubtitle)
                .addGap(41, 41, 41)
                .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pn1PatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnRegister)
                    .addComponent(btnBack))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1Patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1Patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          Loginframe login = new Loginframe();
    login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       
   String username = txtUsername.getText().trim();
    String email = txtEmail.getText().trim();
    String password = txtPassword.getText().trim();

  
    if (username.isEmpty()
            || email.isEmpty()
            || password.isEmpty()) {

        JOptionPane.showMessageDialog(
                this,
                "Please fill in all fields."
        );

        return;
    }
    
    if (!email.matches(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

        JOptionPane.showMessageDialog(
                this,
                "Please enter a valid email address."
        );

        return;
    }

 if (password.length() < 5) {

        JOptionPane.showMessageDialog(
                this,
                "Password must contain at least 5 characters."
        );

        return;
    }


    try {

        boolean success = ServiceClient.auth().register(
                username,
                email,
                password        
        );


        if (success) {

            JOptionPane.showMessageDialog(
                    this,
                    "Registration successful!"
            );

            txtUsername.setText("");
            txtEmail.setText("");
            txtPassword.setText("");
           

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Registration failed. Username may already exist."
            );
        }

    } catch (HeadlessException e) {

        JOptionPane.showMessageDialog(
                this,
                "Unable to connect to Auth Web Service.\n"
                + e.getMessage()
        );

        e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
         txtUsername.setText("");
    txtEmail.setText("");
    txtPassword.setText("");
    
    }//GEN-LAST:event_btnClearActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new RegisterFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pn1Patient;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
