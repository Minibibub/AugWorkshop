package com.aug.daos.dear;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.dear.Dear;
import org.springframework.stereotype.Repository;

@Repository
public class DearDaoImpl extends BaseHibernateDaoImpl<Dear> implements DearDao{

    protected DearDaoImpl() {
        super(Dear.class);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
