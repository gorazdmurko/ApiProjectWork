package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.RezervacijePozicije;

import java.util.List;

public interface IRezervacijePozicijeService {

    int save(RezervacijePozicije pozicija);
    RezervacijePozicije get(Integer id);
    List<RezervacijePozicije> getAll();
}
