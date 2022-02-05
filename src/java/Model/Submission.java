/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class Submission implements java.io.Serializable{
    
    int submissionID;
    int assignmentID;
    int studentID;
    Double maxMarks;
    Double marks;
    LocalDateTime submissionDateTime;
    Boolean isGraded;
    String comments;
    String answer;

    public Submission() {
    }

    public Submission(int assignmentID, int studentID, LocalDateTime submissionDateTime, Boolean isGraded, String answer) {
        this.assignmentID = assignmentID;
        this.studentID = studentID;
        this.submissionDateTime = submissionDateTime;
        this.isGraded = isGraded;
        this.answer = answer;
    }

    public int getSubmissionID() {
        return submissionID;
    }

    public void setSubmissionID(int submissionID) {
        this.submissionID = submissionID;
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Double getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(Double maxMarks) {
        this.maxMarks = maxMarks;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public LocalDateTime getSubmissionDateTime() {
        return submissionDateTime;
    }

    public void setSubmissionDateTime(LocalDateTime submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }

    public Boolean getIsGraded() {
        return isGraded;
    }

    public void setIsGraded(Boolean isGraded) {
        this.isGraded = isGraded;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFilePath() {
        return answer;
    }

    public void setFilePath(String filePath) {
        this.answer = filePath;
    }
    
    
    
}
