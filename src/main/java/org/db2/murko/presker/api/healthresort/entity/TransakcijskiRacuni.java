package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transakcijski_racuni")
public class TransakcijskiRacuni {

    @Id
    private int id_transakcijski_racuni;
    private String transakcijski_racun;
    private int id_poslovni_partnerji;
    private int id_pp_banke;

    public int getId_transakcijski_racuni() {
        return id_transakcijski_racuni;
    }

    public void setId_transakcijski_racuni(int id_transakcijski_racuni) {
        this.id_transakcijski_racuni = id_transakcijski_racuni;
    }

    public String getTransakcijski_racun() {
        return transakcijski_racun;
    }

    public void setTransakcijski_racun(String transakcijski_racun) {
        this.transakcijski_racun = transakcijski_racun;
    }

    public int getId_poslovni_partnerji() {
        return id_poslovni_partnerji;
    }

    public void setId_poslovni_partnerji(int id_poslovni_partnerji) {
        this.id_poslovni_partnerji = id_poslovni_partnerji;
    }

    public int getId_pp_banke() {
        return id_pp_banke;
    }

    public void setId_pp_banke(int id_pp_banke) {
        this.id_pp_banke = id_pp_banke;
    }

    @Override
    public String toString() {
        return "TransakcijskiRacuni{" +
                "id_transakcijski_racuni=" + id_transakcijski_racuni +
                ", transakcijski_racun='" + transakcijski_racun + '\'' +
                ", id_poslovni_partnerji=" + id_poslovni_partnerji +
                ", id_pp_banke=" + id_pp_banke +
                '}';
    }
}
