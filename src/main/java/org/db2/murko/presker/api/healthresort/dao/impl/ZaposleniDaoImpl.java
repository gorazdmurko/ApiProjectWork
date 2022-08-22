package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IZaposleniDao;
import org.db2.murko.presker.api.healthresort.entity.Zaposleni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ZaposleniDaoImpl implements IZaposleniDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Zaposleni zaposleni) {
        Integer res = (Integer) hibernateTemplate.save(zaposleni);
        return res;
    }

    @Override
    public Zaposleni get(Integer id) {
        return hibernateTemplate.get(Zaposleni.class, id);
    }

    @Override
    public List<Zaposleni> getAll() {
        return hibernateTemplate.loadAll(Zaposleni.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
