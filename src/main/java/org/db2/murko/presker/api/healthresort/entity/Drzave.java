package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "drzave")
public class Drzave {

    @Id
    private int id_drzave;
    private String drzava;
    private String oznaka_drzave;

    public int getId_drzave() {
        return id_drzave;
    }

    public void setId_drzave(int id_drzave) {
        this.id_drzave = id_drzave;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getOznaka_drzave() {
        return oznaka_drzave;
    }

    public void setOznaka_drzave(String oznaka_drzave) {
        this.oznaka_drzave = oznaka_drzave;
    }

    @Override
    public String toString() {
        return "Drzave{" +
                "id_drzave=" + id_drzave +
                ", drzava='" + drzava + '\'' +
                ", oznaka_drzave='" + oznaka_drzave + '\'' +
                '}';
    }
}
