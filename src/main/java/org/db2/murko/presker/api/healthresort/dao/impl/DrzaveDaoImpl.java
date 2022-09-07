package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IDrzaveDao;
import org.db2.murko.presker.api.healthresort.entity.Drzave;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrzaveDaoImpl implements IDrzaveDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Drzave drzava) {
        Integer result = (Integer) hibernateTemplate.save(drzava);
        return result;
    }

    @Override
    public Drzave get(Integer id) {
        return hibernateTemplate.get(Drzave.class, id);
    }

    @Override
    public List<Drzave> getAll() {
        return hibernateTemplate.loadAll(Drzave.class);
    }

    @Override
    public void deleteById(Integer id) {
//        hibernateTemplate.delete(this.get(id));
        Session session ;
        Drzave drzava ;
        SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();

        session = sessionFactory.getCurrentSession();
        drzava = (Drzave) session.load(Drzave.class, id);
        session.delete(drzava);
        //This makes the pending delete to be done
        session.flush() ;
    }

    @Override
    public void deleteAll(Drzave drzave) {
        hibernateTemplate.delete(drzave);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
