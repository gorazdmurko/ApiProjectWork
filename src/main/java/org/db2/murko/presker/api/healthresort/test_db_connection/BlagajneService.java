package org.db2.murko.presker.api.healthresort.test_db_connection;

import org.db2.murko.presker.api.healthresort.entity.Blagajne;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BlagajneService {

    private static Connection connection;
    public static final String DB_NAME = "health_resort";
    public static final String DB_PROPERTIES = "?user=postgres&password=postgres&ssl=false";
    // https://jdbc.postgresql.org/documentation/80/connect.html
    public static final String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/" + DB_NAME + DB_PROPERTIES;

    // MAIN
    public static void main(String[] args) {

        BlagajneService datasource = new BlagajneService();

        // 1. OPEN DATASOURCE
        if (!datasource.open()) {
            System.out.println("Can't open datasource.");
            return;
        }

        List<Blagajne> blagajne = getBlagajne();

        if (blagajne == null) {
            System.out.println("No blagajne!");
            return;
        }

        // print out list of blagajne
        for (Blagajne blagajna : blagajne) {
            System.out.println("ID = " + blagajna.getId_blagajne() + ", OZNAKA_BLAGAJNE = " + blagajna.getOznaka_blagajne() + ", ID_ENOTE = " + blagajna.getId_poslovne_enote());
        }

        // close datasource
        System.out.println("\nClosing the database.....\n");
        datasource.close();
    }


    // open method
    public boolean open() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    // close method
    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    // fetch from DB
    public static List<Blagajne> getBlagajne() {
        StringBuilder sb = new StringBuilder("SELECT * FROM ");     // select * from blagajne
        sb.append("blagajne");

        System.out.println("\nSQL statement = " + sb);

        try (Statement statement = connection.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<Blagajne> blagajne = new ArrayList<Blagajne>();
            while (results.next()) {
                Blagajne blagajna = new Blagajne();
                blagajna.setId_blagajne(results.getInt(1));
                blagajna.setOznaka_blagajne(results.getString(2));
                blagajna.setId_poslovne_enote(results.getInt(3));
                blagajne.add(blagajna);
            }
            return blagajne;

        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
}
