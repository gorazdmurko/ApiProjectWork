package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rezervacije_sobe")
public class RezervacijeSobe {

    @Id
    private int id_rezervacije_sobe;
    private int id_rezervacije;
    private int id_sobe;
    private Date datum_od;
    private Date datum_do;

    public int getId_rezervacije_sobe() {
        return id_rezervacije_sobe;
    }

    public void setId_rezervacije_sobe(int id_rezervacije_sobe) {
        this.id_rezervacije_sobe = id_rezervacije_sobe;
    }

    public int getId_rezervacije() {
        return id_rezervacije;
    }

    public void setId_rezervacije(int id_rezervacije) {
        this.id_rezervacije = id_rezervacije;
    }

    public int getId_sobe() {
        return id_sobe;
    }

    public void setId_sobe(int id_sobe) {
        this.id_sobe = id_sobe;
    }

    public Date getDatum_od() {
        return datum_od;
    }

    public void setDatum_od(Date datum_od) {
        this.datum_od = datum_od;
    }

    public Date getDatum_do() {
        return datum_do;
    }

    public void setDatum_do(Date datum_do) {
        this.datum_do = datum_do;
    }

    @Override
    public String toString() {
        return "RezervacijeSobe{" +
                "id_rezervacije_sobe=" + id_rezervacije_sobe +
                ", id_rezervacije=" + id_rezervacije +
                ", id_sobe=" + id_sobe +
                ", datum_od=" + datum_od +
                ", datum_do=" + datum_do +
                '}';
    }
}
