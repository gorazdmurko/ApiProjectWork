package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "izdani_racuni_postavke")
public class IzdaniRacuniPostavke {

    @Id
    private int id_izdani_racuni_postavke;
    private int id_izdani_racuni;
    private int id_izdelki_storitve;
    private float kolicina;
    private float popust;
    private float odstotek_ddv;
    private int id_davcne_stopnje;
    private Boolean placa_zzzs;

    public int getId_izdani_racuni_postavke() {
        return id_izdani_racuni_postavke;
    }

    public void setId_izdani_racuni_postavke(int id_izdani_racuni_postavke) {
        this.id_izdani_racuni_postavke = id_izdani_racuni_postavke;
    }

    public int getId_izdani_racuni() {
        return id_izdani_racuni;
    }

    public void setId_izdani_racuni(int id_izdani_racuni) {
        this.id_izdani_racuni = id_izdani_racuni;
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

    public float getOdstotek_ddv() {
        return odstotek_ddv;
    }

    public void setOdstotek_ddv(float odstotek_ddv) {
        this.odstotek_ddv = odstotek_ddv;
    }

    public int getId_davcne_stopnje() {
        return id_davcne_stopnje;
    }

    public void setId_davcne_stopnje(int id_davcne_stopnje) {
        this.id_davcne_stopnje = id_davcne_stopnje;
    }

    public Boolean getPlaca_zzzs() {
        return placa_zzzs;
    }

    public void setPlaca_zzzs(Boolean placa_zzzs) {
        this.placa_zzzs = placa_zzzs;
    }

    @Override
    public String toString() {
        return "IzdaniRacuniPostavke{" +
                "id_izdani_racuni_postavke=" + id_izdani_racuni_postavke +
                ", id_izdani_racuni=" + id_izdani_racuni +
                ", id_izdelki_storitve=" + id_izdelki_storitve +
                ", kolicina=" + kolicina +
                ", popust=" + popust +
                ", odstotek_ddv=" + odstotek_ddv +
                ", id_davcne_stopnje=" + id_davcne_stopnje +
                ", placa_zzzs=" + placa_zzzs +
                '}';
    }
}
