package com.aug.daos.kik;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.kik.Kik;
import org.springframework.stereotype.Repository;

@Repository
public class KikDaoImpl extends BaseHibernateDaoImpl<Kik> implements KikDao{

    protected KikDaoImpl() {
        super(Kik.class);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
