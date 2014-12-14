package com.aug.services.may;

import java.util.List;

import com.aug.daos.may.MayDao;
import com.aug.entities.may.May;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MayService {

    @Autowired
    private MayDao mayDao;

	public MayDao getMayDao() {
		return mayDao;
	}

	public void setMayDao(MayDao mayDao) {
		this.mayDao = mayDao;
	}

	public void save(May may) {
		mayDao.save(may);
	}

	public List<May> findAllMay() {
		return mayDao.findAll();
	}

	public void update(May may) {
		mayDao.update(may);
	}

	public boolean deleteMayById(int Mayid) {
		return mayDao.deleteMayById(Mayid);
	}

	public May findById(int id) {
		return mayDao.getById(id);
	}

	public List<May> search(String name) {
		return mayDao.search(name);
	}
}
