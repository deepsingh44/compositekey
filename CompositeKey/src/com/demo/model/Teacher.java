package com.demo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "txt")
public class Teacher {
	@EmbeddedId
	private TeacherKey teacherKey;
	private String address;

	public TeacherKey getTeacherKey() {
		return teacherKey;
	}

	public void setTeacherKey(TeacherKey teacherKey) {
		this.teacherKey = teacherKey;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
