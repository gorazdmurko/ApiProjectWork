package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "dodatne_storitve_postavke")
public class DodatneStoritvePostavke {

    @Id
    private int id_dodatne_storitve_postavke;
    private int id_rezervacije_dodatne_storitve;
    private int id_izdelki_storitve;
    private float kolicina;
    private float popust;
    private Date cas_zacetek;
    private Date cas_konec;
    private String opis;

    public int getId_dodatne_storitve_postavke() {
        return id_dodatne_storitve_postavke;
    }

    public void setId_dodatne_storitve_postavke(int id_dodatne_storitve_postavke) {
        this.id_dodatne_storitve_postavke = id_dodatne_storitve_postavke;
    }

    public int getId_rezervacije_dodatne_storitve() {
        return id_rezervacije_dodatne_storitve;
    }

    public void setId_rezervacije_dodatne_storitve(int id_rezervacije_dodatne_storitve) {
        this.id_rezervacije_dodatne_storitve = id_rezervacije_dodatne_storitve;
    }

    public int getId_izdelki_storitve() {
        return id_izdelki_storitve;
    }

    public void setId_izdelki_storitve(int id_izdelki_storitve) {
        this.id_izdelki_storitve = id_izdelki_storitve;
    }

    public float getKolicina() {
        return kolicina;
    }

    public void setKolicina(float kolicina) {
        this.kolicina = kolicina;
    }

    public float getPopust() {
        return popust;
    }

    public void setPopust(float popust) {
        this.popust = popust;
    }

    public Date getCas_zacetek() {
        return cas_zacetek;
    }

    public void setCas_zacetek(Date cas_zacetek) {
        this.cas_zacetek = cas_zacetek;
    }

    public Date getCas_konec() {
        return cas_konec;
    }

    public void setCas_konec(Date cas_konec) {
        this.cas_konec = cas_konec;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "DodatneStoritvePostavke{" +
                "id_dodatne_storitve_postavke=" + id_dodatne_storitve_postavke +
                ", id_rezervacije_dodatne_storitve=" + id_rezervacije_dodatne_storitve +
                ", id_izdelki_storitve=" + id_izdelki_storitve +
                ", kolicina=" + kolicina +
                ", popust=" + popust +
                ", cas_zacetek=" + cas_zacetek +
                ", cas_konec=" + cas_konec +
                ", opis='" + opis + '\'' +
                '}';
    }
}
