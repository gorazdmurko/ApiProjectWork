package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.PPKontakti;

import java.util.List;

public interface IPPKontaktiDao {

    int create(PPKontakti kontakt);
    PPKontakti get(Integer id);
    List<PPKontakti> getAll();
}
