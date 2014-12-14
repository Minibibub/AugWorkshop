package com.aug.entities.dear;

import com.aug.entities.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "DEAR")
public class Dear extends BaseEntity implements Serializable {
}
