package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.DavcneStopnje;

import java.util.List;

public interface IDavcneStopnjeService {

    int save(DavcneStopnje stopnja);
    DavcneStopnje get(Integer id);
    List<DavcneStopnje> getAll();
}
