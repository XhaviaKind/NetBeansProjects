/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author but-anonju_sd2022
 */
public class CustomerOp {

    Connection conn = null;
    Statement stmt = null;

    public Object[][] viewMedicineForAllergy() {
//                            Object [row] [culomn]
        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Allergy'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            int cols = 0;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
//                SET THE VALUE OF ROW FROM THE CULOMN WITH THE VALUE TAKEN FROM THE DATABASE
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public Object[][] viewMedicineForBodyPain() {
//                            Object [row] [culomn]
        Object[][] data = new Object[10][6];

        String selectQuery;
        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Body Pain'";
        try {
            int cols = 0;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
//                SET THE VALUE OF ROW FROM THE CULOMN WITH THE VALUE TAKEN FROM THE DATABASE
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public Object[][] viewMedicineForCough() {

//                            Object [row] [culomn]
        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Cough'";
        try {
            int cols = 0;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
//                SET THE VALUE OF ROW FROM THE CULOMN WITH THE VALUE TAKEN FROM THE DATABASE
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public Object[][] viewMedicineForHeadache() {

//                            Object [row] [culomn]
        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Headache'";
        try {
            int cols = 0;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
//                SET THE VALUE OF ROW FROM THE CULOMN WITH THE VALUE TAKEN FROM THE DATABASE
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerOp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

}
