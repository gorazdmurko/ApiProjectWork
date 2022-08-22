package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuniPostavke;

import java.util.List;

public interface IIzdaniRacuniPostavkeService {

    int save(IzdaniRacuniPostavke postavka);
    IzdaniRacuniPostavke get(Integer id);
    List<IzdaniRacuniPostavke> getAll();
}
