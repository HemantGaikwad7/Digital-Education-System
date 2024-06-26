/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Professor.ui;

import Business.Professor.model.Course;
import Business.Professor.model.CourseHistory;
import Business.Professor.model.Professor;
import Business.Professor.model.ProfessorDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hemant
 */
public class HistoryJPanel extends javax.swing.JPanel {

      //This variable stores JPanel workAreaContainer
    private JPanel workAreaContainer;
    
     //This variable stores course history
    private CourseHistory courseHistory;
    
        //This variable stores professor
    private Professor professor;
    
    /**
     * Creates new form ScheduleJPanel
     */
    public HistoryJPanel(JPanel workAreaContainer,Professor professor) {
        initComponents();
       // this.courseHistory=courseHistory;
       this.workAreaContainer = workAreaContainer;
        this.professor=professor;
        this.courseHistory=professor.getCourseHistory();
        populateCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtDay = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        btnUpdateCourse = new javax.swing.JButton();
        txtSearchCrn = new javax.swing.JTextField();
        lblCourseName = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        lblCrn = new javax.swing.JLabel();
        lblTime1 = new javax.swing.JLabel();
        lblDay = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        txtCrn = new javax.swing.JTextField();
        isCompleted = new javax.swing.JCheckBox();
        lblTime = new javax.swing.JLabel();
        btnViewDetials = new javax.swing.JButton();
        btnDeleteCourse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Start Date", "End Date", "Day", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourse);
        if (tblCourse.getColumnModel().getColumnCount() > 0) {
            tblCourse.getColumnModel().getColumn(0).setResizable(false);
            tblCourse.getColumnModel().getColumn(1).setResizable(false);
            tblCourse.getColumnModel().getColumn(2).setResizable(false);
            tblCourse.getColumnModel().getColumn(3).setResizable(false);
            tblCourse.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setText("<Back");
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

        btnUpdateCourse.setText("Update");
        btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCourseActionPerformed(evt);
            }
        });

        txtSearchCrn.setForeground(new java.awt.Color(204, 204, 204));

        lblCourseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCourseName.setText("Course Name:");

        lblEndDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEndDate.setText("End Date:");

        lblCrn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCrn.setText("CRN:");

        lblTime1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTime1.setText("Completed:");

        lblDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDay.setText("Day:");

        lblStartDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStartDate.setText("Start Date:");

        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTime.setText("Time:");

        btnViewDetials.setText("View Details");
        btnViewDetials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetialsActionPerformed(evt);
            }
        });

        btnDeleteCourse.setText("Delete Course");
        btnDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCourseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("View/ udate history");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(lblCrn)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtCrn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTime)
                                            .addComponent(lblCourseName)
                                            .addComponent(lblStartDate)
                                            .addComponent(lblEndDate)
                                            .addComponent(lblDay)
                                            .addComponent(lblTime1))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(isCompleted))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtSearchCrn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDetials, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnViewDetials, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearchCrn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCrn)
                    .addComponent(btnUpdateCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourseName)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndDate)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDay)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTime1)
                    .addComponent(isCompleted))
                .addGap(118, 118, 118))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //Validation part

        int crn = Integer.parseInt(txtSearchCrn.getText());
        ArrayList<Course> filteredCourses= (courseHistory.getCourseList().stream()
            .filter(course -> course.getCRN()==crn && !course.getCompleted())
            .collect(Collectors.toCollection(ArrayList::new)));
        if(filteredCourses.isEmpty()){
            JOptionPane.showMessageDialog(null, "Course with CRN "+crn+" does not exist!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else{
            txtCrn.setText(String.valueOf(filteredCourses.get(0).getCRN()));
            txtCourseName.setText(filteredCourses.get(0).getCourseName());
            txtStartDate.setText(filteredCourses.get(0).getStartDate());
            txtEndDate.setText(filteredCourses.get(0).getEndDate());
            txtDay.setText(filteredCourses.get(0).getDay());
            txtTime.setText(filteredCourses.get(0).getTime());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
        String crn = txtCrn.getText();
        String courseName = txtCourseName.getText();
        String startDate = txtStartDate.getText();
        String endDate = txtEndDate.getText();
        String day = txtDay.getText();
        String time = txtTime.getText();
        Boolean completed=isCompleted.isSelected();

        CourseHistory courses = professor.getCourseHistory();

// Use Java Streams to filter the courses based on CRN
Optional<Course> optionalCourse = courses.getCourseList().stream()
        .filter(course -> course.getCRN() == Integer.parseInt(crn))
        .findFirst();

if (optionalCourse.isPresent()) {
    // The course with the specified CRN exists, update it
    Course existingCourse = optionalCourse.get();
    existingCourse.setCourseName(courseName);
    existingCourse.setStartDate(startDate);
    existingCourse.setEndDate(endDate);
    existingCourse.setDay(day);
    existingCourse.setTime(time);
    existingCourse.setCompleted(completed);
} else {
    // The course with the specified CRN doesn't exist, create a new one
    Course course = new Course();
    course.setCRN(Integer.parseInt(crn));
    course.setCourseName(courseName);
    course.setStartDate(startDate);
    course.setEndDate(endDate);
    course.setDay(day);
    course.setTime(time);
    course.setCompleted(completed);

    // Add the new course to the CourseHistory
    professor.getCourseHistory().addCourse(course);
}
        professor.setCourseHistory(courseHistory);
        txtCourseName.setText("");
        txtStartDate.setText("");
        txtEndDate.setText("");
        txtDay.setText("");
        txtTime.setText("");
        txtCrn.setText("");
        isCompleted.setSelected(false);
        populateCourses();
    }//GEN-LAST:event_btnUpdateCourseActionPerformed

    private void btnViewDetialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetialsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCourse.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Course result = (Course) tblCourse.getValueAt(selectedRow, 0);
            txtCrn.setText(String.valueOf(result.getCRN()));
            txtCourseName.setText(result.getCourseName());
            txtStartDate.setText(result.getStartDate());
            txtEndDate.setText(result.getEndDate());
            txtDay.setText(result.getDay());
            txtTime.setText(result.getTime());

        }
    }//GEN-LAST:event_btnViewDetialsActionPerformed

    private void btnDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCourseActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCourse.getSelectedRow();
        if(selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Course course = (Course) tblCourse.getValueAt(selectedRow, 0);
                courseHistory.removeCourse(course);
                JOptionPane.showConfirmDialog(null, "Course Successfully Removed!", "Information", JOptionPane.INFORMATION_MESSAGE);
                populateCourses();
            }
        }else{
            JOptionPane.showConfirmDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCourse;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateCourse;
    private javax.swing.JButton btnViewDetials;
    private javax.swing.JCheckBox isCompleted;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCrn;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtCrn;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtSearchCrn;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    private void populateCourses() {
           DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();
        dtm.setRowCount(0);
         ArrayList<Course> filteredCourses = (ArrayList<Course>) courseHistory.getCourseList().stream()
                .filter(course -> course.getCompleted()==true)
                .collect(Collectors.toList());
        for(Course course : filteredCourses){
            Object[] row = new Object[5];
            row[0] = course;
            row[1] = course.getStartDate();
            row[2] = course.getEndDate();
            row[3] = course.getDay();
            row[4] = course.getTime();
            
            dtm.addRow(row);
        } }
}
