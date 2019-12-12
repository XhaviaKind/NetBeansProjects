/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 2ndyrGroupB
 */
public class PharmacistOperation {

  

    public Object[][] viewMedicineForAllergy() {

        Connection conn = null;
        Statement stmt = null;
        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Allergy'";
        try {
            int cols = 0;
            conn = new CRUD().connectToDB();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            conn.close();
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    public Object[][] viewMedicineForBodyPain() {

        Connection conn = null;
        Statement stmt = null;

        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Body Pain'";
        try {
            int cols = 0;
            conn = new CRUD().connectToDB();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            conn.close();
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    public Object[][] viewMedicineForCough() {

        Connection conn = null;
        Statement stmt = null;

        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Cough'";
        try {
            int cols = 0;
            conn = new CRUD().connectToDB();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            conn.close();
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    public Object[][] viewMedicineForHeadache() {

        Connection conn = null;
        Statement stmt = null;

        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Headache'";
        try {
            int cols = 0;
            conn = new CRUD().connectToDB();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Med_For");
                data[cols][1] = result.getString("GenericName");
                data[cols][2] = result.getString("BrandName");
                data[cols][3] = result.getString("Price");
                data[cols][4] = result.getString("Description");
                data[cols][5] = result.getString("Quantity");
                ++cols;
            }
            conn.close();
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    
}
