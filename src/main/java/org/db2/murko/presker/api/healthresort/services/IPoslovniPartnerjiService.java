package org.db2.murko.presker.api.healthresort.services;

import org.db2.murko.presker.api.healthresort.entity.PoslovniPartnerji;

import java.util.List;

public interface IPoslovniPartnerjiService {

    int save(PoslovniPartnerji partner);
    PoslovniPartnerji get(Integer id);
    List<PoslovniPartnerji> getAll();
}
