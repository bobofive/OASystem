package com.domain;

/**
 * Systeminfo entity. @author MyEclipse Persistence Tools
 */

public class Systeminfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String code;
	private String name;
	private String val;
	private Short isDel;
	private String sort;

	// Constructors

	/** default constructor */
	public Systeminfo() {
	}

	/** minimal constructor */
	public Systeminfo(String code, String name, Short isDel) {
		this.code = code;
		this.name = name;
		this.isDel = isDel;
	}

	/** full constructor */
	public Systeminfo(String code, String name, String val, Short isDel,
			String sort) {
		this.code = code;
		this.name = name;
		this.val = val;
		this.isDel = isDel;
		this.sort = sort;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVal() {
		return this.val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public Short getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

}