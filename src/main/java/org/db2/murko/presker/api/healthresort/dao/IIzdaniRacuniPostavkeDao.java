package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuniPostavke;

import java.util.List;

public interface IIzdaniRacuniPostavkeDao {

    int create(IzdaniRacuniPostavke postavka);
    IzdaniRacuniPostavke get(Integer id);
    List<IzdaniRacuniPostavke> getAll();
}
