/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Employer;

import Business.Employer.EmployerModel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hemant
 */
public class EmployerUpdateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployerUpdateProfileJPanel
     */
    private JPanel workAreaContainer;
    private EmployerModel employer;

    public EmployerUpdateProfileJPanel(JPanel workAreaContainer, EmployerModel employer) {
        initComponents();
        this.workAreaContainer = workAreaContainer;
        this.employer = employer;

        txtEmployerName.setText(employer.getName());
        txtEmployerCompany.setText(employer.getCompany());
        txtEmployerDesignation.setText(employer.getDesignation());
        txtEmployerEmail.setText(employer.getEmailID());
        txtEmployerLocation.setText(employer.getLocation());
        txtEmployerUserId.setText(employer.getUsername());
        
        txtEmployerPassword.setText("(Password encrypted)");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        txtEmployerDesignation = new javax.swing.JTextField();
        lblEmployerLocation = new javax.swing.JLabel();
        txtEmployerName = new javax.swing.JTextField();
        txtEmployerLocation = new javax.swing.JTextField();
        lblEmployerCompany = new javax.swing.JLabel();
        txtEmployerCompany = new javax.swing.JTextField();
        lblEmployerDesignation = new javax.swing.JLabel();
        lblEmployerName = new javax.swing.JLabel();
        lblEmployerEmail = new javax.swing.JLabel();
        txtEmployerEmail = new javax.swing.JTextField();
        lblEmployerUserName = new javax.swing.JLabel();
        txtEmployerUserId = new javax.swing.JTextField();
        lblEmployerPassword = new javax.swing.JLabel();
        txtEmployerPassword = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtEmployerDesignation.setEnabled(false);
        txtEmployerDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerDesignationActionPerformed(evt);
            }
        });

        lblEmployerLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployerLocation.setText("Location : ");

        txtEmployerName.setEnabled(false);
        txtEmployerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerNameActionPerformed(evt);
            }
        });

        txtEmployerLocation.setEnabled(false);
        txtEmployerLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerLocationActionPerformed(evt);
            }
        });

        lblEmployerCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployerCompany.setText("Company : ");

        txtEmployerCompany.setEnabled(false);
        txtEmployerCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerCompanyActionPerformed(evt);
            }
        });

        lblEmployerDesignation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployerDesignation.setText("Designation : ");

        lblEmployerName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployerName.setText("Name : ");

        lblEmployerEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployerEmail.setText("E-mail Id : ");

        txtEmployerEmail.setEnabled(false);
        txtEmployerEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerEmailActionPerformed(evt);
            }
        });

        lblEmployerUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployerUserName.setText("User Name : ");

        txtEmployerUserId.setEnabled(false);
        txtEmployerUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerUserIdActionPerformed(evt);
            }
        });

        lblEmployerPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployerPassword.setText("Password : ");

        txtEmployerPassword.setEnabled(false);
        txtEmployerPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmployerPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmployerPasswordFocusLost(evt);
            }
        });
        txtEmployerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployerPasswordActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmployerName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmployerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmployerLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployerName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployerLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmployerCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtEmployerCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmployerDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmployerUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployerUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployerDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmployerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtEmployerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployerName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployerCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployerLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployerDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmployerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEmployerDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerDesignationActionPerformed

    private void txtEmployerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerNameActionPerformed

    private void txtEmployerLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerLocationActionPerformed

    private void txtEmployerCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerCompanyActionPerformed

    private void txtEmployerEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerEmailActionPerformed

    private void txtEmployerUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerUserIdActionPerformed

    private void txtEmployerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployerPasswordActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!isValidPassword(txtEmployerPassword.getText())) {
            JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long, include at least 1 special character and 1 number.");
            return;
        }
        
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);

        employer.setName(txtEmployerCompany.getText());
        employer.setCompany(txtEmployerCompany.getText());
        employer.setDesignation(txtEmployerDesignation.getText());
        employer.setEmailID(txtEmployerEmail.getText());
        employer.setUsername(txtEmployerUserId.getText());
        employer.setPassword(txtEmployerPassword.getText());

        txtEmployerName.setEnabled(false);
        txtEmployerCompany.setEnabled(false);
        txtEmployerDesignation.setEnabled(false);
        txtEmployerEmail.setEnabled(false);
        txtEmployerLocation.setEnabled(false);
        txtEmployerUserId.setEnabled(false);
        txtEmployerPassword.setEnabled(false);

        txtEmployerPassword.setText("(Password encrypted)");
        
        
        JOptionPane.showMessageDialog(null, "Data updated!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);

        txtEmployerName.setEnabled(true);
        txtEmployerCompany.setEnabled(true);
        txtEmployerDesignation.setEnabled(true);
        txtEmployerEmail.setEnabled(true);
        txtEmployerLocation.setEnabled(true);
        txtEmployerUserId.setEnabled(true);
        txtEmployerPassword.setEnabled(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtEmployerPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployerPasswordFocusGained
        // TODO add your handling code here:
        if (txtEmployerPassword.getText().equals("(Password encrypted)")) {
                    txtEmployerPassword.setText("");
        }
    }//GEN-LAST:event_txtEmployerPasswordFocusGained

    private void txtEmployerPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmployerPasswordFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmployerPasswordFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEmployerCompany;
    private javax.swing.JLabel lblEmployerDesignation;
    private javax.swing.JLabel lblEmployerEmail;
    private javax.swing.JLabel lblEmployerLocation;
    private javax.swing.JLabel lblEmployerName;
    private javax.swing.JLabel lblEmployerPassword;
    private javax.swing.JLabel lblEmployerUserName;
    private javax.swing.JTextField txtEmployerCompany;
    private javax.swing.JTextField txtEmployerDesignation;
    private javax.swing.JTextField txtEmployerEmail;
    private javax.swing.JTextField txtEmployerLocation;
    private javax.swing.JTextField txtEmployerName;
    private javax.swing.JTextField txtEmployerPassword;
    private javax.swing.JTextField txtEmployerUserId;
    // End of variables declaration//GEN-END:variables

    private boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }
        boolean hasNum = password.matches(".*\\d.*");
        boolean hasSpecial = !password.matches("[A-Za-z0-9]*");
        return hasNum && hasSpecial;
    }
}
