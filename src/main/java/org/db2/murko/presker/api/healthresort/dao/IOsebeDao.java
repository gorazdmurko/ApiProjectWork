package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Osebe;

import java.util.List;

public interface IOsebeDao {

    int create(Osebe oseba);
    Osebe get(Integer id);
    List<Osebe> getAll();
}
