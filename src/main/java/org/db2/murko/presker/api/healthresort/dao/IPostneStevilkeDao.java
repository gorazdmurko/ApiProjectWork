package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.PostneStevilke;

import java.util.List;

public interface IPostneStevilkeDao {

    int create(PostneStevilke stevilke);
    PostneStevilke getPostne(Integer id);
    List<PostneStevilke> getPostneAll();
}
