package com.aug.services.dear;

import com.aug.daos.dear.DearDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DearService {

    @Autowired
    private DearDao dearDao;
}
