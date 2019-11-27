/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.HashMap;

/**
 *
 * @author but-anonju_sd2022
 */
public class BodyPain extends Medicines  {
    

    public BodyPain() {
    }

    public BodyPain(String genericName, String brandName, int price, int quantity, String description) {
        super(genericName, brandName, price, quantity, description);
    }

    @Override
    public void setMedicinesList(HashMap<String, String> medicinesList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addMedicineList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
