package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeDnevnik;

import java.util.List;

public interface IRezervacijeDnevnikService {

    int save(RezervacijeDnevnik dnevnik);
    RezervacijeDnevnik getRezervacijeDnevnik(Integer id);
    List<RezervacijeDnevnik> getRezervacijeDnevnikAll();
}
