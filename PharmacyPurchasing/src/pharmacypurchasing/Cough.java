/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacypurchasing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author but-anonju_sd2022
 */
public class Cough extends Medicine implements viewMedicine {

    private Medicine cough1;
    private Medicine cough2;
    private Medicine cough3;
    List coughMedicinesList = new ArrayList();

    public Cough() {
        this.cough1 = new Medicine("Ambrolex", "Ambrolex", "Ambrolex 15mg/5ml syrup 120ml", 139.25) {
        };
        this.cough2 = new Medicine("Ascof", "Vitex negundo L.", "Ascof Forte 600mg Tablet", 11.75) {
        };
        this.cough3 = new Medicine("Ambroxol HCI", "RiteMed", "Ambroxol 30mg Tablet", 100.00) {
        };
    }

    public Cough(String brandName, String genericName, String description, double price) {
        super(brandName, genericName, description, price);
    }

 

    public void addCoughMedicinesList() {
        coughMedicinesList.add(cough1 + "\n");
        coughMedicinesList.add(cough2 + "\n");
        coughMedicinesList.add(cough3 + "\n");
    }

    public void getCoughMedicinesList() {
        System.out.println("\n\n\n\t\t\t\t****************************** Cough Medicines List ******************************\n");
        Iterator itr = coughMedicinesList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

 

    @Override
    public void viewGenericNames() {
        System.out.println("\n***** GENERIC NAMES *****");
        System.out.println(cough1.getGenericName() + "\t" + "\n" + cough2.getGenericName( )+ "\t "   + "\n" +  cough3.getGenericName());
    }
    
    @Override
    public void viewBrandNames(){
        System.out.println("\n***** BRAND NAMES *****");
        System.out.println(cough1.getBrandName()+"\n"+cough2.getBrandName()+"\n"+cough3.getBrandName());
    }
    

}
