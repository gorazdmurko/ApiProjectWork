package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "oddelki")
public class Oddelki {

    @Id
    private int id_oddelki;
    private String oddelek_naziv;
    private String stevilka_oddelka;
    private int id_poslovne_enote_zdravilisca;
    private String telefon;
    private String opis;
    private int id_pp_zunanji_izvajalec;

    public int getId_oddelki() {
        return id_oddelki;
    }

    public void setId_oddelki(int id_oddelki) {
        this.id_oddelki = id_oddelki;
    }

    public String getOddelek_naziv() {
        return oddelek_naziv;
    }

    public void setOddelek_naziv(String oddelek_naziv) {
        this.oddelek_naziv = oddelek_naziv;
    }

    public String getStevilka_oddelka() {
        return stevilka_oddelka;
    }

    public void setStevilka_oddelka(String stevilka_oddelka) {
        this.stevilka_oddelka = stevilka_oddelka;
    }

    public int getId_poslovne_enote_zdravilisca() {
        return id_poslovne_enote_zdravilisca;
    }

    public void setId_poslovne_enote_zdravilisca(int id_poslovne_enote_zdravilisca) {
        this.id_poslovne_enote_zdravilisca = id_poslovne_enote_zdravilisca;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getId_pp_zunanji_izvajalec() {
        return id_pp_zunanji_izvajalec;
    }

    public void setId_pp_zunanji_izvajalec(int id_pp_zunanji_izvajalec) {
        this.id_pp_zunanji_izvajalec = id_pp_zunanji_izvajalec;
    }

    @Override
    public String toString() {
        return "Oddelki{" +
                "id_oddelki=" + id_oddelki +
                ", oddelek_naziv='" + oddelek_naziv + '\'' +
                ", stevilka_oddelka='" + stevilka_oddelka + '\'' +
                ", id_poslovne_enote_zdravilisca=" + id_poslovne_enote_zdravilisca +
                ", telefon='" + telefon + '\'' +
                ", opis='" + opis + '\'' +
                ", id_pp_zunanji_izvajalec=" + id_pp_zunanji_izvajalec +
                '}';
    }
}
