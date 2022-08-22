package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.PPKontakti;

import java.util.List;

public interface IPPKontaktiService {

    int save(PPKontakti kontakt);
    PPKontakti get(Integer id);
    List<PPKontakti> getAll();
}
