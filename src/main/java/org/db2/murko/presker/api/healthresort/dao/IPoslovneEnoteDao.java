package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.PoslovneEnote;

import java.util.List;

public interface IPoslovneEnoteDao {

    int create(PoslovneEnote enote);
    PoslovneEnote getEnota(Integer id);
    List<PoslovneEnote> getEnoteAll();
}
