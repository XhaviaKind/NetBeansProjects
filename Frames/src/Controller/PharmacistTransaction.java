/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CRUD;
import Model.CustomerOp;
import View.PharmacistAddMedicine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
<<<<<<< HEAD:Frames/src/Controller/PharmacistTransaction.java
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
=======
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d:Frames/src/Controller/PharmacistTransaction.java

/**
 *
 * @author but-anonju_sd2022
 */
public class PharmacistTransaction {

    static String medFor;
    static String genName;
    static String brandName;
    static String price;
    static String quantity;
    static String description;

    CRUD crud = new CRUD();
<<<<<<< HEAD:Frames/src/Controller/PharmacistTransaction.java

    JTable purchaseTable;

    List<List> purch = new ArrayList();

    String[] col = {"Med_For", "Generic Name", "Brand Name", "Price", "Description", "Quantity"};

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

=======
    
    
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d:Frames/src/Controller/PharmacistTransaction.java
    public void addMedicine() {
        medFor = PharmacistAddMedicine.getMedFor();
        genName = PharmacistAddMedicine.getGenName();
        brandName = PharmacistAddMedicine.getBrandName();
        price = PharmacistAddMedicine.getPrice();
        quantity = PharmacistAddMedicine.getQuantity();
        description = PharmacistAddMedicine.getDescription();
        try {
            Connection connection = crud.connectToDB();

            String query = "INSERT INTO medicine (Med_for,GenericName,BrandName,Price,Quantity,Description)" + "VALUES('" + medFor + "','"
                    + genName + "','" + brandName + "','" + price + "','" + quantity + "','" + description + "')";
            String medicineQuery = "SELECT BrandName, Quantity FROM medicine WHERE BrandName = " + "\"" + brandName + "\"" + ";";
            String medicine = null;
            String qty = null;
            ResultSet rsAcc = crud.getData(medicineQuery);
            while (rsAcc.next()) {
                medicine = rsAcc.getString("BrandName");
                qty = rsAcc.getString("Quantity");
            }
            if (!brandName.equals(medicine)) {
                Statement stmt = connection.createStatement();
                int rs = stmt.executeUpdate(query);
            } else if (brandName.equals(medicine)) {
                String update = "UPDATE medicine SET Quantity = ? WHERE BrandName =" + "\"" + brandName + "\"" + ";";
                PreparedStatement psmt = connection.prepareStatement(update);
                psmt.setInt(1, (Integer.parseInt(quantity) + Integer.parseInt(qty)));
                psmt.executeUpdate();
                System.out.println("ok");
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(PharmacistAddMedicine.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
<<<<<<< HEAD:Frames/src/Controller/PharmacistTransaction.java
=======
   

    
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d:Frames/src/Controller/PharmacistTransaction.java

}
