package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.PoslovneEnote;

import java.util.List;

public interface IPoslovneEnoteService {

    int save(PoslovneEnote enote);
    PoslovneEnote getEnota(Integer id);
    List<PoslovneEnote> getEnoteAll();
}
