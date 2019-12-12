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
 * @author but-anonju_sd2022
 */
public class CustomerOp {

    Connection conn = null;
    Statement stmt = null;

    public Object[][] viewMedicineForAllergy() {
<<<<<<< HEAD

        Connection conn = null;
        Statement stmt = null;
=======
//                            Object [row] [culomn]
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Allergy'";
        try {
<<<<<<< HEAD
=======
            Class.forName("com.mysql.jdbc.Driver");
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
            int cols = 0;
            conn = new CRUD().connectToDB();
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
            conn.close();
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    public Object[][] viewMedicineForBodyPain() {
<<<<<<< HEAD

        Connection conn = null;
        Statement stmt = null;

=======
//                            Object [row] [culomn]
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
        Object[][] data = new Object[10][6];

        String selectQuery;
        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Body Pain'";
        try {
            int cols = 0;
<<<<<<< HEAD
            conn = new CRUD().connectToDB();
=======
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
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
            conn.close();
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    public Object[][] viewMedicineForCough() {

<<<<<<< HEAD
        Connection conn = null;
        Statement stmt = null;

=======
//                            Object [row] [culomn]
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Cough'";
        try {
            int cols = 0;
<<<<<<< HEAD
            conn = new CRUD().connectToDB();
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
=======
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
            stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(selectQuery);
            while (result.next()) {
//                SET THE VALUE OF ROW FROM THE CULOMN WITH THE VALUE TAKEN FROM THE DATABASE
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
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

<<<<<<< HEAD
        Connection conn = null;
        Statement stmt = null;

=======
//                            Object [row] [culomn]
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
        Object[][] data = new Object[10][6];

        String selectQuery;

        selectQuery = "SELECT * from `medicine` WHERE Med_For = 'Headache'";
        try {
            int cols = 0;
<<<<<<< HEAD
            conn = new CRUD().connectToDB();
=======
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/butanon", "root", "");
>>>>>>> 6844e25c058211af9288e0820bfdd8c7e55c196d
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
            conn.close();
            System.out.println(result);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

}
