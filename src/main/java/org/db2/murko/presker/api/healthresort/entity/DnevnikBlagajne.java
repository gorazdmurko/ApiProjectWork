package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "dnevnik_blagajne")
public class DnevnikBlagajne {

    @Id
    private Integer id_dnevnik_blagajne;
    private Date datum_cas;
    private String uporabnik;
    private String operacija;
    private Integer kljuc;

    public Integer getId_dnevnik_blagajne() {
        return id_dnevnik_blagajne;
    }

    public void setId_dnevnik_blagajne(Integer id_dnevnik_blagajne) {
        this.id_dnevnik_blagajne = id_dnevnik_blagajne;
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
        return "DnevnikBlagajne{" +
                "id_dnevnik_blagajne=" + id_dnevnik_blagajne +
                ", datum_cas=" + datum_cas +
                ", uporabnik='" + uporabnik + '\'' +
                ", operacija='" + operacija + '\'' +
                ", kljuc=" + kljuc +
                '}';
    }
}
