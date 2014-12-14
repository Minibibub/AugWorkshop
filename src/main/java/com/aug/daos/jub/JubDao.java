package com.aug.daos.jub;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.jub.Jub;

public interface JubDao extends BaseHibernateDao<Jub> {

    public boolean deleteById(int id);
}
