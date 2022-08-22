package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.RezervacijeSobe;

import java.util.List;

public interface IRezervacijeSobeService {

    int save(RezervacijeSobe soba);
    RezervacijeSobe get(Integer id);
    List<RezervacijeSobe> getAll();
}
