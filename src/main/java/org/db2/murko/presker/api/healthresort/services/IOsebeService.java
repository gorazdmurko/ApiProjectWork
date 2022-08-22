package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Osebe;

import java.util.List;

public interface IOsebeService {

    int save(Osebe oseba);
    Osebe get(Integer id);
    List<Osebe> getAll();
}
