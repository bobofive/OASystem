package com.domain;

/**
 * Fileinfo entity. @author MyEclipse Persistence Tools
 */

public class Fileinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Userinfo userinfo;
	private String filetype;
	private Integer pid;
	private String name;
	private String savename;
	private String size;
	private String extension;
	private String module;
	private Integer create;
	private Short isDel;

	// Constructors

	/** default constructor */
	public Fileinfo() {
	}

	/** minimal constructor */
	public Fileinfo(String name, String savename, String size,
			String extension, String module, Integer create, Short isDel) {
		this.name = name;
		this.savename = savename;
		this.size = size;
		this.extension = extension;
		this.module = module;
		this.create = create;
		this.isDel = isDel;
	}

	/** full constructor */
	public Fileinfo(Userinfo userinfo, String filetype, Integer pid,
			String name, String savename, String size, String extension,
			String module, Integer create, Short isDel) {
		this.userinfo = userinfo;
		this.filetype = filetype;
		this.pid = pid;
		this.name = name;
		this.savename = savename;
		this.size = size;
		this.extension = extension;
		this.module = module;
		this.create = create;
		this.isDel = isDel;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSavename() {
		return this.savename;
	}

	public void setSavename(String savename) {
		this.savename = savename;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Integer getCreate() {
		return this.create;
	}

	public void setCreate(Integer create) {
		this.create = create;
	}

	public Short getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}

}