package com.domain;

/**
 * Docinfo entity. @author MyEclipse Persistence Tools
 */

public class Docinfo implements java.io.Serializable {

	// Fields

	private Short id;
	private Userinfo userinfo;
	private String docNo;
	private String name;
	private String content;
	private Integer folder;
	private String addFile;
	private Integer createTime;
	private Integer updateTime;
	private Short isDel;

	// Constructors

	/** default constructor */
	public Docinfo() {
	}

	/** minimal constructor */
	public Docinfo(String docNo, String name, String content, Integer folder,
			String addFile, Integer createTime, Integer updateTime, Short isDel) {
		this.docNo = docNo;
		this.name = name;
		this.content = content;
		this.folder = folder;
		this.addFile = addFile;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isDel = isDel;
	}

	/** full constructor */
	public Docinfo(Userinfo userinfo, String docNo, String name,
			String content, Integer folder, String addFile, Integer createTime,
			Integer updateTime, Short isDel) {
		this.userinfo = userinfo;
		this.docNo = docNo;
		this.name = name;
		this.content = content;
		this.folder = folder;
		this.addFile = addFile;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.isDel = isDel;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getDocNo() {
		return this.docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
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

	public Integer getFolder() {
		return this.folder;
	}

	public void setFolder(Integer folder) {
		this.folder = folder;
	}

	public String getAddFile() {
		return this.addFile;
	}

	public void setAddFile(String addFile) {
		this.addFile = addFile;
	}

	public Integer getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}

	public Short getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}

}