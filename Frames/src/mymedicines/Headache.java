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
public class Headache extends Medicine {

    private final Medicine headache1;
    private final Medicine headache2;
    private final Medicine headache3;
    
    private boolean added = false;

    public Headache() {
        this.headache1 = new Medicine("fioricet", "acetaminophen", "analgesic combinations", 162.25f, 10) {
        };
        this.headache2 = new Medicine("anaprox", "naproxen systemic", "Nonsteroidal anti-inflammatory drugs", 20.75f, 10) {
        };
        this.headache3 = new Medicine("motrin", "ibuprofen systemic", "Nonsteroidal anti-inflammatory drugs", 18.00f, 10) {
        };
    }

    public void addHeadacheMedsMedicinesList() {
        if (!added) {
            headacheMedicinesList.add(headache1);
            headacheMedicinesList.add(headache2);
            headacheMedicinesList.add(headache3);
            added = true;
        }
    }

    public Medicine getHeadache1() {
        return headache1;
    }

    public Medicine getHeadache2() {
        return headache2;
    }

    public Medicine getHeadache3() {
        return headache3;
    }

}// INSERT INTO medicine (Med_For, Generic_Name, Brand_Name, Price, Quantity,Description) VALUES("Headache", "Ibuprofen Systemic", "Motrin", 18.00, 10, "Nonsteroidal anti-inflammatory drugs")

