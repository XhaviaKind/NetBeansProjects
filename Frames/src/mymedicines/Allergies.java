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
public class Allergies extends Medicine {

    private final Medicine alergy1;
    private final Medicine alergy2;
    private final Medicine alergy3;
    
    private boolean added = false;

    public Allergies() {

        this.alergy1 = new Medicine("cetirizine", "for Children : Zyrtec Allergy", " Syrup", (float) 89.25, 10) {
        };
        this.alergy2 = new Medicine("antihistamine", "Clemastine", "Allergic rhinitis", 52.75f, 10) {
        };
        this.alergy3 = new Medicine("acrivastine", "Semprex-D", "Capsules", 50.00f, 10) {
        };
    }


    public Medicine getAlergy1() {
        return alergy1;
    }

    public Medicine getAlergy2() {
        return alergy2;
    }

    public Medicine getAlergy3() {
        return alergy3;
    }

    public void addAllergyMedicinesList() {
        if (!added) {
            alergyMedicinesList.add(alergy1);
            alergyMedicinesList.add(alergy2);
            alergyMedicinesList.add(alergy3);
            added = true;
        }
    }
    
}