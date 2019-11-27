/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacypurchasing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import pharmacypurchasing.Cough;
//import pharmacypurchasing.HeadacheMeds;
//import pharmacypurchasing.AllergiesMeds;
//import pharmacypurchasing.BodyPainMeds;

/**
 *
 * @author but-anonju_sd2022
 */
public abstract class Medicine {

    private String brandName;
    private String genericName;
    private String description;
    private double price;
    List listOfMedicines = new ArrayList();

    public Medicine() {

    }

    public Medicine(String brandName, String genericName, String description, double price) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.description = description;
        this.price = price;
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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("BRAND NAME :  %s \nGENERIC NAME : %s \nDESCRIPTION : %s \nRPICE : %f", brandName, genericName, description, price);
    }

    public void addMedicines(){
        listOfMedicines.add(pharmacypurchasing.Cough.class.getSimpleName()+'\n'+pharmacypurchasing.AllergiesMeds.class.getSimpleName());
    }
     public void getMedicines() {
        
        Iterator itr = listOfMedicines.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
//coughMedicinesList
    
//    make an abstract class
//    Create an interface
    


}
