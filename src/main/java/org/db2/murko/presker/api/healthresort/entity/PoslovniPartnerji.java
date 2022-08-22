package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poslovni_partnerji")
public class PoslovniPartnerji {

    @Id
    private int id_poslovni_partnerji;
    private int id_postne_stevilke;
    private String naziv1;
    private String naziv2;
    private String davcna_stevilka;
    private String maticna_stevilka;
    private String naslov;
    private String e_naslov;
    private String telefon;

    public int getId_poslovni_partnerji() {
        return id_poslovni_partnerji;
    }

    public void setId_poslovni_partnerji(int id_poslovni_partnerji) {
        this.id_poslovni_partnerji = id_poslovni_partnerji;
    }

    public int getId_postne_stevilke() {
        return id_postne_stevilke;
    }

    public void setId_postne_stevilke(int id_postne_stevilke) {
        this.id_postne_stevilke = id_postne_stevilke;
    }

    public String getNaziv1() {
        return naziv1;
    }

    public void setNaziv1(String naziv1) {
        this.naziv1 = naziv1;
    }

    public String getNaziv2() {
        return naziv2;
    }

    public void setNaziv2(String naziv2) {
        this.naziv2 = naziv2;
    }

    public String getDavcna_stevilka() {
        return davcna_stevilka;
    }

    public void setDavcna_stevilka(String davcna_stevilka) {
        this.davcna_stevilka = davcna_stevilka;
    }

    public String getMaticna_stevilka() {
        return maticna_stevilka;
    }

    public void setMaticna_stevilka(String maticna_stevilka) {
        this.maticna_stevilka = maticna_stevilka;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getE_naslov() {
        return e_naslov;
    }

    public void setE_naslov(String e_naslov) {
        this.e_naslov = e_naslov;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "PoslovniPartnerji{" +
                "id_poslovni_partnerji=" + id_poslovni_partnerji +
                ", id_postne_stevilke=" + id_postne_stevilke +
                ", naziv1='" + naziv1 + '\'' +
                ", naziv2='" + naziv2 + '\'' +
                ", davcna_stevilka='" + davcna_stevilka + '\'' +
                ", maticna_stevilka='" + maticna_stevilka + '\'' +
                ", naslov='" + naslov + '\'' +
                ", e_naslov='" + e_naslov + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
