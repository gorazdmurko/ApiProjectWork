package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeDnevnik;

import java.util.List;

public interface IRezervacijeDnevnikDao {

    int create(RezervacijeDnevnik dnevnik);
    RezervacijeDnevnik get(Integer id);
    List<RezervacijeDnevnik> getAll();
}
