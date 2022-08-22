package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "zaposleni")
public class Zaposleni {

    @Id
    private int id_zaposleni;
    private Date zaposlitev_od;
    private Date zaposlitev_do;
    private int id_osebe;
    private int id_poslovne_enote;
    private String opis;

    public int getId_zaposleni() {
        return id_zaposleni;
    }

    public void setId_zaposleni(int id_zaposleni) {
        this.id_zaposleni = id_zaposleni;
    }

    public Date getZaposlitev_od() {
        return zaposlitev_od;
    }

    public void setZaposlitev_od(Date zaposlitev_od) {
        this.zaposlitev_od = zaposlitev_od;
    }

    public Date getZaposlitev_do() {
        return zaposlitev_do;
    }

    public void setZaposlitev_do(Date zaposlitev_do) {
        this.zaposlitev_do = zaposlitev_do;
    }

    public int getId_osebe() {
        return id_osebe;
    }

    public void setId_osebe(int id_osebe) {
        this.id_osebe = id_osebe;
    }

    public int getId_poslovne_enote() {
        return id_poslovne_enote;
    }

    public void setId_poslovne_enote(int id_poslovne_enote) {
        this.id_poslovne_enote = id_poslovne_enote;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Zaposleni{" +
                "id_zaposleni=" + id_zaposleni +
                ", zaposlitev_od=" + zaposlitev_od +
                ", zaposlitev_do=" + zaposlitev_do +
                ", id_osebe=" + id_osebe +
                ", id_poslovne_enote=" + id_poslovne_enote +
                ", opis='" + opis + '\'' +
                '}';
    }
}
