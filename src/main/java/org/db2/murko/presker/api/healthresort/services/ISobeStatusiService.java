package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.SobeStatusi;

import java.util.List;

public interface ISobeStatusiService {

    int save(SobeStatusi soba);
    SobeStatusi get(Integer id);
    List<SobeStatusi> getAll();
}
