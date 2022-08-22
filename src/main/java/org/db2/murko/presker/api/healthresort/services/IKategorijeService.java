package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Kategorije;

import java.util.List;

public interface IKategorijeService {

    int save(Kategorije kategorija);
    Kategorije get(Integer id);
    List<Kategorije> getAll();
}
