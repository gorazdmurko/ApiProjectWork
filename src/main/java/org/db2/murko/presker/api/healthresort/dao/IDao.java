package org.db2.murko.presker.api.healthresort.dao;

import java.util.List;

public interface IDao<T> {

    int create(T object);
    T get(Integer id);
    List<T> getAll();
}
