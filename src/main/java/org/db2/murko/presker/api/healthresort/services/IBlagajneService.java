package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Blagajne;

import java.util.List;

public interface IBlagajneService {

    int save(Blagajne blagajne);
    Blagajne getBlagajne(Integer id);
    List<Blagajne> getBlagajneAll();
}
