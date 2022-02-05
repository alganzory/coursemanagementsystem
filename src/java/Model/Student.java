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
public class Student implements java.io.Serializable{
    int studentID;
    String email;

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    String password;
    String firstName;
    String lastName;
    String matricNo;
    Double CGPA;
    List <Course> registeredCourses;
    int currentSemester;    
    Boolean isAdmin = false;

    public Student() {
    }

    public Student(String email, String password, String matricNo, String firstName, String lastName, int currentSemester) {
        this.email = email;
        this.password = password;
        this.matricNo = matricNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentSemester = currentSemester;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public String getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
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

    public Double getCGPA() {
        return CGPA;
    }

    public void setCGPA(Double CGPA) {
        this.CGPA = CGPA;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(List<Course> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }
    
    
}
