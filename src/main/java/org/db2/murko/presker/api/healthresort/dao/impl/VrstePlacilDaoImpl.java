package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IVrstePlacilDao;
import org.db2.murko.presker.api.healthresort.entity.VrstePlacil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VrstePlacilDaoImpl implements IVrstePlacilDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(VrstePlacil vrsta) {
        Integer res = (Integer) hibernateTemplate.save(vrsta);
        return res;
    }

    @Override
    public VrstePlacil get(Integer id) {
        return hibernateTemplate.get(VrstePlacil.class, id);
    }

    @Override
    public List<VrstePlacil> getAll() {
        return hibernateTemplate.loadAll(VrstePlacil.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
