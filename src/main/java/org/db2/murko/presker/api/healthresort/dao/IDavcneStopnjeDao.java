package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.DavcneStopnje;

import java.util.List;

public interface IDavcneStopnjeDao {

    int create(DavcneStopnje stopnja);
    DavcneStopnje get(Integer id);
    List<DavcneStopnje> getAll();
}
