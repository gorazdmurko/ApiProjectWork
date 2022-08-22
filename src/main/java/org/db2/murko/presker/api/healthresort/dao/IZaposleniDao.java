package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Zaposleni;

import java.util.List;

public interface IZaposleniDao {

    int create(Zaposleni zaposleni);
    Zaposleni get(Integer id);
    List<Zaposleni> getAll();
}
