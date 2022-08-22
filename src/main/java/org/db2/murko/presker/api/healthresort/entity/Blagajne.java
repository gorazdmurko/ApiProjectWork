package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blagajne")
public class Blagajne {

    @Id
    private int id_blagajne;
    private String oznaka_blagajne;
    private int id_poslovne_enote;

    public Blagajne() {
    }

    public int getId_blagajne() {
        return id_blagajne;
    }

    public void setId_blagajne(int id_blagajne) {
        this.id_blagajne = id_blagajne;
    }

    public String getOznaka_blagajne() {
        return oznaka_blagajne;
    }

    public void setOznaka_blagajne(String oznaka_blagajne) {
        this.oznaka_blagajne = oznaka_blagajne;
    }

    public int getId_poslovne_enote() {
        return id_poslovne_enote;
    }

    public void setId_poslovne_enote(int id_poslovne_enote) {
        this.id_poslovne_enote = id_poslovne_enote;
    }

    @Override
    public String toString() {
        return "Blagajne{" +
                "id_blagajne=" + id_blagajne +
                ", oznaka_blagajne='" + oznaka_blagajne + '\'' +
                ", id_poslovne_enote=" + id_poslovne_enote +
                '}';
    }
}
