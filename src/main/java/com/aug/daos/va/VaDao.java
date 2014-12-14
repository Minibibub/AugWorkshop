package com.aug.daos.va;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.va.Va;

public interface VaDao extends BaseHibernateDao<Va> {

    public boolean deleteById(int id);
}
