package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.DodatneStoritvePostavke;

import java.util.List;

public interface IDodatneStoritvePostavkeService {

    int save(DodatneStoritvePostavke storitev);
    DodatneStoritvePostavke get(Integer id);
    List<DodatneStoritvePostavke> getAll();
}
