/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.sunrisedental.ui;
import com.sunrisedental.client.AppointmentPort;
import com.sunrisedental.client.ServiceClient;
import com.sunrisedental.web.dto.ServiceResponse;
/**
 *
 * @author my pc
 */
public class AppointmentFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AppointmentFrame.class.getName());

    /**
     * Creates new form AppointmentFrame
     */
    public AppointmentFrame() {
        initComponents();
        
         pn1Appointment.setBackground(new java.awt.Color(240, 248, 249));

    
    lblTitle.setForeground(new java.awt.Color(20, 76, 84));
    lblTitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 22));

    
    lblPatientName.setForeground(new java.awt.Color(35, 65, 70));
    lblAddress.setForeground(new java.awt.Color(35, 65, 70));
    lblContact.setForeground(new java.awt.Color(35, 65, 70));
    lblDentist.setForeground(new java.awt.Color(35, 65, 70));
    lblTreatment.setForeground(new java.awt.Color(35, 65, 70));
    lblDate.setForeground(new java.awt.Color(35, 65, 70));
    lblTime.setForeground(new java.awt.Color(35, 65, 70));

    lblPatientName.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    lblAddress.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
     lblContact.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
      lblDentist.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
       lblTreatment.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        lblDate.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        lblTime.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));

  
    txtPatientName.setBackground(java.awt.Color.WHITE);
    txtPatientName.setForeground(new java.awt.Color(35, 55, 60));
    txtPatientName.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    txtPatientName.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );

    txtAddress.setBackground(java.awt.Color.WHITE);
    txtAddress.setForeground(new java.awt.Color(35, 55, 60));
    txtAddress.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    txtAddress.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );
    
      txtContact.setBackground(java.awt.Color.WHITE);
    txtContact.setForeground(new java.awt.Color(35, 55, 60));
    txtContact.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    txtContact.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );
    
    
      cmbDentist.setBackground(java.awt.Color.WHITE);
    cmbDentist.setForeground(new java.awt.Color(35, 55, 60));
    cmbDentist.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    cmbDentist.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );
    
    
      cmbTreatment.setBackground(java.awt.Color.WHITE);
    cmbTreatment.setForeground(new java.awt.Color(35, 55, 60));
    cmbTreatment.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    cmbTreatment.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );
    
    
      txtDate.setBackground(java.awt.Color.WHITE);
    txtDate.setForeground(new java.awt.Color(35, 55, 60));
    txtDate.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    txtDate.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );
    
    
      txtTime.setBackground(java.awt.Color.WHITE);
    txtTime.setForeground(new java.awt.Color(35, 55, 60));
    txtTime.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
    txtTime.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );

  
    btnBack.setBackground(new java.awt.Color(20, 126, 137));
    btnBack.setForeground(java.awt.Color.WHITE);
    btnBack.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    btnBack.setFocusPainted(false);
    btnBack.setBorderPainted(false);
    btnBack.setOpaque(true);

    
    btnClear.setBackground(java.awt.Color.WHITE);
    btnClear.setForeground(new java.awt.Color(20, 100, 110));
    btnClear.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
    btnClear.setFocusPainted(false);
    btnClear.setBorder(
        javax.swing.BorderFactory.createLineBorder(
            new java.awt.Color(170, 205, 208), 1
        )
    );
    btnClear.setOpaque(true);

    
    btnSave.setBackground(new java.awt.Color(214, 239, 241));
    btnSave.setForeground(new java.awt.Color(20, 100, 110));
    btnSave.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));
    btnSave.setFocusPainted(false);
    btnSave.setBorderPainted(false);
    btnSave.setOpaque(true);

   
    lblMessage.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 13));

    setTitle("Sunrise Dental Clinic - Login");
    setResizable(false);
    setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn1Appointment = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblDentist = new javax.swing.JLabel();
        lblTreatment = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        cmbDentist = new javax.swing.JComboBox<>();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        cmbTreatment = new javax.swing.JComboBox<>();
        lblTime = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn1Appointment.setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("BOOK APPOINTMENT");

        lblPatientName.setText("Patient Name");

        lblContact.setText("Contact Number");

        lblDentist.setText("Dentist");

        lblTreatment.setText("Treatment");

        lblDate.setText("Date");

        txtContact.addActionListener(this::txtContactActionPerformed);

        cmbDentist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Dentist", "Dr. Silva", "Dr. Perera", "Dr. Fernando" }));

        txtDate.addActionListener(this::txtDateActionPerformed);

        txtTime.addActionListener(this::txtTimeActionPerformed);

        cmbTreatment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Treatment", "Cleaning", "Filling", "Extraction", "Root Canal", "Checkup", " " }));
        cmbTreatment.addActionListener(this::cmbTreatmentActionPerformed);

        lblTime.setText("Time");

        btnSave.setBackground(new java.awt.Color(0, 102, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE APPOINTMENT");
        btnSave.addActionListener(this::btnSaveActionPerformed);

        btnClear.setBackground(new java.awt.Color(0, 102, 255));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(this::btnClearActionPerformed);

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(this::btnBackActionPerformed);

        lblMessage.setForeground(new java.awt.Color(255, 0, 51));

        lblAddress.setText("Address");

        javax.swing.GroupLayout pn1AppointmentLayout = new javax.swing.GroupLayout(pn1Appointment);
        pn1Appointment.setLayout(pn1AppointmentLayout);
        pn1AppointmentLayout.setHorizontalGroup(
            pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1AppointmentLayout.createSequentialGroup()
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn1AppointmentLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn1AppointmentLayout.createSequentialGroup()
                            .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pn1AppointmentLayout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(54, 54, 54))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn1AppointmentLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblContact, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblDentist, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave))
                                    .addGap(43, 43, 43)))
                            .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBack)
                                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatientName)
                                    .addComponent(txtContact)
                                    .addComponent(cmbDentist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDate)
                                    .addComponent(txtTime)
                                    .addComponent(cmbTreatment, 0, 156, Short.MAX_VALUE)
                                    .addComponent(txtAddress))
                                .addGroup(pn1AppointmentLayout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(btnClear))))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pn1AppointmentLayout.setVerticalGroup(
            pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn1AppointmentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addGap(18, 18, 18)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbDentist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn1AppointmentLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblDentist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTime)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(pn1AppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblMessage)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1Appointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn1Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
          String patientName = txtPatientName.getText().trim();
    String address = txtAddress.getText().trim();
    String contact = txtContact.getText().trim();

    String dentist = cmbDentist.getSelectedItem() == null
            ? ""
            : cmbDentist.getSelectedItem().toString().trim();

    String treatment = cmbTreatment.getSelectedItem() == null
            ? ""
            : cmbTreatment.getSelectedItem().toString().trim();

    String date = txtDate.getText().trim();
    String time = txtTime.getText().trim();

    
    if (patientName.isEmpty()) {
        lblMessage.setText("Please enter patient name.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please enter patient name.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        txtPatientName.requestFocus();
        return;
    }

    if (address.isEmpty()) {
        lblMessage.setText("Please enter address.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please enter address.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        txtAddress.requestFocus();
        return;
    }

    if (contact.isEmpty()) {
        lblMessage.setText("Please enter contact number.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please enter contact number.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        txtContact.requestFocus();
        return;
    }

    // Contact number validation
    if (!contact.matches("\\d{10}")) {
        lblMessage.setText("Enter a valid 10-digit contact number.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Enter a valid 10-digit contact number.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        txtContact.requestFocus();
        return;
    }

    // Dentist validation
    if (dentist.isEmpty() || dentist.equalsIgnoreCase("Select Dentist")) {
        lblMessage.setText("Please select a dentist.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please select a dentist.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        cmbDentist.requestFocus();
        return;
    }

    
    if (treatment.isEmpty() || treatment.equalsIgnoreCase("Select Treatment")) {
        lblMessage.setText("Please select a treatment.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please select a treatment.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        cmbTreatment.requestFocus();
        return;
    }

   
    if (date.isEmpty()) {
        lblMessage.setText("Please enter appointment date.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please enter appointment date.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        txtDate.requestFocus();
        return;
    }

  
    if (time.isEmpty()) {
        lblMessage.setText("Please enter appointment time.");
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Please enter appointment time.",
                "Validation Error",
                javax.swing.JOptionPane.WARNING_MESSAGE
        );
        txtTime.requestFocus();
        return;
    }


    try {

        AppointmentPort appointmentService =
                ServiceClient.appointments();

        ServiceResponse response =
                appointmentService.registerAppointment(
                        patientName,
                        address,
                        contact,
                        dentist,
                        treatment,
                        date,
                        time
                );

        if (response.success) {

            lblMessage.setText(
                    "Appointment saved! ID: " + response.id
            );

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Appointment registered successfully!\n\n"
                    + "Appointment ID: " + response.id,
                    "Success",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE
            );

        } else {

            lblMessage.setText(response.message);

            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    response.message,
                    "Appointment Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }

    } catch (Exception e) {

        e.printStackTrace();

        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Could not save appointment.\n\n"
                + e.getMessage(),
                "Connection Error",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtPatientName.setText("");
        txtAddress.setText("");
    txtContact.setText("");
    cmbDentist.setSelectedIndex(0);
    cmbTreatment.setSelectedIndex(0);
    txtDate.setText("");
    txtTime.setText("");
    lblMessage.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DashboardFrame dashboard = new DashboardFrame();
    dashboard.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTreatmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTreatmentActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new AppointmentFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbDentist;
    private javax.swing.JComboBox<String> cmbTreatment;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDentist;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTreatment;
    private javax.swing.JPanel pn1Appointment;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
