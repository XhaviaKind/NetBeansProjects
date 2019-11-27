/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author but-anonju_sd2022
 */
public abstract class Medicines {
    private String genericName;
    private String brandName;
    private double price;
    private int quantity;
    private String description;
    List listOfMedicines = new ArrayList();
   
   public Medicines(){
       
   }

    public Medicines(String genericName, String brandName, double price, int quantity, String description) {
        this.genericName = genericName;
        this.brandName = brandName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List getMedicinesList() {
        return listOfMedicines;
    }

    public abstract void setMedicinesList(HashMap<String, String> medicinesList) ;

//    THIS IS AN ABSTRACT METHOD FOR ADDING A MEDICINE TO THE MEDICINES LIST
   public abstract void addMedicineList();
   
   
   
//       @Override
//    public String toString() {
//        return String.format("GENERIC NAME :  %s \nBRAND NAME : %s \nDESCRIPTION : %s \nRPICE : %f", brandName, genericName, description, price);
//    }
//
//    public void addMedicines(){
//        listOfMedicines.add(pharmacy.Cough.class.getSimpleName()+'\n'+pharmacy.Allergies.class.getSimpleName());
//    }
//     public void getMedicines() {
//        
//        Iterator itr = listOfMedicines.iterator();
//
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//    }
}

