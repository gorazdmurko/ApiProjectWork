package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Rezervacije;

import java.util.List;

public interface IRezervacijeDao {

    int create(Rezervacije rezervacija);
    Rezervacije get(Integer id);
    List<Rezervacije> getAll();
}
