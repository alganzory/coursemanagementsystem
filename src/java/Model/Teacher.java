/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Mohamed
 */
public class Teacher implements java.io.Serializable{
    int teacherID;
    String email;
    String password;
    String firstName;
    String lastName;
    List <Course> courses;
    List <Assignment> assignmentsToGrade;
    Boolean isAdmin = false;
    
    public Teacher() {
    }
    
    public Teacher(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }


    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Assignment> getAssignmentsToGrade() {
        return assignmentsToGrade;
    }

    public void setAssignmentsToGrade(List<Assignment> assignmentsToGrade) {
        this.assignmentsToGrade = assignmentsToGrade;
    }
    
    
    
}
