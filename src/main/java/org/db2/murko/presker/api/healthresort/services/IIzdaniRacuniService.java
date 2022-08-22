package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuni;

import java.util.List;

public interface IIzdaniRacuniService {

    int save(IzdaniRacuni racun);
    IzdaniRacuni get(Integer id);
    List<IzdaniRacuni> getAll();
}
