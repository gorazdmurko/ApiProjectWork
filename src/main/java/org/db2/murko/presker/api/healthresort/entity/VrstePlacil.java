package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vrste_placil")
public class VrstePlacil {

    @Id
    private int id_vrste_placil;
    private String vrsta_placila;

    public int getId_vrste_placil() {
        return id_vrste_placil;
    }

    public void setId_vrste_placil(int id_vrste_placil) {
        this.id_vrste_placil = id_vrste_placil;
    }

    public String getVrsta_placila() {
        return vrsta_placila;
    }

    public void setVrsta_placila(String vrsta_placila) {
        this.vrsta_placila = vrsta_placila;
    }

    @Override
    public String toString() {
        return "VrstePlacil{" +
                "id_vrste_placil=" + id_vrste_placil +
                ", vrsta_placila='" + vrsta_placila + '\'' +
                '}';
    }
}
