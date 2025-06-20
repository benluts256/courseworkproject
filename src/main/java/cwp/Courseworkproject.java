/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cwp;

/**
 *
 * @author LUTS
 */
public class Courseworkproject {

    public static void main(String[] args) {
        System.out.println("--- Demonstrating User Abstraction in UTMS ---");

        
        Student student1 = new Student("U001", "Benon Lutaaya", "benonlutaaya@university.com",
                                     "0712345678", "vubsf2407", "Bachelor in Software Engineering", 2024);

        Lecturer lecturer1 = new Lecturer("U002", "Dr. Ben Johnson", "ben.johnson@university.com",
                                         "0798765432", "F2023005", "Electrical Engineering");

        TransportOfficer officer1 = new TransportOfficer("U003", "Ms. Najjemba Olivia", "olivianajjemba@university.com",
                                                         "0776543210", "T2023001", "Transport Department");

        
        User[] cwpUsers = new User[3];
        cwpUsers[0] = student1;
        cwpUsers[1] = lecturer1;
        cwpUsers[2] = officer1;

        System.out.println("\n--- User Details ---");
        for (User user : cwpUsers) {
            System.out.println(user); 
        }

        System.out.println("\n--- Performing User Actions ---");
        for (User user : cwpUsers) {
            user.performUserAction(); 
        }

        System.out.println("\n--- Specific User Actions ---");
        student1.performUserAction();
        lecturer1.performUserAction();
        officer1.performUserAction();
    }
}
   
    

