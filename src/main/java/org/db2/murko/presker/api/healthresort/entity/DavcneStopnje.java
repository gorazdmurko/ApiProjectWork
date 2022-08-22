package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "davcne_stopnje")
public class DavcneStopnje {

    @Id
    private int id_davcne_stopnje;
    private String oznaka_ddv;
    private String davcna_stopnja;
    private float odstotek;

    public DavcneStopnje() {
    }

    public int getId_davcne_stopnje() {
        return id_davcne_stopnje;
    }

    public void setId_davcne_stopnje(int id_davcne_stopnje) {
        this.id_davcne_stopnje = id_davcne_stopnje;
    }

    public String getOznaka_ddv() {
        return oznaka_ddv;
    }

    public void setOznaka_ddv(String oznaka_ddv) {
        this.oznaka_ddv = oznaka_ddv;
    }

    public String getDavcna_stopnja() {
        return davcna_stopnja;
    }

    public void setDavcna_stopnja(String davcna_stopnja) {
        this.davcna_stopnja = davcna_stopnja;
    }

    public float getOdstotek() {
        return odstotek;
    }

    public void setOdstotek(float odstotek) {
        this.odstotek = odstotek;
    }

    @Override
    public String

    toString() {
        return "DavcneStopnje{" +
                "id_davcne_stopnje=" + id_davcne_stopnje +
                ", oznaka_ddv='" + oznaka_ddv + '\'' +
                ", davcna_stopnja='" + davcna_stopnja + '\'' +
                ", odstotek=" + odstotek +
                '}';
    }
}
