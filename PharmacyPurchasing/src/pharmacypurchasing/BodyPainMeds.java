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
public class BodyPainMeds extends Medicine implements viewMedicine  {
    
    private final Medicine bodypain1;
    private final Medicine bodypain2;
    private final Medicine bodypain3;
    List bodypainMedicinesList = new ArrayList();
    
    
    public BodyPainMeds() {
        this.bodypain1 = new Medicine("Advil", "Ibuprofen", "Advil Suspension 100 mg/5ml 60ml", 139.25) {
        };
        this.bodypain2 = new Medicine("Naproxen", "Naproxen", "Naproxen Sodium", 11.75) {
        };
        this.bodypain3 = new Medicine("Cilostazol", "RiteMed", "Pletaal 100mg Tablet", 100.00) {
        };
    }

    @Override
    public void viewGenericNames() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewBrandNames() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void addBodyPainMedicinesList() {
        bodypainMedicinesList.add(bodypain1 + "\n");
        bodypainMedicinesList.add(bodypain2 + "\n");
        bodypainMedicinesList.add(bodypain3 + "\n");
    }

    public void getBodyPainMedicinesList() {
        System.out.println("\n\n\n\t\t\t\t****************************** Body Pain Medicines List ******************************\n");
        Iterator itr = bodypainMedicinesList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    
    
}
//        BodyPainMeds saridon = new BodyPainMeds("SARIDON", "PARACETAMOL", "QUICK OVERVIEW\n" + "\tSARIDON TRIPLE ACTION 450 TABLET", 5.25);
//        BodyPainMeds tempra = new BodyPainMeds("TEMPRA", "PARACETAMOL", "QUICK OVERVIEW\n" + "\tTempra Forte 500Mg 8 2 Tablets", 33.25);
//        BodyPainMeds tylenol = new BodyPainMeds("TYLENOL", "PARACETAMOL", "QUICK OVERVIEW\n" + "\tTYLENOL ER 650MG TABLET", 7.75);

