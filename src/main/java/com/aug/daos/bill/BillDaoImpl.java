package com.aug.daos.bill;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.bill.Bill;
import org.springframework.stereotype.Repository;

@Repository
public class BillDaoImpl extends BaseHibernateDaoImpl<Bill> implements BillDao{

    protected BillDaoImpl() {
        super(Bill.class);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
