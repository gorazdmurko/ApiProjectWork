package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IPostneStevilkeDao;
import org.db2.murko.presker.api.healthresort.entity.PostneStevilke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostneStevilkeDaoImpl implements IPostneStevilkeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(PostneStevilke stevilke) {
        Integer result = (Integer) hibernateTemplate.save(stevilke);
        return result;
    }

    @Override
    public PostneStevilke getPostne(Integer id) {
        return hibernateTemplate.get(PostneStevilke.class, id);
    }

    @Override
    public List<PostneStevilke> getPostneAll() {
        return hibernateTemplate.loadAll(PostneStevilke.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
