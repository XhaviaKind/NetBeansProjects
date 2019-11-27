/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacypurchasing;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author but-anonju_sd2022
 */
public abstract class User {

    private String fname;
    private String address;
    private int age;
    private String password;
    private String username = "jude@gmail.com";
    private String emailAdd;

    public User() {

    }

    public User(String fname, String address, int age) {
        this.fname = fname;
        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getBdate() {
        return address;
    }

    public void setBdate(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getUserInputFname() {
        System.out.print("Enter your full name: ");

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        this.fname = name;

    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public String getUserInputName() {
        return fname;
    }

    public void getUserInputAge() {
        System.out.print("Enter your age: ");

        Scanner s = new Scanner(System.in);
        int userAge = s.nextInt();
        this.age = userAge;

    }

    public int getUserInputage() {
        return age;
    }

//    LISTS OF THE REGISTERED CUSTOMERS
    HashMap<String, String> registeredUsers = new HashMap<>();

// THIS IS FOR THE REGISTER PART
    public void register() {
        Scanner register = new Scanner(System.in);

        System.out.println("\t\t\t\t****************************** REGISTER ******************************");
        System.out.println("\t\tPlease fill up the form");
        System.out.println("Full Name: ");
        String inputFullName = register.nextLine();
        System.out.println("Enter email address : ");
        String inputEmailAdd = register.nextLine();
        System.out.println("Enter password: ");
        String inputPassword = register.nextLine();
        this.emailAdd = inputEmailAdd;
        this.password = inputPassword;
        System.out.println("Enter age: ");
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
    }

// THIS IS FOR THE LOGIN PART
    public boolean login() {
        System.out.println("\n\n\n\t\t\t\t****************************** LOGIN ******************************\n");
        Scanner login = new Scanner(System.in);
        System.out.println("Enter email add: ");
        String eAdd = login.nextLine();
        if (!registeredUsers.isEmpty()) {

            if (eAdd != null && eAdd.equals(emailAdd)) {
                System.out.println("Enter password:");
                String pass;
                if (password.equals(pass = login.nextLine())) {
                    System.out.println("\n\n\n\t\t\t\t****************************** YOU ARE SUCCESSFULLY LOGGED IN ******************************\n\n\n");
                } else {
                    System.out.println("\n\t\t\t\t****************************** INCOMPATIBLE EMAIL AND PASSWORD ******************************\n");

                }
            } else {
                System.out.println("\n\t\t\t\t****************************** EMAIL ADD DOES NOT EXIST ******************************\n");
                login.close();
            }

        }
        return true;
    }

    public HashMap<String, String> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(HashMap<String, String> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

}

