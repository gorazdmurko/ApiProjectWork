package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.RezervacijePozicije;

import java.util.List;

public interface IRezervacijePozicijeDao {

    int create(RezervacijePozicije rezervacija);
    RezervacijePozicije get(Integer id);
    List<RezervacijePozicije> getAll();
}
