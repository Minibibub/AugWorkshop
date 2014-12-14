package com.aug.daos.bill;

import com.aug.daos.BaseHibernateDao;
import com.aug.entities.bill.Bill;

public interface BillDao extends BaseHibernateDao<Bill> {

    public boolean deleteById(int id);
}
