/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymedicines;

/**
 *
 * @author but-anonju_sd2022
 */
public class Cough extends Medicine{

    private final Medicine cough1;
    private final Medicine cough2;
    private final Medicine cough3;
    
    private boolean added = false;

    public Cough() {
        this.cough1 = new Medicine("ambrolex", "Ambrolex", "Ambrolex 15mg/5ml syrup 120ml", 19.25f, 10) {
        };
        this.cough2 = new Medicine("ascof", "Vitex negundo L.", "Ascof Forte 600mg Tablet", 18.75f, 10) {
        };
        this.cough3 = new Medicine("ambroxol", "RiteMed", "Ambroxol 30mg Tablet", 18.00f, 10) {
        };
    }

    public Medicine getCough1() {
        return cough1;
    }

    public Medicine getCough2() {
        return cough2;
    }

    public Medicine getCough3() {
        return cough3;
    }

    public void addCoughMedicinesList() {
        if (!added) {
            coughMedicinesList.add(cough1);
            coughMedicinesList.add(cough2);
            coughMedicinesList.add(cough3);
            added = true;
        }
    }
    
}

