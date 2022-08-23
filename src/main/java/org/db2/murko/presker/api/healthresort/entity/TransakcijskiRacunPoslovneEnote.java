package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transakcijski_racuni_poslovne_enote")
public class TransakcijskiRacunPoslovneEnote {

    @Id
    private int id_transakcijski_racuni_poslovne_enote;
    private String transakcijski_racun;
    private int id_poslovne_enote;
    private int id_pp_banke;
    private boolean privzeti;

    public int getId_transakcijski_racuni_poslovne_enote() {
        return id_transakcijski_racuni_poslovne_enote;
    }

    public void setId_transakcijski_racuni_poslovne_enote(int id_transakcijski_racuni_poslovne_enote) {
        this.id_transakcijski_racuni_poslovne_enote = id_transakcijski_racuni_poslovne_enote;
    }

    public String getTransakcijski_racun() {
        return transakcijski_racun;
    }

    public void setTransakcijski_racun(String transakcijski_racun) {
        this.transakcijski_racun = transakcijski_racun;
    }

    public int getId_poslovne_enote() {
        return id_poslovne_enote;
    }

    public void setId_poslovne_enote(int id_poslovne_enote) {
        this.id_poslovne_enote = id_poslovne_enote;
    }

    public int getId_pp_banke() {
        return id_pp_banke;
    }

    public void setId_pp_banke(int id_pp_banke) {
        this.id_pp_banke = id_pp_banke;
    }

    public boolean isPrivzeti() {
        return privzeti;
    }

    public void setPrivzeti(boolean privzeti) {
        this.privzeti = privzeti;
    }

    @Override
    public String toString() {
        return "TransakcijskiRacunPoslovneEnote{" +
                "id_transakcijski_racuni_poslovne_enote=" + id_transakcijski_racuni_poslovne_enote +
                ", transakcijski_racun='" + transakcijski_racun + '\'' +
                ", id_poslovne_enote=" + id_poslovne_enote +
                ", id_pp_banke=" + id_pp_banke +
                ", privzeti=" + privzeti +
                '}';
    }
}
