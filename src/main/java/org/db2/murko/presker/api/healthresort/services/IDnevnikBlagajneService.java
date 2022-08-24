package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.DnevnikBlagajne;

import java.util.List;

public interface IDnevnikBlagajneService {

    int save(DnevnikBlagajne dnevnik);
    DnevnikBlagajne getDnevnikBlagajne(Integer id);
    List<DnevnikBlagajne> getDnevnikBlagajneAll();
}
