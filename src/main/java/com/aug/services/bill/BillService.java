package com.aug.services.bill;

import com.aug.daos.bill.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired
    private BillDao billDao;
}
