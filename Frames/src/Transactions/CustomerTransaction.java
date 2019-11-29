/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transactions;

import DB.CustomerOp;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author but-anonju_sd2022
 */
public class CustomerTransaction {

    String[] col = {"Generic Name", "Brand Name", "Price", "Description", "Quantity"};

    CustomerOp cOp = new CustomerOp();

    public void purchaseAllergyMed(String genericName, String brandName, String quantity) {
        if (genericName.equals("")) {
            JOptionPane.showMessageDialog(null, "no input", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cOp.purchaseMedForCough(brandName, genericName, parseInt(quantity));
        }
    }
    
    public void purchaseBodyPainMed(String genericName, String brandName, String quantity) {
        if (genericName.equals("")) {
            JOptionPane.showMessageDialog(null, "no input", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cOp.purchaseMedForCough(brandName, genericName, parseInt(quantity));
        }
    }
    
    public void purchaseCoughMed(String genericName, String brandName, String quantity) {
        if (genericName.equals("")) {
            JOptionPane.showMessageDialog(null, "no input", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cOp.purchaseMedForCough(brandName, genericName, parseInt(quantity));
        }
    }
    
    public void purchaseHeadacheMed(String genericName, String brandName, String quantity) {
        if (genericName.equals("")) {
            JOptionPane.showMessageDialog(null, "no input", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            cOp.purchaseMedForCough(brandName, genericName, parseInt(quantity));
        }
    }

    public DefaultTableModel tableAllergyMed() {
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
    public DefaultTableModel tableBodyPainMed() {
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
}
