/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CRUD;
import View.PharmacistAddMedicine;
import View.PharmacistEditMedicine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author but-anonju_sd2022
 */
public class Pharmacist {

    static String medFor;
    static String genName;
    static String brandName;
    static String price;
    static String quantity;
    static String description;

    CRUD crud = new CRUD();

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
//    String[] col = {"Med_For", "Generic Name", "Brand Name", "Price", "Description", "Quantity"};
//
//    public DefaultTableModel getAllData() {
//        Object[][] data = setTable();
//        for (Object[] dta: data) {
//            for(Object d: dta) {
//                System.out.println(d);
//            }
//        }
//        DefaultTableModel table = new DefaultTableModel(setTable(), col) {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//        };
//
//        return table;
//    }
//
//    public Object[][] setTable() {
//        Object[][] data = new Object[15][6];
//        try {
//            // TODO add your handling code here:
//            String query = "SELECT * FROM medicine";
//            Connection connection = crud.connectToDB();
//            ResultSet rs = crud.getData(query);
//            int count = 0;
//            while (rs.next()) {
//                data[count][0] = rs.getString(2);
//                data[count][1] = rs.getString(3);
//                data[count][2] = rs.getString(4);
//                data[count][3] = rs.getString(5);
//                data[count][4] = rs.getString(6);
//                data[count][5] = rs.getString(7);
//                count++;
//            }
//            connection.close();
//        } catch (Exception ex) {
//            Logger.getLogger(PharmacistEditMedicine.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return data;
//    }
    

}
