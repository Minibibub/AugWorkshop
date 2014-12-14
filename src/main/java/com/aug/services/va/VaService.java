package com.aug.services.va;

import com.aug.daos.va.VaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaService {

    @Autowired
    private VaDao vaDao;
}
