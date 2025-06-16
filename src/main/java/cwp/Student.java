/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cwp;

/**
 *
 * @author LUTS
 */
public class Student extends User {
    private final String studentId;
    private String programOfStudy;
    private int yearOfStudy;

    public Student(String userId, String name, String email, String phoneNumber,
                   String studentId, String programOfStudy, int yearOfStudy) {
        super(userId, name, email, phoneNumber);
        this.studentId = studentId;
        this.programOfStudy = programOfStudy;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public void performUserAction() {
        System.out.println(getName() + " (Student) is viewing their transport schedule and booking options.");
        
    }

    
    public String getStudentId() {
        return studentId;
    }

    public String getProgramOfStudy() {
        return programOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    
    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", Program: " + programOfStudy +
               ", Year: " + yearOfStudy;
    }
}
    

