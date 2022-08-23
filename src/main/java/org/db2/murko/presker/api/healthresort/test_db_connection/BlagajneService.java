package org.db2.murko.presker.api.healthresort.test_db_connection;

import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuni;

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


        List<IzdaniRacuni> racuni = getEOR();
        if (racuni == null) {
            System.out.println("No Racuni!");
        }

        for (IzdaniRacuni racun : racuni) {
            racun.toString();
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

    public static List<IzdaniRacuni> getEOR() {
        StringBuilder sb = new StringBuilder("SELECT * FROM ");     // select * from blagajne
        sb.append("izdani_racuni");

        try (Statement statement = connection.createStatement();
             ResultSet results = statement.executeQuery(sb.toString())) {

            List<IzdaniRacuni> racuni = new ArrayList<IzdaniRacuni>();
            while (results.next()) {
                IzdaniRacuni racun = new IzdaniRacuni();
                racun.setId_izdani_racuni(results.getInt(1));
                racun.setSt_racuna(results.getFloat(2));
                racun.setDatum_racuna(results.getLong(3));
                racun.setId_poslovne_enote(results.getInt(4));
                racun.setId_blagajne(results.getInt(5));
                racun.setId_zaposleni(results.getInt(6));
                racun.setZoi(results.getString(7));
                racun.setEor(results.getString(8));
                racun.setId_transakcijski_racuni_poslovne_enote(results.getInt(9));
                racun.setId_blagajne(results.getInt(10));
            }
            return racuni;

        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
}
