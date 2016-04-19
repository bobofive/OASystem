package com.domain;

/**
 * Departmentinfo entity. @author MyEclipse Persistence Tools
 */

public class Departmentinfo implements java.io.Serializable {

	// Fields

	private DepartmentinfoId id;
	private Userinfo userinfo;

	// Constructors

	/** default constructor */
	public Departmentinfo() {
	}

	/** minimal constructor */
	public Departmentinfo(DepartmentinfoId id) {
		this.id = id;
	}

	/** full constructor */
	public Departmentinfo(DepartmentinfoId id, Userinfo userinfo) {
		this.id = id;
		this.userinfo = userinfo;
	}

	// Property accessors

	public DepartmentinfoId getId() {
		return this.id;
	}

	public void setId(DepartmentinfoId id) {
		this.id = id;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

}