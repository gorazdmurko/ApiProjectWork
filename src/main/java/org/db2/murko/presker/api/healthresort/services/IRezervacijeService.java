package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Rezervacije;

import java.util.List;

public interface IRezervacijeService {

    int save(Rezervacije rezervacija);
    Rezervacije get(Integer id);
    List<Rezervacije> getAll();
}
