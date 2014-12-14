package com.aug.daos.parn;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.parn.Parn;

public interface ParnDao extends BaseHibernateDao<Parn> {

    public boolean deleteById(int id);
}
