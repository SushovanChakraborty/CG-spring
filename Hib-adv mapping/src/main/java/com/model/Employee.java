package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "CG_EMPLOYYES", schema = "mts")
public class Employee {

	@Id
	private int id;
	@Column(name = "EMP_NAME")
	private String name;

	@Lob
	private String desc;

	@Lob
	private byte[] pic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
