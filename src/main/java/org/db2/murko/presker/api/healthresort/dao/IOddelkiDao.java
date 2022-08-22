package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Oddelki;

import java.util.List;

public interface IOddelkiDao {

    int create(Oddelki oddelek);
    Oddelki get(Integer id);
    List<Oddelki> getAll();
}
