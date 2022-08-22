package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.RacuniPlacila;

import java.util.List;

public interface IRacuniPlacilaDao {

    int create(RacuniPlacila racun);
    RacuniPlacila get(Integer id);
    List<RacuniPlacila> getAll();
}
