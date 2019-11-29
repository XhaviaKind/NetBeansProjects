/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author but-anonju_sd2022
 */
public class CustomerOp {
    
    public void purchaseMedForAllergy(String brandname, String genericname, int quantity) {
        Connection conn = null;
        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_allergy` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_allergy` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_allergy` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        }

    }
    
    public void purchaseMedForBodyPain(String brandname, String genericname, int quantity) {
        Connection conn = null;
        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_body_pain` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_body_pain` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_body_pain` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        }

    }
    
    public void purchaseMedForCough(String brandname, String genericname, int quantity) {
        Connection conn = null;
        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_cough` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_cough` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_cough` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        }

    }
    
    public void purchaseMedForHeadache(String brandname, String genericname, int quantity) {
        Connection conn = null;
        Statement stmt = null;
        String deleteQuery;
        String updateQuery;
        String selectQuery;
        selectQuery = "SELECT quantity from `medicine_for_headache` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        deleteQuery = "DELETE FROM `medicine_for_headache` WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "' ";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet select = stmt.executeQuery(selectQuery);
            while (select.next()) {
                int qty = select.getInt("quantity");
                if (qty == quantity) {
                    stmt.executeUpdate(deleteQuery);
                    JOptionPane.showMessageDialog(null, "You purchased all " + genericname);
                } else if (qty > quantity) {
                    int upqty = qty - quantity;
                    updateQuery = "UPDATE `medicine_for_headache` SET quantity = '" + upqty + "' WHERE brandname = '" + brandname + "' and genericname = '" + genericname + "'";
                    stmt.executeUpdate(updateQuery);
                    JOptionPane.showMessageDialog(null, "You purchased " + quantity + " of " + genericname);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex.getMessage());
        }

    }
    
    public Object[][] viewMedicineForAllergy() {
        Connection conn = null;
        Statement stmt = null;
        Object[][] data = new Object[10][5];

        String selectQuery;

        selectQuery = "SELECT * from `medicine_for_allergy`";
        try {
            int cols = 0;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Generic_Name");
                data[cols][1] = result.getString("Brand_Name");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }
    
    public Object[][] viewMedicineForBodyPain() {
        Connection conn = null;
        Statement stmt = null;
        Object[][] data = new Object[10][5];

        String selectQuery;

        selectQuery = "SELECT * from `medicine_for_body_pain`";
        try {
            int cols = 0;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Generic_Name");
                data[cols][1] = result.getString("Brand_Name");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }
    
    public Object[][] viewMedicineForCough() {
        Connection conn = null;
        Statement stmt = null;
        Object[][] data = new Object[10][5];

        String selectQuery;

        selectQuery = "SELECT * from `medicine_for_cough`";
        try {
            int cols = 0;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Generic_Name");
                data[cols][1] = result.getString("Brand_Name");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }
    
    public Object[][] viewMedicineForHeadache() {
        Connection conn = null;
        Statement stmt = null;
        Object[][] data = new Object[10][5];

        String selectQuery;

        selectQuery = "SELECT * from `medicine_for_headache`";
        try {
            int cols = 0;
            conn = DriverManager.getConnection("jdbc:mysql://localhost/but-anon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
                data[cols][0] = result.getString("Generic_Name");
                data[cols][1] = result.getString("Brand_Name");
                data[cols][2] = result.getString("Price");
                data[cols][3] = result.getString("Quantity");
                ++cols;
            }
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

}
