package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.DnevnikBlagajne;

import java.util.List;

public interface IDnevnikBlagajneDao {

    int create(DnevnikBlagajne dnevnik);
    DnevnikBlagajne get(Integer id);
    List<DnevnikBlagajne> getAll();
}
