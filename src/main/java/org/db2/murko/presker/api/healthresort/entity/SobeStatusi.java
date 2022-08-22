package org.db2.murko.presker.api.healthresort.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sobe_statusi")
public class SobeStatusi {

    @Id
    private int id_sobe_statusi;
    private String sobe_status;

    public int getId_sobe_statusi() {
        return id_sobe_statusi;
    }

    public void setId_sobe_statusi(int id_sobe_statusi) {
        this.id_sobe_statusi = id_sobe_statusi;
    }

    public String getSobe_status() {
        return sobe_status;
    }

    public void setSobe_status(String sobe_status) {
        this.sobe_status = sobe_status;
    }

    @Override
    public String toString() {
        return "SobeStatusi{" +
                "id_sobe_statusi=" + id_sobe_statusi +
                ", sobe_status='" + sobe_status + '\'' +
                '}';
    }
}
