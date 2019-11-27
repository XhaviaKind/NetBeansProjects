/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymedicines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author but-anonju_sd2022
 */
public class Medicine {

    static private String brandName;
    static private String genericName;
    static private String description;
    static private float price;
    static private int quantity;
    List<Medicine> alergyMedicinesList = new ArrayList();
    List<Medicine> bodypainMedicinesList = new ArrayList();
    List<Medicine> coughMedicinesList = new ArrayList();
    List<Medicine> headacheMedicinesList = new ArrayList();

    public Medicine() {
    }

    public Medicine(String brandName, String genericName, String description, float price, int quantity) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("brand name :  %s \ngeneric name : %s \ndescription : %s \nprice : %f \nquantity : %d", brandName, genericName, description, price, quantity);
    }

    public void getAllergyMedicinesList() {
        System.out.println("\n\t\t\t\t****************************** Allergies Medicines List ******************************\n");
        for(Medicine m : alergyMedicinesList) {
            System.out.println(m+"\n");
        }
    }

    public void getBodyPainMedicinesList() {
        System.out.println("\n\t\t\t\t****************************** Body Pain Medicines List ******************************\n");
        Iterator itr = bodypainMedicinesList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void getCoughMedicinesList() {
        System.out.println("\n\t\t\t\t****************************** Cough Medicines List ******************************\n");
        Iterator itr = coughMedicinesList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void getHeadacheMedsMedicinesList() {
        System.out.println("\n\t\t\t\t****************************** Headaches Medicines List ******************************\n");
        Iterator itr = headacheMedicinesList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

