package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuni;

import java.util.List;

public interface IIzdaniRacuniDao {

    int create(IzdaniRacuni racun);
    IzdaniRacuni get(Integer id);
    List<IzdaniRacuni> getAll();
}
