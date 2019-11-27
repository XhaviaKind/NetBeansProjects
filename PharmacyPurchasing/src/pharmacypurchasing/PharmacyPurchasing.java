/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacypurchasing;

import java.util.Scanner;

/**
 *
 * @author but-anonju_sd2022
 */
public class PharmacyPurchasing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in);

        User user = new User() {
        };
        Medicine medicine = new Medicine() {
            
        };
        Cough cough = new Cough();
        AllergiesMeds allergies = new AllergiesMeds();
        BodyPainMeds bodypain = new BodyPainMeds();
        HeadacheMeds headache = new HeadacheMeds();

        

        System.out.println("\t\t\t\t****************************** WELCOME TO ONLINE PHARMACY PURCHASING ****************************** \n");

        user.register();
        boolean logged = user.login();

        if (logged) {
            System.out.println("\t\t\t\t****************************** PLEASE CHOOSE YOUR TRANSACTION ******************************\n");
            System.out.println("[1] : Search a Medicine\t [2] : Buy a Medicine\n");
            System.out.println("Enter Choice:");
            int options = askInput.nextInt();
            switch (options) {
                case 1:
                    System.out.println("\n**** Medicine for what ?\n [1] : Cough\t[2] : Body Pain\t[3] : Headache\t[4] : Allergies");
                    System.out.println("Enter you choice: ");
                    int choice = askInput.nextInt();                    
                    switch (choice){
                        case 1:
                            cough.addCoughMedicinesList();
                            cough.getCoughMedicinesList();
                            break;
                        case 2:
                            bodypain.addBodyPainMedicinesList();
                            bodypain.getBodyPainMedicinesList();
                            break;
                        case 3 :
                            headache.addHeadacheMedsMedicinesList();
                            headache.getHeadacheMedsMedicinesList();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    cough.viewGenericNames();
                    cough.viewBrandNames();
                default:
//                    System.out.println("\n\nsorry unavailable"); 
//                    cough.getCoughMedicinesList();
                    break;
            }

//        cough.getCoughMedicinesList();
        }
        medicine.addMedicines();
        medicine.getMedicines();

    }

}
