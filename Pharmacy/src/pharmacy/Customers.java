/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author but-anonju_sd2022
 */
public class Customers extends Users {

    private String emailAdd;
    private String password;
 
//    LISTS OF THE REGISTERED CUSTOMERS
    HashMap<String, String> registeredUsers = new HashMap<>();
    
    public Customers() {
    }

    public Customers(String fullName, int age) {
        super(fullName, age);
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    REGISTER METHOD WITH RETURN TYPE OF BOOLEAN
    @Override
    public boolean register() {
        Scanner register = new Scanner(System.in);

        System.out.println("\t\t\t\t****************************** REGISTER AS CUSTOMER ******************************");
        System.out.println("\t\tPlease fill up the form");
        System.out.print("Full Name : ");
        String inputFullName = register.nextLine();
        System.out.print("Enter email address : ");
        String inputEmailAdd = register.nextLine();
        System.out.print("Enter password : ");
        String inputPassword = register.nextLine();
        this.emailAdd = inputEmailAdd;
        this.password = inputPassword;
        System.out.print("Enter age : ");
        int inputAge = register.nextInt();
        if (inputAge <= 18) {
            register.close();
            System.out.println("\t\t\t\t****************************** SORRY YOU ARE TOO YOUNG TO REGISTER ******************************");
        } else {
            System.out.println("\n\n\n\t\t\t\t****************************** YOU ARE SUCCESSFULLY REGISTERED ******************************");
            registeredUsers.put(inputEmailAdd, inputPassword);
            System.out.println();
            System.out.println("Name : " + inputFullName + "\nusername : " + emailAdd + "\npassword : " + registeredUsers.get(inputEmailAdd) + "\nAge : " + inputAge);

        }
        return true;
    }

//    LOGIN METHOD WITH RETURN TYPE OF BOOLEAN
    @Override
    public boolean login() {
        System.out.println("\n\n\n\t\t\t\t****************************** LOGIN AS CUSTOMER ******************************\n");
        Scanner login = new Scanner(System.in);
        System.out.print("Enter email add : ");
        String eAdd = login.nextLine();
        if (!registeredUsers.isEmpty()) {

            if (eAdd != null && eAdd.equals(emailAdd)) {
                System.out.print("Enter password : ");
                String pass = login.nextLine();
                if (password.equals(pass)) {
                    System.out.println("\n\n\n\t\t\t\t****************************** YOU ARE SUCCESSFULLY LOGGED IN ******************************\n\n\n");
                } else {
                    System.out.println("\n\t\t\t\t****************************** INCOMPATIBLE EMAIL AND PASSWORD ******************************\n");
                    login.close();
                }
            } else {
                System.out.println("\n\t\t\t\t****************************** EMAIL ADD DOES NOT EXIST ******************************\n");
                login.close();
            }

        }
        return true;
    }
    
    public void transaction(){
        Scanner transact = new Scanner(System.in);
        System.out.println("\t\t\t\t****************************** PLEASE CHOOSE A TRANSACTION ******************************\n");
        System.out.println("[1] : BUY MEDICINE \t [2] : SEARCH MEDICINE");
        System.out.print("Enter choice : ");
        int choice = transact.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("\t\t\t\t****************************** MEDICINES FOR.... ******************************\n");
                System.out.println("[1] : "+pharmacy.Allergies.class.getSimpleName()+"\t\t[2] : "+pharmacy.BodyPain.class.getSimpleName()+"\t\t[3] : "+pharmacy.Cough.class.getSimpleName()+"\t\t[4] : "+pharmacy.HeadAche.class.getSimpleName());
                System.out.print("Enter choice : ");
                int search = transact.nextInt();
                switch (search){
                    case 1 :
                        System.out.println("You're searching for the medicines of Allergies");
                        break;
                    case 2 :
                        System.out.println("You are searching for the medicines of Body Pain");
                        break;
                    case 3 :
                        System.out.println("You are searching for the medicines of Cough");
                        break;
                    case 4 :
                        System.out.println("You are searching for the medicines of Headache");
                        break;
                    default:
                        System.out.println("Choice is out of reach");
                        break;
                }
                break;
            case 2 :
                System.out.println("\t\t\t\t****************************** YOU ARE GOING TO SEARCH FOR A MEDICINE ******************************\n");
                break;
            default:
                System.out.println("\t\t\t\t****************************** OUT OF REACHED CHOICE ******************************\n");
        }
    }
    
    public void purchase(){
        
    }
    
//    LOGOUT METHOD WITH RETURN TYPE OF BOOLEAN

    @Override
    public boolean logout() {
        return true;
    }
}