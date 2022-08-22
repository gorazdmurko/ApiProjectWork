package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacuni;

import java.util.List;

public interface ITransakcijskiRacuniServis {

    int save(TransakcijskiRacuni racun);
    TransakcijskiRacuni get(Integer id);
    List<TransakcijskiRacuni> getAll();
}
