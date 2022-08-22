package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "postne_stevilke")
public class PostneStevilke {

    @Id
    private int id_postne_stevilke;
    private String postna_stevilka;
    private String kraj_mesto;
    private int id_drzave;

    public int getId_postne_stevilke() {
        return id_postne_stevilke;
    }

    public void setId_postne_stevilke(int id_postne_stevilke) {
        this.id_postne_stevilke = id_postne_stevilke;
    }

    public String getPostna_stevilka() {
        return postna_stevilka;
    }

    public void setPostna_stevilka(String postna_stevilka) {
        this.postna_stevilka = postna_stevilka;
    }

    public String getKraj_mesto() {
        return kraj_mesto;
    }

    public void setKraj_mesto(String kraj_mesto) {
        this.kraj_mesto = kraj_mesto;
    }

    public int getId_drzave() {
        return id_drzave;
    }

    public void setId_drzave(int id_drzave) {
        this.id_drzave = id_drzave;
    }

    @Override
    public String toString() {
        return "PostneStevilke{" +
                "id_postne_stevilke=" + id_postne_stevilke +
                ", postna_stevilka='" + postna_stevilka + '\'' +
                ", kraj_mesto='" + kraj_mesto + '\'' +
                ", id_drzave=" + id_drzave +
                '}';
    }
}
