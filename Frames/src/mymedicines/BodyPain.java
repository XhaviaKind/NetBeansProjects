/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymedicines;

import java.util.ArrayList;

/**
 *
 * @author but-anonju_sd2022
 */
public class BodyPain extends Medicine{

    private final Medicine bodypain1;
    private final Medicine bodypain2;
    private final Medicine bodypain3;
    
    private boolean added = false;
    private final ArrayList orders;

    public BodyPain() {
        this.bodypain1 = new Medicine("advil", "Ibuprofen", "Advil Suspension 100 mg/5ml 60ml", (float) 149.25, 10) {
        };
        this.bodypain2 = new Medicine("naproxen", "Naproxen", "Naproxen Sodium", 51.75f, 10) {
        };
        this.bodypain3 = new Medicine("cilostazol", "RiteMed", "Pletaal 100mg Tablet", 160.00f, 10) {
        };
        orders = new ArrayList();
    }

    public Medicine getBodypain1() {
        return bodypain1;
    }

    public Medicine getBodypain2() {
        return bodypain2;
    }

    public Medicine getBodypain3() {
        return bodypain3;
    }



    public void addBodyPainMedicinesList() {
        if (!added) {
            bodypainMedicinesList.add(bodypain1);
            bodypainMedicinesList.add(bodypain2);
            bodypainMedicinesList.add(bodypain3);
            added = true;
        }

    }

}
