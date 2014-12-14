package com.aug.daos.jub;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.jub.Jub;
import org.springframework.stereotype.Repository;

@Repository
public class JubDaoImpl extends BaseHibernateDaoImpl<Jub> implements JubDao{

    protected JubDaoImpl() {
        super(Jub.class);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
