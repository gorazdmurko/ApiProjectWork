package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritveSobe;

import java.util.List;

public interface IIzdelkiStoritveSobeService {

    int save(IzdelkiStoritveSobe storitev);
    IzdelkiStoritveSobe get(Integer id);
    List<IzdelkiStoritveSobe> getAll();
}
