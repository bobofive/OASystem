package com.domain;

/**
 * Bbscolumninfo entity. @author MyEclipse Persistence Tools
 */

public class Bbscolumninfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String detail;
	private Integer pid;
	private String create;

	// Constructors

	/** default constructor */
	public Bbscolumninfo() {
	}

	/** full constructor */
	public Bbscolumninfo(String title, String detail, Integer pid, String create) {
		this.title = title;
		this.detail = detail;
		this.pid = pid;
		this.create = create;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getCreate() {
		return this.create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

}