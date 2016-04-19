package com.domain;

/**
 * Nodeinfo entity. @author MyEclipse Persistence Tools
 */

public class Nodeinfo implements java.io.Serializable {

	// Fields

	private Short id;
	private String name;
	private String url;
	private String icon;
	private String type;
	private String sort;
	private Short pid;
	private Short isDel;

	// Constructors

	/** default constructor */
	public Nodeinfo() {
	}

	/** minimal constructor */
	public Nodeinfo(String url, Short pid, Short isDel) {
		this.url = url;
		this.pid = pid;
		this.isDel = isDel;
	}

	/** full constructor */
	public Nodeinfo(String name, String url, String icon, String type,
			String sort, Short pid, Short isDel) {
		this.name = name;
		this.url = url;
		this.icon = icon;
		this.type = type;
		this.sort = sort;
		this.pid = pid;
		this.isDel = isDel;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Short getPid() {
		return this.pid;
	}

	public void setPid(Short pid) {
		this.pid = pid;
	}

	public Short getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}

}