package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.SobeStatusi;

import java.util.List;

public interface ISobeStatusiDao {

    int create(SobeStatusi soba);
    SobeStatusi get(Integer id);
    List<SobeStatusi> getAll();
}
