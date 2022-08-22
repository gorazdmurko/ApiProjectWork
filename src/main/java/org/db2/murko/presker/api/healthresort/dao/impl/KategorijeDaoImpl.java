package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IKategorijeDao;
import org.db2.murko.presker.api.healthresort.entity.Kategorije;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KategorijeDaoImpl implements IKategorijeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Kategorije kategorija) {
        Integer res = (Integer) hibernateTemplate.save(kategorija);
        return res;
    }

    @Override
    public Kategorije get(Integer id) {
        return hibernateTemplate.get(Kategorije.class, id);
    }

    @Override
    public List<Kategorije> getAll() {
        return hibernateTemplate.loadAll(Kategorije.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
