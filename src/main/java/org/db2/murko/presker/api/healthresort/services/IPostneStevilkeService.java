package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.PoslovneEnote;
import org.db2.murko.presker.api.healthresort.entity.PostneStevilke;

import java.util.List;

public interface IPostneStevilkeService {

    int save(PostneStevilke stevilka);
    PostneStevilke get(Integer id);
    List<PostneStevilke> getAll();
}
