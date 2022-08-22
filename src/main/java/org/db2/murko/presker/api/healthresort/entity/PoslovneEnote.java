package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "poslovne_enote")
public class PoslovneEnote {

    @Id
    private int id_poslovne_enote;
    private String poslovna_enota;
    private String oznaka_poslovne_enote;
    private String kraj_izdaje_racuna;
    private int id_postne_stevilke;
    private String naslov;

    public int getId_poslovne_enote() {
        return id_poslovne_enote;
    }

    public void setId_poslovne_enote(int id_poslovne_enote) {
        this.id_poslovne_enote = id_poslovne_enote;
    }

    public String getPoslovna_enota() {
        return poslovna_enota;
    }

    public void setPoslovna_enota(String poslovna_enota) {
        this.poslovna_enota = poslovna_enota;
    }

    public String getOznaka_poslovne_enote() {
        return oznaka_poslovne_enote;
    }

    public void setOznaka_poslovne_enote(String oznaka_poslovne_enote) {
        this.oznaka_poslovne_enote = oznaka_poslovne_enote;
    }

    public String getKraj_izdaje_racuna() {
        return kraj_izdaje_racuna;
    }

    public void setKraj_izdaje_racuna(String kraj_izdaje_racuna) {
        this.kraj_izdaje_racuna = kraj_izdaje_racuna;
    }

    public int getId_postne_stevilke() {
        return id_postne_stevilke;
    }

    public void setId_postne_stevilke(int id_postne_stevilke) {
        this.id_postne_stevilke = id_postne_stevilke;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    @Override
    public String toString() {
        return "PoslovneEnote{" +
                "id_poslovne_enote=" + id_poslovne_enote +
                ", poslovna_enota='" + poslovna_enota + '\'' +
                ", oznaka_poslovne_enote='" + oznaka_poslovne_enote + '\'' +
                ", kraj_izdaje_racuna='" + kraj_izdaje_racuna + '\'' +
                ", id_postne_stevilke=" + id_postne_stevilke +
                ", naslov='" + naslov + '\'' +
                '}';
    }
}
