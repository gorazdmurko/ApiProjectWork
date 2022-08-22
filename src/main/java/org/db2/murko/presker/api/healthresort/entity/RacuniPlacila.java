package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "racuni_placila")
public class RacuniPlacila {

    @Id
    private int id_racuni_placila;
    private Date datum;
    private Double znesek;
    private int id_vrste_placil;
    private int id_izdani_racuni;

    public int getId_racuni_placila() {
        return id_racuni_placila;
    }

    public void setId_racuni_placila(int id_racuni_placila) {
        this.id_racuni_placila = id_racuni_placila;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Double getZnesek() {
        return znesek;
    }

    public void setZnesek(Double znesek) {
        this.znesek = znesek;
    }

    public int getId_vrste_placil() {
        return id_vrste_placil;
    }

    public void setId_vrste_placil(int id_vrste_placil) {
        this.id_vrste_placil = id_vrste_placil;
    }

    public int getId_izdani_racuni() {
        return id_izdani_racuni;
    }

    public void setId_izdani_racuni(int id_izdani_racuni) {
        this.id_izdani_racuni = id_izdani_racuni;
    }

    @Override
    public String toString() {
        return "RacuniPlacila{" +
                "id_racuni_placila=" + id_racuni_placila +
                ", datum=" + datum +
                ", znesek=" + znesek +
                ", id_vrste_placil=" + id_vrste_placil +
                ", id_izdani_racuni=" + id_izdani_racuni +
                '}';
    }
}
