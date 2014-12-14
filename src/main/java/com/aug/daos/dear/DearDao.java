package com.aug.daos.dear;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.dear.Dear;

public interface DearDao extends BaseHibernateDao<Dear> {

    public boolean deleteById(int id);
}
