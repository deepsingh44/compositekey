package com.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TeacherKey implements Serializable {
	private String email;
	private String mobile;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public boolean equals(Object obj) {
		TeacherKey tk = (TeacherKey) obj;
		if (tk.getEmail().equals(email) && tk.getMobile().equals(mobile)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int hashCode() {
		return email.hashCode() + mobile.hashCode();
	}
}
