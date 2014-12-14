package com.aug.entities.may;

import com.aug.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "MAY")
public class May extends BaseEntity implements Serializable {

	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;

	@Column(name = "AGE")
	private Integer age;
	
	@Column(name = "MAY")
	private String may;

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

	public String getMay() {
		return may;
	}

	public void setMay(String may) {
		this.may = may;
	}

	
}
