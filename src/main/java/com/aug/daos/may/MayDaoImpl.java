package com.aug.daos.may;

import java.util.List;

import com.aug.daos.BaseHibernateDaoImpl;
import com.aug.entities.may.May;

import org.springframework.stereotype.Repository;

@Repository
public class MayDaoImpl extends BaseHibernateDaoImpl<May> implements MayDao{

    protected MayDaoImpl() {
        super(May.class);
    }

    @Override
    public boolean deleteMayById(int Mayid) {
    	May may = getById(Mayid);
		if (may == null) {
			return false;
		}
		getCurrentSession().delete(may);

		return true;
    }

	@Override
	public List<May> search(String name) {
		List<May> mays = findByName(name);
    	return mays;
	}
}
