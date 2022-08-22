package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.VrstePlacil;

import java.util.List;

public interface IVrstePlacilDao {

    int create(VrstePlacil vrsta);
    VrstePlacil get(Integer id);
    List<VrstePlacil> getAll();
}
