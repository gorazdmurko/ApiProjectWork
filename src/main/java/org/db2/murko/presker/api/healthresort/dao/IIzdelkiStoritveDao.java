package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritve;

import java.util.List;

public interface IIzdelkiStoritveDao {

    int create(IzdelkiStoritve storitev);
    IzdelkiStoritve get(Integer id);
    List<IzdelkiStoritve> getAll();
}
