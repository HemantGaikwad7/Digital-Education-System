/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor.model;

import java.util.ArrayList;

/**
 *
 * @author Hemant
 */
public class CourseHistory {
    private  ArrayList<Course> courseList;

    public CourseHistory(){
    courseList=new ArrayList<Course>();
    }
    public  ArrayList<Course> getCourseList() {
        return courseList;
    }

    public  void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public void addCourse(Course course){
       
        courseList.add(course);
        }
    
     public void removeCourse(Course course){
       
        courseList.remove(course);
        }
    
}
