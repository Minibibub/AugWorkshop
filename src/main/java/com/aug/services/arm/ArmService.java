package com.aug.services.arm;

import com.aug.daos.arm.ArmDao;
import com.aug.entities.arm.Arm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmService {

    @Autowired
    private ArmDao armDao;

    public void setArmDao(ArmDao armDao) {
        this.armDao = armDao;
    }

    public List<Arm> findAll(){
        return armDao.findAll();
    }

    public void insert(Arm entry) {
        armDao.save(entry);
    }

    public boolean delete(Integer id) {
        return armDao.deleteById(id);
    }

    public Arm findById(Integer id) {
        return armDao.getById(id);
    }

    public void update(Arm entry) {
        armDao.update(entry);
    }
}
