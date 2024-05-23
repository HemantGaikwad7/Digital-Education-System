/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.Admin;

import Business.Student.model.StudentDirectory;
import Business.Student.model.Student;
import java.awt.CardLayout;
import java.awt.Color;
import java.security.MessageDigest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hemant
 */
public class AdminUpdateStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminUpdateStudentJPanel
     */
    private JPanel workAreaContainer;
    private StudentDirectory studentDirectory;
    private int selectedRowIndex = -1;
    private String originalNUID;

    public AdminUpdateStudentJPanel(JPanel workAreaContainer, StudentDirectory studentDirectory) {
        initComponents();
        this.studentDirectory = studentDirectory;
        this.workAreaContainer = workAreaContainer;

        populateStudentList();

        // Initialize placeholder for password field
        txtStudentPassword.setText("(Password encrypted)");
        txtStudentPassword.setEchoChar((char) 0); // To make the placeholder visible as plain text

        txtStudentPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (txtStudentPassword.getText().equals("(Password encrypted)")) {
                    txtStudentPassword.setText("");
                    txtStudentPassword.setEchoChar('*'); // Set to your preferred echo char
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (txtStudentPassword.getText().isEmpty()) {
                    txtStudentPassword.setText("(Password encrypted)");
                    txtStudentPassword.setEchoChar((char) 0);
                }
            }
        });

        // Add a ListSelectionListener to the table
        tblStudent.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                selectedRowIndex = tblStudent.getSelectedRow();
                // Optionally, you can also load the selected student data into the input fields here
                if (selectedRowIndex != -1) {
                    Student selectedStudent = (Student) tblStudent.getValueAt(selectedRowIndex, 0);

                    // Load data into fields
                    txtStudentName.setText(selectedStudent.getName());
                    txtStudentAge.setText(selectedStudent.getAge());
                    txtStudentGender.setText(selectedStudent.getGender());
                    txtStudentEmail.setText(selectedStudent.getEmail());
                    txtStudentContact.setText(selectedStudent.getContact());
                    txtStudentTerm.setText(selectedStudent.getAdmissionTerm());
                    txtStudentProgram.setText(selectedStudent.getProgram());
                    txtStudentNUID.setText(selectedStudent.getNUID());
                    txtStudentUserName.setText(selectedStudent.getUsername());
//    txtStudentPassword.setText(selectedStudent.getPassword());
                    txtStudentAddress.setText(selectedStudent.getAddress());
                    txtStudentCity.setText(selectedStudent.getCity());
                    txtStudentState.setText(selectedStudent.getState());
                    txtStudentCountry.setText(selectedStudent.getCountry());
                    txtStudentCode.setText(String.valueOf(selectedStudent.getCode()));

                    // Set password field to placeholder text
                    txtStudentPassword.setText("(Password encrypted)");
                    txtStudentPassword.setEchoChar((char) 0); // To make the placeholder visible as plain text

                }
            }
        });

    }

    private boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }
        boolean hasNum = password.matches(".*\\d.*");
        boolean hasSpecial = !password.matches("[A-Za-z0-9]*");
        return hasNum && hasSpecial;
    }

    private void disableAndClearFields() {
        txtStudentName.setEnabled(false);
        txtStudentAge.setEnabled(false);
        txtStudentGender.setEnabled(false);
        txtStudentEmail.setEnabled(false);
        txtStudentContact.setEnabled(false);
        txtStudentTerm.setEnabled(false);
        txtStudentProgram.setEnabled(false);
        txtStudentUserName.setEnabled(false);
        txtStudentPassword.setEnabled(false);
        txtStudentNUID.setEnabled(false);
        txtStudentAddress.setEnabled(false);
        txtStudentCity.setEnabled(false);
        txtStudentState.setEnabled(false);
        txtStudentCode.setEnabled(false);
        txtStudentCountry.setEnabled(false);

        txtStudentName.setText("");
        txtStudentAge.setText("");
        txtStudentGender.setText("");
        txtStudentEmail.setText("");
        txtStudentContact.setText("");
        txtStudentTerm.setText("");
        txtStudentProgram.setText("");
        txtStudentNUID.setText("");
        txtStudentUserName.setText("");
        txtStudentPassword.setText("");
        txtStudentAddress.setText("");
        txtStudentCity.setText("");
        txtStudentState.setText("");
        txtStudentCountry.setText("");
        txtStudentCode.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        txtSearchNUID = new javax.swing.JTextField();
        lblStudentName = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        lblStudentAge = new javax.swing.JLabel();
        txtStudentAge = new javax.swing.JTextField();
        lblStudentGender = new javax.swing.JLabel();
        txtStudentGender = new javax.swing.JTextField();
        lblStudentEmail = new javax.swing.JLabel();
        txtStudentEmail = new javax.swing.JTextField();
        lblStudentContact = new javax.swing.JLabel();
        txtStudentContact = new javax.swing.JTextField();
        lblStudentTerm = new javax.swing.JLabel();
        txtStudentTerm = new javax.swing.JTextField();
        lblStudentProgram = new javax.swing.JLabel();
        txtStudentProgram = new javax.swing.JTextField();
        lblStudentNUID = new javax.swing.JLabel();
        txtStudentNUID = new javax.swing.JTextField();
        lblStudentUserName = new javax.swing.JLabel();
        txtStudentUserName = new javax.swing.JTextField();
        lblStudentPassword = new javax.swing.JLabel();
        lblStudentAddress = new javax.swing.JLabel();
        txtStudentAddress = new javax.swing.JTextField();
        lblStudentCity = new javax.swing.JLabel();
        txtStudentCity = new javax.swing.JTextField();
        lblStudentState = new javax.swing.JLabel();
        txtStudentState = new javax.swing.JTextField();
        lblStudentCountry = new javax.swing.JLabel();
        txtStudentCountry = new javax.swing.JTextField();
        lblStudentName13 = new javax.swing.JLabel();
        txtStudentCode = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtStudentPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 204));
        setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Student Profile");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "NUID", "Program", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudent);
        if (tblStudent.getColumnModel().getColumnCount() > 0) {
            tblStudent.getColumnModel().getColumn(0).setResizable(false);
            tblStudent.getColumnModel().getColumn(1).setResizable(false);
            tblStudent.getColumnModel().getColumn(2).setResizable(false);
            tblStudent.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDeleteStudent.setText("Delete profile");
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        txtSearchNUID.setForeground(new java.awt.Color(204, 204, 204));
        txtSearchNUID.setText("Enter NUID");
        txtSearchNUID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchNUIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchNUIDFocusLost(evt);
            }
        });

        lblStudentName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentName.setText("Name : ");

        txtStudentName.setEnabled(false);
        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });

        lblStudentAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentAge.setText("Age : ");

        txtStudentAge.setEnabled(false);
        txtStudentAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentAgeActionPerformed(evt);
            }
        });

        lblStudentGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentGender.setText("Gender : ");

        txtStudentGender.setEnabled(false);
        txtStudentGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentGenderActionPerformed(evt);
            }
        });

        lblStudentEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentEmail.setText("E-mail Id : ");

        txtStudentEmail.setEnabled(false);
        txtStudentEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentEmailActionPerformed(evt);
            }
        });

        lblStudentContact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentContact.setText("Contact Number : ");

        txtStudentContact.setEnabled(false);
        txtStudentContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentContactActionPerformed(evt);
            }
        });

        lblStudentTerm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentTerm.setText("Admission term : ");

        txtStudentTerm.setEnabled(false);
        txtStudentTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentTermActionPerformed(evt);
            }
        });

        lblStudentProgram.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentProgram.setText("Program : ");

        txtStudentProgram.setEnabled(false);
        txtStudentProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentProgramActionPerformed(evt);
            }
        });

        lblStudentNUID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentNUID.setText("NUID : ");

        txtStudentNUID.setEnabled(false);
        txtStudentNUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNUIDActionPerformed(evt);
            }
        });

        lblStudentUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentUserName.setText("User Name : ");

        txtStudentUserName.setEnabled(false);
        txtStudentUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentUserNameActionPerformed(evt);
            }
        });

        lblStudentPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentPassword.setText("Password : ");

        lblStudentAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentAddress.setText("Address : ");

        txtStudentAddress.setEnabled(false);
        txtStudentAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentAddressActionPerformed(evt);
            }
        });

        lblStudentCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentCity.setText("City : ");

        txtStudentCity.setEnabled(false);
        txtStudentCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentCityActionPerformed(evt);
            }
        });

        lblStudentState.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentState.setText("State : ");

        txtStudentState.setEnabled(false);
        txtStudentState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentStateActionPerformed(evt);
            }
        });

        lblStudentCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentCountry.setText("Country : ");

        txtStudentCountry.setEnabled(false);
        txtStudentCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentCountryActionPerformed(evt);
            }
        });

        lblStudentName13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStudentName13.setText("Code : ");

        txtStudentCode.setEnabled(false);
        txtStudentCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentCodeActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtStudentPassword.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(txtSearchNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblStudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblStudentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtStudentUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txtStudentNUID, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txtStudentProgram, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txtStudentTerm, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txtStudentPassword)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblStudentCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblStudentName13, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblStudentState, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblStudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblStudentCity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStudentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStudentCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStudentState, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStudentCity, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchNUID)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentState, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentName13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblStudent.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Student student = (Student) tblStudent.getValueAt(selectedRow, 0);
                studentDirectory.deleteStudent(student);
                JOptionPane.showMessageDialog(null, "Profile Successfully Deleted");
                txtStudentName.setText("");
                txtStudentAge.setText("");
                txtStudentGender.setText("");
                txtStudentEmail.setText("");
                txtStudentContact.setText("");
                txtStudentTerm.setText("");
                txtStudentProgram.setText("");
                txtStudentUserName.setText("");
                txtStudentPassword.setText("");
                txtStudentNUID.setText("");
                txtStudentAddress.setText("");
                txtStudentCity.setText("");
                txtStudentState.setText("");
                txtStudentCountry.setText("");
                txtStudentCode.setText("");
                populateStudentList();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void txtStudentAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentAgeActionPerformed

    private void txtStudentGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentGenderActionPerformed

    private void txtStudentEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentEmailActionPerformed

    private void txtStudentContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentContactActionPerformed

    private void txtStudentTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentTermActionPerformed

    private void txtStudentProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentProgramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentProgramActionPerformed

    private void txtStudentNUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNUIDActionPerformed

    private void txtStudentUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentUserNameActionPerformed

    private void txtStudentAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentAddressActionPerformed

    private void txtStudentCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentCityActionPerformed

    private void txtStudentStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentStateActionPerformed

    private void txtStudentCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentCountryActionPerformed

    private void txtStudentCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentCodeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //Validation part

        // Check if the search field is empty
        String nuid = (String) txtSearchNUID.getText();
        if (nuid.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an NUID to search.");
            return;
        }

        // Search for the student
        Student result = studentDirectory.searchStudent(nuid);
        if (result == null) {
            JOptionPane.showMessageDialog(null, "NUID does not exist.");
            return;
        } //        if(txtSearchNUID == null){
        //            JOptionPane.showMessageDialog(null, "NUID does not exist!");
        //        }
        else {
            txtStudentName.setText(result.getName());
            txtStudentAge.setText(result.getAge());
            txtStudentGender.setText(result.getGender());
            txtStudentEmail.setText(result.getEmail());
            txtStudentContact.setText(result.getContact());
            txtStudentTerm.setText(result.getAdmissionTerm());
            txtStudentProgram.setText(result.getProgram());
            txtStudentUserName.setText(result.getUsername());
//            txtStudentPassword.setText(result.getPassword());
            txtStudentNUID.setText(result.getNUID());
            txtStudentAddress.setText(result.getAddress());
            txtStudentCity.setText(result.getCity());
            txtStudentState.setText(result.getState());
            txtStudentCountry.setText(result.getCountry());
            txtStudentCode.setText(String.valueOf(result.getCode()));

            txtStudentPassword.setText("(Password encrypted)");
            txtStudentPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);

        if (selectedRowIndex >= 0) {
            Student studentToUpdate = (Student) tblStudent.getValueAt(selectedRowIndex, 0);

            originalNUID = studentToUpdate.getNUID();
            txtStudentName.setEnabled(true);
            txtStudentAge.setEnabled(true);
            txtStudentGender.setEnabled(true);
            txtStudentEmail.setEnabled(true);
            txtStudentContact.setEnabled(true);
            txtStudentTerm.setEnabled(true);
            txtStudentProgram.setEnabled(true);
            txtStudentUserName.setEnabled(true);
            txtStudentPassword.setEnabled(true);
            txtStudentNUID.setEnabled(true);
            txtStudentAddress.setEnabled(true);
            txtStudentCity.setEnabled(true);
            txtStudentState.setEnabled(true);
            txtStudentCode.setEnabled(true);
            txtStudentCountry.setEnabled(true);

            // Clear password field and set echo character for password hiding
            txtStudentPassword.setText("");
            txtStudentPassword.setEchoChar('*');
        } else {
            JOptionPane.showMessageDialog(null, "Please select a student to update.");
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        String name = txtStudentName.getText();
        String age = txtStudentAge.getText();
        String gender = txtStudentGender.getText();
        String email = txtStudentEmail.getText();
        String contact = txtStudentContact.getText();
        String admissionTerm = txtStudentTerm.getText();
        String NUID = txtStudentNUID.getText();
        String username = txtStudentUserName.getText();
        String password = txtStudentPassword.getText();
        String address = txtStudentAddress.getText();
        String city = txtStudentCity.getText();
        String state = txtStudentState.getText();
        String country = txtStudentCountry.getText();
//         int code = Integer.parseInt(txtStudentCode.getText());
        String program = txtStudentProgram.getText();

        if (name.isEmpty() || age.isEmpty() || gender.isEmpty() || email.isEmpty() || contact.isEmpty()
                || admissionTerm.isEmpty() || NUID.isEmpty() || username.isEmpty() || password.isEmpty()
                || address.isEmpty() || city.isEmpty() || state.isEmpty() || country.isEmpty() || program.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }

        // Parse the code only if it's not empty
        int code = 0;
        if (!txtStudentCode.getText().isEmpty()) {
            try {
                code = Integer.parseInt(txtStudentCode.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for the code.");
                return;
            }
        }

        if (!isValidPassword(password)) {
            JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long, include at least 1 special character and 1 number.");
            return;
        }

        // Hash the password before storing it
//    String hashedPassword = hashPassword(password);
// Check if NUID already exists
        Student existingStudent = studentDirectory.searchStudent(NUID);
        if (existingStudent != null && !NUID.equals(originalNUID)) {
            JOptionPane.showMessageDialog(null, "NUID already exists. Please use a different NUID.");
            btnUpdate.setEnabled(false);
            return;
        } else {
            if (selectedRowIndex >= 0) {
                // Get the selected student
                Student studentToUpdate = (Student) tblStudent.getValueAt(selectedRowIndex, 0);

                // Update student details
                studentToUpdate.setName(name);
                studentToUpdate.setAge(age);
                studentToUpdate.setGender(gender);
                studentToUpdate.setEmail(email);
                studentToUpdate.setContact(contact);
                studentToUpdate.setAdmissionTerm(admissionTerm);
                studentToUpdate.setNUID(NUID);
                studentToUpdate.setUsername(username);
                studentToUpdate.setPassword(password);
                studentToUpdate.setAddress(address);
                studentToUpdate.setCity(city);
                studentToUpdate.setState(state);
                studentToUpdate.setCountry(country);
                studentToUpdate.setCode(code);
                studentToUpdate.setProgram(program);

                // Update the table
                updateStudentRowInTable(studentToUpdate);

                JOptionPane.showMessageDialog(null, "Student Profile Updated.");

                disableAndClearFields();
                btnSave.setEnabled(false);
                btnUpdate.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a student to update.");
            }

            // Reset password field to placeholder after saving
            txtStudentPassword.setText("(Password encrypted)");
            txtStudentPassword.setEchoChar((char) 0);

            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSearchNUIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNUIDFocusGained
        // TODO add your handling code here:
        if (txtSearchNUID.getText().equals("Enter NUID")) {
            txtSearchNUID.setText("");
            txtSearchNUID.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtSearchNUIDFocusGained

    private void txtSearchNUIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNUIDFocusLost
        // TODO add your handling code here:
        if (txtSearchNUID.getText().equals(null)) {
            txtSearchNUID.setText("Enter NUID");
            txtSearchNUID.setForeground(Color.GRAY);
    }//GEN-LAST:event_txtSearchNUIDFocusLost

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStudentAddress;
    private javax.swing.JLabel lblStudentAge;
    private javax.swing.JLabel lblStudentCity;
    private javax.swing.JLabel lblStudentContact;
    private javax.swing.JLabel lblStudentCountry;
    private javax.swing.JLabel lblStudentEmail;
    private javax.swing.JLabel lblStudentGender;
    private javax.swing.JLabel lblStudentNUID;
    private javax.swing.JLabel lblStudentName;
    private javax.swing.JLabel lblStudentName13;
    private javax.swing.JLabel lblStudentPassword;
    private javax.swing.JLabel lblStudentProgram;
    private javax.swing.JLabel lblStudentState;
    private javax.swing.JLabel lblStudentTerm;
    private javax.swing.JLabel lblStudentUserName;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtSearchNUID;
    private javax.swing.JTextField txtStudentAddress;
    private javax.swing.JTextField txtStudentAge;
    private javax.swing.JTextField txtStudentCity;
    private javax.swing.JTextField txtStudentCode;
    private javax.swing.JTextField txtStudentContact;
    private javax.swing.JTextField txtStudentCountry;
    private javax.swing.JTextField txtStudentEmail;
    private javax.swing.JTextField txtStudentGender;
    private javax.swing.JTextField txtStudentNUID;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JPasswordField txtStudentPassword;
    private javax.swing.JTextField txtStudentProgram;
    private javax.swing.JTextField txtStudentState;
    private javax.swing.JTextField txtStudentTerm;
    private javax.swing.JTextField txtStudentUserName;
    // End of variables declaration//GEN-END:variables

    private void updateStudentRowInTable(Student updatedStudent) {
        if (selectedRowIndex != -1) {
            DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
            dtm.setValueAt(updatedStudent, selectedRowIndex, 0); // Assumes student object is in column 0
            dtm.setValueAt(updatedStudent.getNUID(), selectedRowIndex, 1); // NUID in column 1
            dtm.setValueAt(updatedStudent.getProgram(), selectedRowIndex, 2); // Program in column 2
            dtm.setValueAt(updatedStudent.getEmail(), selectedRowIndex, 3); // Email in column 3
        }
    }

    private void populateStudentList() {
        DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
        dtm.setRowCount(0);
        for (Student student : studentDirectory.getStudentList()) {
            Object[] row = new Object[4];
            row[0] = student;
            row[1] = student.getNUID();
            row[2] = student.getProgram();
            row[3] = student.getEmail();

            dtm.addRow(row);
            
        }
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1"); // Consider using "SHA-256"
            md.update(password.getBytes());
            byte[] rbt = md.digest();
            StringBuilder pass = new StringBuilder();
            for (byte b : rbt) {
                pass.append(String.format("%02x", b));
            }
            return pass.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
