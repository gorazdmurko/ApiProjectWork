package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeDodatneStoritve;

import java.util.List;

public interface IRezervacijeDodatneStoritveService {

    int save(RezervacijeDodatneStoritve storitev);
    RezervacijeDodatneStoritve get(Integer id);
    List<RezervacijeDodatneStoritve> getAll();
}
