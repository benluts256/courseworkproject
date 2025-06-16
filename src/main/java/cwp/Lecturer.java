/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cwp;

/**
 *
 * @author LUTS
 */
public class Lecturer extends User {
    private String facultyId;
    private String department;

    public Lecturer(String userId, String name, String email, String phoneNumber,
                    String facultyId, String department) {
        super(userId, name, email, phoneNumber);
        this.facultyId = facultyId;
        this.department = department;
    }

    @Override
    public void performUserAction() {
        System.out.println(getName() + " (Lecturer) is requesting transport for official university duties.");
    
    }

    
    public String getFacultyId() {
        return facultyId;
    }

    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Faculty ID: " + facultyId + ", Department: " + department;
    }
}
    

