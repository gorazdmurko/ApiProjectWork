package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacunPoslovneEnote;

import java.util.List;

public interface ITransakcijskiRacunPoslovneEnoteServis {

    int save(TransakcijskiRacunPoslovneEnote enota);
    TransakcijskiRacunPoslovneEnote get(Integer id);
    List<TransakcijskiRacunPoslovneEnote> getAll();
}
