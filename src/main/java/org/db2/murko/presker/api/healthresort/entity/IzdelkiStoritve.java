package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "izdelki_storitve")
public class IzdelkiStoritve {

    @Id
    private int id_izdelki_storitve;
    private String izdelek_storitev;
    private String izdelek_storitev_k;
    private float prodajna_cena;
    private int id_kategorije;
    private int id_davcne_stopnje;
    private int id_pp_proizvajalci;
    private Boolean paket;
    private String opis;
    private int id_pp_zunanji_izvajalec;
    private Boolean zunanja_storitev;

    public int getId_izdelki_storitve() {
        return id_izdelki_storitve;
    }

    public void setId_izdelki_storitve(int id_izdelki_storitve) {
        this.id_izdelki_storitve = id_izdelki_storitve;
    }

    public String getIzdelek_storitev() {
        return izdelek_storitev;
    }

    public void setIzdelek_storitev(String izdelek_storitev) {
        this.izdelek_storitev = izdelek_storitev;
    }

    public String getIzdelek_storitev_k() {
        return izdelek_storitev_k;
    }

    public void setIzdelek_storitev_k(String izdelek_storitev_k) {
        this.izdelek_storitev_k = izdelek_storitev_k;
    }

    public float getProdajna_cena() {
        return prodajna_cena;
    }

    public void setProdajna_cena(float prodajna_cena) {
        this.prodajna_cena = prodajna_cena;
    }

    public int getId_kategorije() {
        return id_kategorije;
    }

    public void setId_kategorije(int id_kategorije) {
        this.id_kategorije = id_kategorije;
    }

    public int getId_davcne_stopnje() {
        return id_davcne_stopnje;
    }

    public void setId_davcne_stopnje(int id_davcne_stopnje) {
        this.id_davcne_stopnje = id_davcne_stopnje;
    }

    public int getId_pp_proizvajalci() {
        return id_pp_proizvajalci;
    }

    public void setId_pp_proizvajalci(int id_pp_proizvajalci) {
        this.id_pp_proizvajalci = id_pp_proizvajalci;
    }

    public Boolean getPaket() {
        return paket;
    }

    public void setPaket(Boolean paket) {
        this.paket = paket;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getId_pp_zunanji_izvajalec() {
        return id_pp_zunanji_izvajalec;
    }

    public void setId_pp_zunanji_izvajalec(int id_pp_zunanji_izvajalec) {
        this.id_pp_zunanji_izvajalec = id_pp_zunanji_izvajalec;
    }

    public Boolean getZunanja_storitev() {
        return zunanja_storitev;
    }

    public void setZunanja_storitev(Boolean zunanja_storitev) {
        this.zunanja_storitev = zunanja_storitev;
    }

    @Override
    public String toString() {
        return "IzdelkiStoritve{" +
                "id_izdelki_storitve=" + id_izdelki_storitve +
                ", izdelek_storitev='" + izdelek_storitev + '\'' +
                ", izdelek_storitev_k='" + izdelek_storitev_k + '\'' +
                ", prodajna_cena=" + prodajna_cena +
                ", id_kategorije=" + id_kategorije +
                ", id_davcne_stopnje=" + id_davcne_stopnje +
                ", id_pp_proizvajalci=" + id_pp_proizvajalci +
                ", paket=" + paket +
                ", opis='" + opis + '\'' +
                ", id_pp_zunanji_izvajalec=" + id_pp_zunanji_izvajalec +
                ", zunanje_storitve=" + zunanja_storitev +
                '}';
    }
}
