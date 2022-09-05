package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Drzave;

import java.util.List;

public interface IDrzaveService {

    int save(Drzave drzava);
    Drzave get(Integer id);
    List<Drzave> getAll();
    public void deleteById(Integer id);
    public void deleteAll(Drzave drzave);
}
