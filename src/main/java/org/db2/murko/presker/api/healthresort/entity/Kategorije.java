package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kategorije")
public class Kategorije {

    @Id
    private int id_kategorije;
    private String kategorija;
    private String oznaka;
    private String opis;
    private int id_nadrejene_kategorije;

    public int getId_kategorije() {
        return id_kategorije;
    }

    public void setId_kategorije(int id_kategorije) {
        this.id_kategorije = id_kategorije;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getId_nadrejene_kategorije() {
        return id_nadrejene_kategorije;
    }

    public void setId_nadrejene_kategorije(int id_nadrejene_kategorije) {
        this.id_nadrejene_kategorije = id_nadrejene_kategorije;
    }

    @Override
    public String toString() {
        return "Kategorije{" +
                "id_kategorije=" + id_kategorije +
                ", kategorija='" + kategorija + '\'' +
                ", oznaka='" + oznaka + '\'' +
                ", opis='" + opis + '\'' +
                ", id_nadrejene_kategorije=" + id_nadrejene_kategorije +
                '}';
    }
}
