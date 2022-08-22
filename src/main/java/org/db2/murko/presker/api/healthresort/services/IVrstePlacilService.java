package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.VrstePlacil;

import java.util.List;

public interface IVrstePlacilService {

    int save(VrstePlacil vrsta);
    VrstePlacil get(Integer id);
    List<VrstePlacil> getAll();
}
