package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritveSobe;

import java.util.List;

public interface IIzdelkiStoritveSobeDao {

    int create(IzdelkiStoritveSobe soba);
    IzdelkiStoritveSobe get(Integer id);
    List<IzdelkiStoritveSobe> getAll();
}
