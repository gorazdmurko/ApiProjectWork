package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paketi_pozicije")
public class PaketiPozicije {

    @Id
    private int id_paketi_pozicije;
    private int id_izdelki_storitve_paketi;
    private int id_izdelki_storitve;
    private float kolicina;

    public int getId_paketi_pozicije() {
        return id_paketi_pozicije;
    }

    public void setId_paketi_pozicije(int id_paketi_pozicije) {
        this.id_paketi_pozicije = id_paketi_pozicije;
    }

    public int getId_izdelki_storitve_paketi() {
        return id_izdelki_storitve_paketi;
    }

    public void setId_izdelki_storitve_paketi(int id_izdelki_storitve_paketi) {
        this.id_izdelki_storitve_paketi = id_izdelki_storitve_paketi;
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

    @Override
    public String toString() {
        return "PaketiPozicije{" +
                "id_paketi_pozicije=" + id_paketi_pozicije +
                ", id_izdelki_storitve_paketi=" + id_izdelki_storitve_paketi +
                ", id_izdelki_storitve=" + id_izdelki_storitve +
                ", kolicina=" + kolicina +
                '}';
    }
}
