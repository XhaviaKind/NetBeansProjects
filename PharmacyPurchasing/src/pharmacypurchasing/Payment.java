/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacypurchasing;

/**
 *
 * @author but-anonju_sd2022
 */
public class Payment extends User {
    User user = new User(){};

    private String medicineName;
    private int medicineQuantity;
    private double medicinePrice;

    public Payment() {

    }

    public Payment(String medicineName, int medicineQuantity, double medicinePrice) {
        this.medicineName = medicineName;
        this.medicineQuantity = medicineQuantity;
        this.medicinePrice = medicinePrice;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getMedicineQuantity() {
        return medicineQuantity;
    }

    public void setMedicineQuantity(int medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public void purchase() {
  
    }

}
