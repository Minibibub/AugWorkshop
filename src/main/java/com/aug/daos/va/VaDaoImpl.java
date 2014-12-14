package com.aug.daos.va;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.va.Va;
import org.springframework.stereotype.Repository;

@Repository
public class VaDaoImpl extends BaseHibernateDaoImpl<Va> implements VaDao{

    protected VaDaoImpl() {
        super(Va.class);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
