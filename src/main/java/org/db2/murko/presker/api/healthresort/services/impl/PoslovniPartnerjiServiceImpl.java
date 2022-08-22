package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IPoslovniPartnerjiDao;
import org.db2.murko.presker.api.healthresort.entity.PoslovniPartnerji;
import org.db2.murko.presker.api.healthresort.services.IPoslovniPartnerjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoslovniPartnerjiServiceImpl implements IPoslovniPartnerjiService {

    @Autowired
    private IPoslovniPartnerjiDao dao;

    @Override
    public int save(PoslovniPartnerji partner) {
        return dao.create(partner);
    }

    @Override
    public PoslovniPartnerji get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<PoslovniPartnerji> getAll() {
        return dao.getAll();
    }

    public IPoslovniPartnerjiDao getDao() {
        return dao;
    }

    public void setDao(IPoslovniPartnerjiDao dao) {
        this.dao = dao;
    }
}
