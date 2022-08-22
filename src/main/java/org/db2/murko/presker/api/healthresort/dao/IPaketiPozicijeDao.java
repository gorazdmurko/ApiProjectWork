package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.PaketiPozicije;

import java.util.List;

public interface IPaketiPozicijeDao {

    int create(PaketiPozicije paket);
    PaketiPozicije get(Integer id);
    List<PaketiPozicije> getAll();
}
