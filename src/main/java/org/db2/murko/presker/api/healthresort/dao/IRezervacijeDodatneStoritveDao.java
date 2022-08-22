package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeDodatneStoritve;

import java.util.List;

public interface IRezervacijeDodatneStoritveDao {

    int create(RezervacijeDodatneStoritve rezervacija);
    RezervacijeDodatneStoritve get(Integer id);
    List<RezervacijeDodatneStoritve> getAll();
}
