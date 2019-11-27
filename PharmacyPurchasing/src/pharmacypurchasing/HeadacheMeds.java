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
public class HeadacheMeds extends Medicine implements viewMedicine   {
    
    private final Medicine headache1;
    private final Medicine headache2;
    private final Medicine headache3;
    List bodypainMedicinesList = new ArrayList();
    
    
    public HeadacheMeds() {
        this.headache1 = new Medicine("Advil", "Ibuprofen", "Advil Suspension 100 mg/5ml 60ml", 139.25) {
        };
        this.headache2 = new Medicine("Naproxen", "Naproxen", "Naproxen Sodium", 11.75) {
        };
        this.headache3 = new Medicine("Cilostazol", "RiteMed", "Pletaal 100mg Tablet", 100.00) {
        };
    }

    @Override
    public void viewGenericNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewBrandNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void addHeadacheMedsMedicinesList() {
        bodypainMedicinesList.add(headache1 + "\n");
        bodypainMedicinesList.add(headache2 + "\n");
        bodypainMedicinesList.add(headache3 + "\n");
    }

    public void getHeadacheMedsMedicinesList() {
        System.out.println("\n\n\n\t\t\t\t****************************** Body Pain Medicines List ******************************\n");
        Iterator itr = bodypainMedicinesList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
//        HeadacheMeds aspirin = new HeadacheMeds("ACETYLSALICYLIC ACID(ASA)", "Aspirin", "QUICK OVERVIEW\n" + "\tAspirin is a medication used to treat pain, fever, or inflammation. Specific inflammatory conditions which aspirin is used to treat include Kawasaki disease, pericarditis, and rheumatic fever" + "\n" + "LOREXA QD 10MG TABLET", 23.75);
//        HeadacheMeds advil = new HeadacheMeds("ADVIL", "Ibuprofen", "QUICK OVERVIEW\n" + "\tAdvil is a nonsteroidal anti-inflammatory drug (NSAID). It works by reducing hormones that cause inflammation and pain in the body. Ibuprofen is used to reduce fever and treat pain or inflammation caused by many conditions such as headache, toothache, back pain, arthritis, menstrual cramps, or minor injury.", 36.50);
//        HeadacheMeds ext = new HeadacheMeds("Tylenol Ext", "Acetaminophen ", "QUICK OVERVIEW\n" + "\tAcetaminophen is an analgesic used to temporarily relieve minor aches and pains due to headache, muscular aches, backache, minor pain of arthritis, the common cold, toothache, and premenstrual and menstrual cramps. Acetaminophen is also used to temporarily reduce fever.", 22.15);
