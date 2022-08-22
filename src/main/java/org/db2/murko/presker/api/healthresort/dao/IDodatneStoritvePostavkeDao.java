package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.DodatneStoritvePostavke;

import java.util.List;

public interface IDodatneStoritvePostavkeDao {

    int create(DodatneStoritvePostavke postavka);
    DodatneStoritvePostavke get(Integer id);
    List<DodatneStoritvePostavke> getAll();
}
