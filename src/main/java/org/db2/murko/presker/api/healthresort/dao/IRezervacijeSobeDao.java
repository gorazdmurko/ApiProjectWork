package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeSobe;

import java.util.List;

public interface IRezervacijeSobeDao {

    int create(RezervacijeSobe rezervacija);
    RezervacijeSobe get(Integer id);
    List<RezervacijeSobe> getAll();
}
