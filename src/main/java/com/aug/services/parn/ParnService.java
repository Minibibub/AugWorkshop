package com.aug.services.parn;

import com.aug.daos.parn.ParnDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParnService {

    @Autowired
    private ParnDao parnDaoD;
}
