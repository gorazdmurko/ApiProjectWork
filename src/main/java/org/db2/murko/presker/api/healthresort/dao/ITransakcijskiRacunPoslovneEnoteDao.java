package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacunPoslovneEnote;

import java.util.List;

public interface ITransakcijskiRacunPoslovneEnoteDao {

    int create(TransakcijskiRacunPoslovneEnote racun);
    TransakcijskiRacunPoslovneEnote get(Integer id);
    List<TransakcijskiRacunPoslovneEnote> getAll();
}
