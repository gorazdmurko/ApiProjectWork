package org.db2.murko.presker.api.healthresort.dao;

import org.db2.murko.presker.api.healthresort.entity.Osebe;
import org.db2.murko.presker.api.healthresort.entity.PoslovniPartnerji;

import java.util.List;

public interface IPoslovniPartnerjiDao {

    int create(PoslovniPartnerji partnerji);
    PoslovniPartnerji get(Integer id);
    List<PoslovniPartnerji> getAll();
}
