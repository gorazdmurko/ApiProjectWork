package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "izdelki_storitve_sobe")
public class IzdelkiStoritveSobe {

    @Id
    private int id_izdelki_storitve_sobe;
    private int id_rezervacije_sobe;
    private int id_izdelki_storitve;
    private float kolicina;

    public int getId_izdelki_storitve_sobe() {
        return id_izdelki_storitve_sobe;
    }

    public void setId_izdelki_storitve_sobe(int id_izdelki_storitve_sobe) {
        this.id_izdelki_storitve_sobe = id_izdelki_storitve_sobe;
    }

    public int getId_rezervacije_sobe() {
        return id_rezervacije_sobe;
    }

    public void setId_rezervacije_sobe(int id_rezervacije_sobe) {
        this.id_rezervacije_sobe = id_rezervacije_sobe;
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
        return "IzdelkiStoritveSobe{" +
                "id_izdelki_storitve_sobe=" + id_izdelki_storitve_sobe +
                ", id_rezervacije_sobe=" + id_rezervacije_sobe +
                ", id_izdelki_storitve=" + id_izdelki_storitve +
                ", kolicina=" + kolicina +
                '}';
    }
}
