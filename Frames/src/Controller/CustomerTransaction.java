/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CustomerOp;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author but-anonju_sd2022
 */
public class CustomerTransaction {

    String[] col = {"Med_For","Generic Name", "Brand Name", "Price", "Description", "Quantity"};

    CustomerOp cOp = new CustomerOp();

    public DefaultTableModel tableAllergyMed() {
        Object[][] medForCough = cOp.viewMedicineForAllergy();
        DefaultTableModel tableMedCough = new DefaultTableModel(medForCough, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all ceisCellEditablells false
                return false;
            }
        };
        return tableMedCough;
    }
    public DefaultTableModel tableBodyPainMed() {
        Object[][] medForCough = cOp.viewMedicineForBodyPain();
        DefaultTableModel tableMedCough = new DefaultTableModel(medForCough, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all ceisCellEditablells false
                return false;
            }
        };
        return tableMedCough;
    }
    
    public DefaultTableModel tableCoughMed() {
        Object[][] medForCough = cOp.viewMedicineForCough();
        DefaultTableModel tableMedCough = new DefaultTableModel(medForCough, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all ceisCellEditablells false
                return false;
            }
        };
        return tableMedCough;
    }
    
    public DefaultTableModel tableHeadacheMed() {
        Object[][] medForCough = cOp.viewMedicineForHeadache();
        DefaultTableModel tableMedCough = new DefaultTableModel(medForCough, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all ceisCellEditablells false
                return false;
            }
        };
        return tableMedCough;
    }
    
    public void editMedicines () {
       
    }
}
