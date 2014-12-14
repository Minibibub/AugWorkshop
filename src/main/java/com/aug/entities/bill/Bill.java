package com.aug.entities.bill;

import com.aug.entities.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "BILL")
public class Bill extends BaseEntity implements Serializable {
}
