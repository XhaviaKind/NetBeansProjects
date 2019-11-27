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
public class Users {

    private String fullName;
    private int age;
   

    public Users() {

    }

    public Users(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean register() {
        return true;
    }

    public boolean login() {
        return true;
    }

    public boolean logout() {
        return true;
    }

    

}
