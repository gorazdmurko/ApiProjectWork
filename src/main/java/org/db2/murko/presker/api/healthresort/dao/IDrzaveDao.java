package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Drzave;
import java.util.List;

public interface IDrzaveDao {

    int create(Drzave drzava);
    Drzave get(Integer id);
    List<Drzave> getAll();
    void deleteById(Integer id);
    void deleteAll(Drzave drzave);
}
