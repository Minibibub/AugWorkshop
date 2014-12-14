package com.aug.entities.arm;


import com.aug.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ARM")
public class Arm extends BaseEntity implements Serializable {

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "ARM")
    private String arm;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getArm() {
        return arm;
    }

    public void setArm(String arm) {
        this.arm = arm;
    }
}
