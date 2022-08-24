package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "rezervacije")
public class Rezervacije {

    @Id
    private int id_rezervacije;
    private int id_poslovne_enote;
    private int id_osebe_gosti;
    private String stevilka_rezervacije;
    private Date datum_cas;
    private Date datum_prihod;
    private Date datum_odhod;
    private int id_zaposleni;

    public int getId_rezervacije() {
        return id_rezervacije;
    }

    public void setId_rezervacije(int id_rezervacije) {
        this.id_rezervacije = id_rezervacije;
    }

    public int getId_poslovne_enote() {
        return id_poslovne_enote;
    }

    public void setId_poslovne_enote(int id_poslovne_enote) {
        this.id_poslovne_enote = id_poslovne_enote;
    }

    public int getId_osebe_gosti() {
        return id_osebe_gosti;
    }

    public void setId_osebe_gosti(int id_osebe_gosti) {
        this.id_osebe_gosti = id_osebe_gosti;
    }

    public String getStevilka_rezervacije() {
        return stevilka_rezervacije;
    }

    public void setStevilka_rezervacije(String stevilka_rezervacije) {
        this.stevilka_rezervacije = stevilka_rezervacije;
    }

    public Date getDatum_cas() {
        return datum_cas;
    }

    public void setDatum_cas(Date datum_cas) {
        this.datum_cas = datum_cas;
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

    public int getId_zaposleni() {
        return id_zaposleni;
    }

    public void setId_zaposleni(int id_zaposleni) {
        this.id_zaposleni = id_zaposleni;
    }

    @Override
    public String toString() {
        return "Rezervacije{" +
                "id_rezervacije=" + id_rezervacije +
                ", id_poslovne_enote=" + id_poslovne_enote +
                ", id_osebe_gosti=" + id_osebe_gosti +
                ", stevilka_rezervacije='" + stevilka_rezervacije + '\'' +
                ", datum_cas=" + datum_cas +
                ", datum_prihod=" + datum_prihod +
                ", datum_odhod=" + datum_odhod +
                ", id_zaposleni=" + id_zaposleni +
                '}';
    }
}
