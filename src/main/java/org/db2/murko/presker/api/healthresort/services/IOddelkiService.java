package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Oddelki;

import java.util.List;

public interface IOddelkiService {

    int save(Oddelki oddelek);
    Oddelki get(Integer id);
    List<Oddelki> getAll();
}
