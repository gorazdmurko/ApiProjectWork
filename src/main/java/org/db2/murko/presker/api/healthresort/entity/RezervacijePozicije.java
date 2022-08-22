package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rezervacije_pozicije")
public class RezervacijePozicije {

    @Id
    private int id_rezervacije_pozicije;
    private int id_rezervacije;
    private int id_izdelki_storitve;
    private float kolicina;
    private float prodajna_cena;
    private float popust;
    private Date datum_prihod;
    private Date datum_odhod;

    public int getId_rezervacije_pozicije() {
        return id_rezervacije_pozicije;
    }

    public void setId_rezervacije_pozicije(int id_rezervacije_pozicije) {
        this.id_rezervacije_pozicije = id_rezervacije_pozicije;
    }

    public int getId_rezervacije() {
        return id_rezervacije;
    }

    public void setId_rezervacije(int id_rezervacije) {
        this.id_rezervacije = id_rezervacije;
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

    public float getProdajna_cena() {
        return prodajna_cena;
    }

    public void setProdajna_cena(float prodajna_cena) {
        this.prodajna_cena = prodajna_cena;
    }

    public float getPopust() {
        return popust;
    }

    public void setPopust(float popust) {
        this.popust = popust;
    }

    public Date getDatum_prihod() {
        return datum_prihod;
    }

    public void setDatum_prihod(Date datum_prihod) {
        this.datum_prihod = datum_prihod;
    }

    public Date getDatum_odhod() {
        return datum_odhod;
    }

    public void setDatum_odhod(Date datum_odhod) {
        this.datum_odhod = datum_odhod;
    }

    @Override
    public String toString() {
        return "RezervacijePozicije{" +
                "id_rezervacije_pozicije=" + id_rezervacije_pozicije +
                ", id_rezervacije=" + id_rezervacije +
                ", id_izdelki_storitve=" + id_izdelki_storitve +
                ", kolicina=" + kolicina +
                ", prodajna_cena=" + prodajna_cena +
                ", popust=" + popust +
                ", datum_prihod=" + datum_prihod +
                ", datum_odhod=" + datum_odhod +
                '}';
    }
}
