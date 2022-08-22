package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.RacuniPlacila;

import java.util.List;

public interface IRacuniPlacilaService {

    int save(RacuniPlacila racun);
    RacuniPlacila get(Integer id);
    List<RacuniPlacila> getAll();
}
