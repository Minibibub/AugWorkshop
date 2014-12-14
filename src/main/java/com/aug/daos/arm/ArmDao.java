package com.aug.daos.arm;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.arm.Arm;

public interface ArmDao extends BaseHibernateDao<Arm>{

    public boolean deleteById(int id);
}