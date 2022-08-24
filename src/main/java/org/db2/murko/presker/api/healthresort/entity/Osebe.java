package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "osebe")
public class Osebe {

    @Id
    private int id_osebe;
    private String ime;
    private String priimek;
    private String emso;
    private String spol;
    private Date datum_rojstva;
    private String naslov;
    private String davcna_stevilka;
    private int id_postne_stevilke;

    public int getId_osebe() {
        return id_osebe;
    }

    public void setId_osebe(int id_osebe) {
        this.id_osebe = id_osebe;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public String getEmso() {
        return emso;
    }

    public void setEmso(String emso) {
        this.emso = emso;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public Date getDatum_rojstva() {
        return datum_rojstva;
    }

    public void setDatum_rojstva(Date datum_rojstva) {
        this.datum_rojstva = datum_rojstva;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getDavcna_stevilka() {
        return davcna_stevilka;
    }

    public void setDavcna_stevilka(String davcna_stevilka) {
        this.davcna_stevilka = davcna_stevilka;
    }

    public int getId_postne_stevilke() {
        return id_postne_stevilke;
    }

    public void setId_postne_stevilke(int id_postne_stevilke) {
        this.id_postne_stevilke = id_postne_stevilke;
    }

    @Override
    public String toString() {
        return "Osebe{" +
                "id_osebe=" + id_osebe +
                ", ime='" + ime + '\'' +
                ", priimek='" + priimek + '\'' +
                ", emso='" + emso + '\'' +
                ", spol='" + spol + '\'' +
                ", datum_rojstva=" + datum_rojstva +
                ", naslov='" + naslov + '\'' +
                ", davcna_stevilka='" + davcna_stevilka + '\'' +
                ", id_postne_stevilke=" + id_postne_stevilke +
                '}';
    }
}
