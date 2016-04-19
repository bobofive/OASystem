package com.domain;

/**
 * Bbscommentinfo entity. @author MyEclipse Persistence Tools
 */

public class Bbscommentinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Bbsforuminfo bbsforuminfo;
	private Userinfo userinfo;
	private String name;
	private String content;
	private Short isDel;
	private Integer create;
	private Integer update;

	// Constructors

	/** default constructor */
	public Bbscommentinfo() {
	}

	/** minimal constructor */
	public Bbscommentinfo(String name, String content, Short isDel,
			Integer create, Integer update) {
		this.name = name;
		this.content = content;
		this.isDel = isDel;
		this.create = create;
		this.update = update;
	}

	/** full constructor */
	public Bbscommentinfo(Bbsforuminfo bbsforuminfo, Userinfo userinfo,
			String name, String content, Short isDel, Integer create,
			Integer update) {
		this.bbsforuminfo = bbsforuminfo;
		this.userinfo = userinfo;
		this.name = name;
		this.content = content;
		this.isDel = isDel;
		this.create = create;
		this.update = update;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Bbsforuminfo getBbsforuminfo() {
		return this.bbsforuminfo;
	}

	public void setBbsforuminfo(Bbsforuminfo bbsforuminfo) {
		this.bbsforuminfo = bbsforuminfo;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Short getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}

	public Integer getCreate() {
		return this.create;
	}

	public void setCreate(Integer create) {
		this.create = create;
	}

	public Integer getUpdate() {
		return this.update;
	}

	public void setUpdate(Integer update) {
		this.update = update;
	}

}