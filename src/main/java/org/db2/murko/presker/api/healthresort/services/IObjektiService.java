package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Objekti;

import java.util.List;

public interface IObjektiService {

    int save(Objekti objekt);
    Objekti get(Integer id);
    List<Objekti> getAll();
}
