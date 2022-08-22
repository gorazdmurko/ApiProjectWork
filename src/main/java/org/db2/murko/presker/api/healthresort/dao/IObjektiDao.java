package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Objekti;

import java.util.List;

public interface IObjektiDao {

    int create(Objekti objekt);
    Objekti get(Integer id);
    List<Objekti> getAll();
}
