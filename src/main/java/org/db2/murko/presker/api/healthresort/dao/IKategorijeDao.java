package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Kategorije;

import java.util.List;

public interface IKategorijeDao {

    int create(Kategorije kategorija);
    Kategorije get(Integer id);
    List<Kategorije> getAll();
}
