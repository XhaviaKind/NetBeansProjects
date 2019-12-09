/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CRUD;
import Model.CustomerOp;
import View.CustomerPurchasesHistory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author but-anonju_sd2022
 */
public class CustomerTransaction {
    
    JTable purchaseTable;
    
    
    List<List> purch = new ArrayList();
    

    String[] col = {"Med_For","Generic Name", "Brand Name", "Price", "Description", "Quantity"};

    CustomerOp cOp = new CustomerOp();

    public DefaultTableModel tableAllergyMed() {
        Object[][] medForCough = cOp.viewMedicineForAllergy();
        DefaultTableModel tableMedCough = new DefaultTableModel(medForCough, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
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
                return false;
            }
        };
        return tableMedCough;
    }
    
    public void updateData(DefaultTableModel purchaseTable) {
        int row = purchaseTable.getRowCount();

        int quantity = 0;
        int purchQuantity = 0;
        for (int i = 0; i < row; i++) {

            String qty = "SELECT Quantity, BrandName FROM medicine WHERE BrandName = " + "\"" + (purchaseTable.getValueAt(i, 1).toString()) + "\"" + ";";
            purchQuantity = Integer.parseInt(purchaseTable.getValueAt(i, 3).toString());
            try {
                Connection conn = new CRUD().connectToDB();
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(qty);
                List<String> list = new ArrayList();
                while (resultSet.next()) {
                    list.add(resultSet.getString("BrandName"));
                    list.add(String.valueOf(resultSet.getInt("Quantity")));
                    list.add(String.valueOf(purchQuantity));
                }
                purch.add(list);
                System.out.println("quantity : " + quantity);
                System.out.println("purchase Quantity : " + purchQuantity);
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            for (List l : purch) {
                try {
                    Connection connection = new CRUD().connectToDB();
                    System.out.println(l);
                    String updateMed = "UPDATE medicine SET Quantity = " + (Integer.parseInt(l.get(1).toString()) - (Integer.parseInt(l.get(2).toString())))
                            + " WHERE BrandName = " + "\"" + l.get(0) + "\"" + ";";

                    Statement statement1 = connection.createStatement();
                    statement1.executeUpdate(updateMed);

                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerPurchasesHistory.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
    
}
