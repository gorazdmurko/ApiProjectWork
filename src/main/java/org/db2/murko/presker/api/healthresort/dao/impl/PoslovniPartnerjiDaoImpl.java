package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IPoslovniPartnerjiDao;
import org.db2.murko.presker.api.healthresort.entity.PoslovniPartnerji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PoslovniPartnerjiDaoImpl implements IPoslovniPartnerjiDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(PoslovniPartnerji partnerji) {
        Integer res = (Integer) hibernateTemplate.save(partnerji);
        return res;
    }

    @Override
    public PoslovniPartnerji get(Integer id) {
        return hibernateTemplate.get(PoslovniPartnerji.class, id);
    }

    @Override
    public List<PoslovniPartnerji> getAll() {
        return hibernateTemplate.loadAll(PoslovniPartnerji.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
