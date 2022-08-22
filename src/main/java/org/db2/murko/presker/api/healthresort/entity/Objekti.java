package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objekti")
public class Objekti {

    @Id
    private int id_objekti;
    private String objekt;
    private String opis;
    private int id_poslovne_enote;

    public int getId_objekti() {
        return id_objekti;
    }

    public void setId_objekti(int id_objekti) {
        this.id_objekti = id_objekti;
    }

    public String getObjekt() {
        return objekt;
    }

    public void setObjekt(String objekt) {
        this.objekt = objekt;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getId_poslovne_enote() {
        return id_poslovne_enote;
    }

    public void setId_poslovne_enote(int id_poslovne_enote) {
        this.id_poslovne_enote = id_poslovne_enote;
    }

    @Override
    public String toString() {
        return "Objekti{" +
                "id_objekti=" + id_objekti +
                ", objekt='" + objekt + '\'' +
                ", opis='" + opis + '\'' +
                ", id_poslovne_enote=" + id_poslovne_enote +
                '}';
    }
}
