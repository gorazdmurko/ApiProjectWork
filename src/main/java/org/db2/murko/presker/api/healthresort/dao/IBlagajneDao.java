package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.db2.murko.presker.api.healthresort.entity.Osebe;

import java.util.List;

public interface IBlagajneDao {

    int create(Blagajne blagajne);
    Blagajne get(Integer id);
    List<Blagajne> getAll();
}
