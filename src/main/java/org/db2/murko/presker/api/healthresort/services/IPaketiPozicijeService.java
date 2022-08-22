package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.PaketiPozicije;

import java.util.List;

public interface IPaketiPozicijeService {

    int save(PaketiPozicije paket);
    PaketiPozicije get(Integer id);
    List<PaketiPozicije> getAll();
}
