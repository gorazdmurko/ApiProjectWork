package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Sobe;

import java.util.List;

public interface ISobeDao {

    int create(Sobe soba);
    Sobe get(Integer id);
    List<Sobe> getAll();
}
