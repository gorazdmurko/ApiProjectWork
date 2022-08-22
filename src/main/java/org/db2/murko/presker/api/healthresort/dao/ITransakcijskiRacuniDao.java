package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacuni;

import java.util.List;

public interface ITransakcijskiRacuniDao {

    int create(TransakcijskiRacuni racun);
    TransakcijskiRacuni get(Integer id);
    List<TransakcijskiRacuni> getAll();
}
