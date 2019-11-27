/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.Scanner;

/**
 *
 * @author but-anonju_sd2022
 */
public class Pharmacy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here]
        Users user = new Users();
        Customers customer = new Customers();
        Staff staff = new Staff();

        if (!user.login() == false) {

            Scanner choose = new Scanner(System.in);
            System.out.println("\n\n\n\t\t\t\t******************************| PHARMACY PURCHASING |******************************\n");
            System.out.println("Please Choose : \t [1] Customer \t [2] Staff");
            System.out.print("Enter choice : ");
            int choice = choose.nextInt();
            switch (choice) {
                case 1:
                    customer.register();
                    customer.login();
                    user.login();
                    if (user.login()) {
                        customer.transaction();
                    }
                    break;
                case 2:
                    staff.register();
                    break;
                default:
                    System.out.println("********| CHOICE NOT AVAILABLE |********");
                    break;
                    
                    
            }

        }

    }

}
