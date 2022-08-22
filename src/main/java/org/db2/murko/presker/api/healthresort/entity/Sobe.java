package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sobe")
public class Sobe {

    @Id
    private int id_sobe;
    private String stevilka_sobe;
    private int id_objekti;
    private int id_kategorije;
    private int id_sobe_statusi;

    public int getId_sobe() {
        return id_sobe;
    }

    public void setId_sobe(int id_sobe) {
        this.id_sobe = id_sobe;
    }

    public String getStevilka_sobe() {
        return stevilka_sobe;
    }

    public void setStevilka_sobe(String stevilka_sobe) {
        this.stevilka_sobe = stevilka_sobe;
    }

    public int getId_objekti() {
        return id_objekti;
    }

    public void setId_objekti(int id_objekti) {
        this.id_objekti = id_objekti;
    }

    public int getId_kategorije() {
        return id_kategorije;
    }

    public void setId_kategorije(int id_kategorije) {
        this.id_kategorije = id_kategorije;
    }

    public int getId_sobe_statusi() {
        return id_sobe_statusi;
    }

    public void setId_sobe_statusi(int id_sobe_statusi) {
        this.id_sobe_statusi = id_sobe_statusi;
    }

    @Override
    public String toString() {
        return "Sobe{" +
                "id_sobe=" + id_sobe +
                ", stevilka_sobe='" + stevilka_sobe + '\'' +
                ", id_objekti=" + id_objekti +
                ", id_kategorije=" + id_kategorije +
                ", id_sobe_statusi=" + id_sobe_statusi +
                '}';
    }
}
