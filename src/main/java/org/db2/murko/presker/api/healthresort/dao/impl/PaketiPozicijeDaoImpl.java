package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IPaketiPozicijeDao;
import org.db2.murko.presker.api.healthresort.entity.PaketiPozicije;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaketiPozicijeDaoImpl implements IPaketiPozicijeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(PaketiPozicije paket) {
        Integer res = (Integer) hibernateTemplate.save(paket);
        return res;
    }

    @Override
    public PaketiPozicije get(Integer id) {
        return hibernateTemplate.get(PaketiPozicije.class, id);
    }

    @Override
    public List<PaketiPozicije> getAll() {
        return hibernateTemplate.loadAll(PaketiPozicije.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
