/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CRUD;
import View.PharmacistAddMedicine;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
   

    

}
