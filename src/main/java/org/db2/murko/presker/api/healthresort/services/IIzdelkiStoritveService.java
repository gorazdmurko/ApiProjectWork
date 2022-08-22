package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritve;

import java.util.List;

public interface IIzdelkiStoritveService {

    int save(IzdelkiStoritve storitev);
    IzdelkiStoritve get(Integer id);
    List<IzdelkiStoritve> getAll();
}
