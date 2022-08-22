package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.Zaposleni;

import java.util.List;

public interface IZaposleniService {

    int save(Zaposleni zaposleni);
    Zaposleni get(Integer id);
    List<Zaposleni> getAll();
}
