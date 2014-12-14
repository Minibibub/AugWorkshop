package com.aug.entities.kik;

import com.aug.entities.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "KIK")
public class Kik extends BaseEntity implements Serializable {
}
