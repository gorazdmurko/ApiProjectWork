package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Sobe;

import java.util.List;

public interface ISobeService {

    int save(Sobe soba);
    Sobe get(Integer id);
    List<Sobe> getAll();
}
