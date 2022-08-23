package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "izdani_racuni")
public class IzdaniRacuni {

    @Id
    private int id_izdani_racuni;
    private float st_racuna;
    private long datum_racuna;
    private int id_poslovne_enote;
    private int id_blagajne;
    private int id_zaposleni;
    // @Column(name = "\"ZOI\"")
    private String zoi;
    // @Column(name = "\"EOR\"")
    private String eor;
    private int id_transakcijski_racuni_poslovne_enote;
    private int id_rezervacije;

    public int getId_izdani_racuni() {
        return id_izdani_racuni;
    }

    public void setId_izdani_racuni(int id_izdani_racuni) {
        this.id_izdani_racuni = id_izdani_racuni;
    }

    public float getSt_racuna() {
        return st_racuna;
    }

    public void setSt_racuna(float st_racuna) {
        this.st_racuna = st_racuna;
    }

    public long getDatum_racuna() {
        return datum_racuna;
    }

    public void setDatum_racuna(long datum_racuna) {
        this.datum_racuna = datum_racuna;
    }

    public int getId_poslovne_enote() {
        return id_poslovne_enote;
    }

    public void setId_poslovne_enote(int id_poslovne_enote) {
        this.id_poslovne_enote = id_poslovne_enote;
    }

    public int getId_blagajne() {
        return id_blagajne;
    }

    public void setId_blagajne(int id_blagajne) {
        this.id_blagajne = id_blagajne;
    }

    public int getId_zaposleni() {
        return id_zaposleni;
    }

    public void setId_zaposleni(int id_zaposleni) {
        this.id_zaposleni = id_zaposleni;
    }

    public String getZoi() {
        return zoi;
    }

    public void setZoi(String zoi) {
        this.zoi = zoi;
    }

    public String getEor() {
        return eor;
    }

    public void setEor(String eor) {
        this.eor = eor;
    }

    public int getId_transakcijski_racuni_poslovne_enote() {
        return id_transakcijski_racuni_poslovne_enote;
    }

    public void setId_transakcijski_racuni_poslovne_enote(int id_transakcijski_racuni_poslovne_enote) {
        this.id_transakcijski_racuni_poslovne_enote = id_transakcijski_racuni_poslovne_enote;
    }

    public int getId_rezervacije() {
        return id_rezervacije;
    }

    public void setId_rezervacije(int id_rezervacije) {
        this.id_rezervacije = id_rezervacije;
    }

    @Override
    public String toString() {
        return "IzdaniRacuni{" +
                "id_izdani_racuni=" + id_izdani_racuni +
                ", st_racuna=" + st_racuna +
                ", datum_racuna=" + datum_racuna +
                ", id_poslovne_enote=" + id_poslovne_enote +
                ", id_blagajne=" + id_blagajne +
                ", id_zaposleni=" + id_zaposleni +
                ", ZOI='" + zoi + '\'' +
                ", EOR='" + eor + '\'' +
                ", id_transakcijski_racuni_poslovne_enote=" + id_transakcijski_racuni_poslovne_enote +
                ", id_rezervacije=" + id_rezervacije +
                '}';
    }
}
