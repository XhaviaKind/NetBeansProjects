/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author but-anonju_sd2022
 */
public class Cough extends Medicines {

    private Medicines cough1;
    private Medicines cough2;
    private Medicines cough3;

    public Cough() {
    }

    public Cough(String genericName, String brandName, double price, int quantity, String description) {
        super(genericName, brandName, price, quantity, description);
    }

    public Cough(Medicines cough1, Medicines cough2, Medicines cough3) {
        this.cough1 = cough1;
        this.cough2 = cough2;
        this.cough3 = cough3;
    }

    public Medicines getCough1() {
        return cough1;
    }

    public void setCough1(Medicines cough1) {
        this.cough1 = cough1;
    }

    public Medicines getCough2() {
        return cough2;
    }

    public void setCough2(Medicines cough2) {
        this.cough2 = cough2;
    }

    public Medicines getCough3() {
        return cough3;
    }

    public void setCough3(Medicines cough3) {
        this.cough3 = cough3;
    }

    public List getListOfMedicines() {
        return listOfMedicines;
    }

    public void setListOfMedicines(List listOfMedicines) {
        this.listOfMedicines = listOfMedicines;
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
