package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rezervacije_dodatne_storitve")
public class RezervacijeDodatneStoritve {

    @Id
    private int id_rezervacije_dodatne_storitve;
    private Date datum_rezervacije;
    private int id_osebe;
    private int id_oddelki;
    private String opis;

    public int getId_rezervacije_dodatne_storitve() {
        return id_rezervacije_dodatne_storitve;
    }

    public void setId_rezervacije_dodatne_storitve(int id_rezervacije_dodatne_storitve) {
        this.id_rezervacije_dodatne_storitve = id_rezervacije_dodatne_storitve;
    }

    public Date getDatum_rezervacije() {
        return datum_rezervacije;
    }

    public void setDatum_rezervacije(Date datum_rezervacije) {
        this.datum_rezervacije = datum_rezervacije;
    }

    public int getId_osebe() {
        return id_osebe;
    }

    public void setId_osebe(int id_osebe) {
        this.id_osebe = id_osebe;
    }

    public int getId_oddelki() {
        return id_oddelki;
    }

    public void setId_oddelki(int id_oddelki) {
        this.id_oddelki = id_oddelki;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "RezervacijeDodatneStoritve{" +
                "id_rezervacije_dodatne_storitve=" + id_rezervacije_dodatne_storitve +
                ", datum_rezervacije=" + datum_rezervacije +
                ", id_osebe=" + id_osebe +
                ", id_oddelki=" + id_oddelki +
                ", opis='" + opis + '\'' +
                '}';
    }
}
