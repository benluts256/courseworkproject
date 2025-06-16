/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cwp;

/**
 *
 * @author LUTS
 */
public class TransportOfficer extends User  {
    private String officerId;
    private String departmentUnit;

    public TransportOfficer(String userId, String name, String email, String phoneNumber,
                            String officerId, String departmentUnit) {
        super(userId, name, email, phoneNumber);
        this.officerId = officerId;
        this.departmentUnit = departmentUnit;
    }

    @Override
    public void performUserAction() {
        System.out.println(getName() + " (Transport Officer) is managing transport logistics and approvals.");
        
    }


    public String getOfficerId() {
        return officerId;
    }

    public String getDepartmentUnit() {
        return departmentUnit;
    }

    
    public void setDepartmentUnit(String departmentUnit) {
        this.departmentUnit = departmentUnit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Officer ID: " + officerId + ", Unit: " + departmentUnit;
    }
}
    

