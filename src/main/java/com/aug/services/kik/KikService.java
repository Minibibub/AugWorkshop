package com.aug.services.kik;

import com.aug.daos.kik.KikDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KikService {

    @Autowired
    private KikDao kikDao;
}
