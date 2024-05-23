/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Student.ui;

import Business.Professor.model.Course;
import Business.Professor.model.ProfessorDirectory;
import Business.Student.model.Student;
import Business.Student.model.StudentDirectory;
import java.awt.CardLayout;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hemant
 */
public class CourseWorkJPanel extends javax.swing.JPanel {

     //This variable stores JPanel workAreaContainer
    private JPanel workAreaContainer;
    
    //This variable stores student directory
    private StudentDirectory studentDirectory;
    
      
    //This variable stores student
    private Student student;
    
    //This variable stores professor directory
    private ProfessorDirectory professorDirectory;
    /**
     * Creates new form CourseWorkJPanel
     */
    public CourseWorkJPanel(JPanel workAreaContainer,Student student,ProfessorDirectory professorDirectory) {
        initComponents();
          this.workAreaContainer=workAreaContainer;
        this.professorDirectory=professorDirectory;
        this.student=student;
        populateRegisteredCourses();
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

        setBackground(new java.awt.Color(204, 204, 204));

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CRN", "Course Name", "Start Date", "End Date", "Day", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        workAreaContainer.remove(this);
        CardLayout layout = (CardLayout) workAreaContainer.getLayout();
        layout.previous(workAreaContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourse;
    // End of variables declaration//GEN-END:variables

    private void populateRegisteredCourses() {
          DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();
        dtm.setRowCount(0);
        List<Course> allCourses = professorDirectory.getProfessorList().stream()
                .flatMap(professor -> professor.getCourseHistory().getCourseList().stream())
                //.filter(course -> student.getCoursesList().stream().anyMatch( course.getCRN()))
                .filter(course ->student.getCoursesList().contains(course.getCRN()))
//.filter(course -> (course.getCRN()==student.getCoursesList().get(0)))
                .collect(Collectors.toList());
        for(Course course : allCourses){
            Object[] row = new Object[6];
            row[0] = course.getCRN();
            row[1] = course;
            row[2] = course.getStartDate();
            row[3] = course.getEndDate();
            row[4] = course.getDay();
            row[5] = course.getTime();
            
            dtm.addRow(row);
        } 
    }
}