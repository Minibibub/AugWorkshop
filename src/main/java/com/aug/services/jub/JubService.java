package com.aug.services.jub;

import com.aug.daos.jub.JubDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JubService {

    @Autowired
    private JubDao jubDao;
}
