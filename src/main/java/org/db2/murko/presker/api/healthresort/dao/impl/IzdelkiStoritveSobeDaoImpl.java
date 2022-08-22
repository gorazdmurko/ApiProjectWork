package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdelkiStoritveSobeDao;
import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritveSobe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IzdelkiStoritveSobeDaoImpl implements IIzdelkiStoritveSobeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;


    @Override
    public int create(IzdelkiStoritveSobe soba) {
        Integer res = (Integer) hibernateTemplate.save(soba);
        return res;
    }

    @Override
    public IzdelkiStoritveSobe get(Integer id) {
        return hibernateTemplate.get(IzdelkiStoritveSobe.class, id);
    }

    @Override
    public List<IzdelkiStoritveSobe> getAll() {
        return hibernateTemplate.loadAll(IzdelkiStoritveSobe.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
