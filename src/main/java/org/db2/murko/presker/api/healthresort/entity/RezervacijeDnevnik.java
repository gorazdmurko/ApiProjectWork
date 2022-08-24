package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rezervacije_dnevnik")
public class RezervacijeDnevnik {

    @Id
    private Integer id_rezervacije_dnevnik;
    private Date datum_cas;
    private String uporabnik;
    private String operacija;
    private Integer kljuc;

    public Integer getId_rezervacije_dnevnik() {
        return id_rezervacije_dnevnik;
    }

    public void setId_rezervacije_dnevnik(Integer id_rezervacije_dnevnik) {
        this.id_rezervacije_dnevnik = id_rezervacije_dnevnik;
    }

    public Date getDatum_cas() {
        return datum_cas;
    }

    public void setDatum_cas(Date datum_cas) {
        this.datum_cas = datum_cas;
    }

    public String getUporabnik() {
        return uporabnik;
    }

    public void setUporabnik(String uporabnik) {
        this.uporabnik = uporabnik;
    }

    public String getOperacija() {
        return operacija;
    }

    public void setOperacija(String operacija) {
        this.operacija = operacija;
    }

    public Integer getKljuc() {
        return kljuc;
    }

    public void setKljuc(Integer kljuc) {
        this.kljuc = kljuc;
    }

    @Override
    public String toString() {
        return "RezervacijeDnevnik{" +
                "id_rezervacije_dnevnik=" + id_rezervacije_dnevnik +
                ", datum_cas=" + datum_cas +
                ", datum='" + uporabnik + '\'' +
                ", operacija='" + operacija + '\'' +
                ", kljuc=" + kljuc +
                '}';
    }
}
