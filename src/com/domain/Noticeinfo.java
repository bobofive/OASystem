package com.domain;

/**
 * Noticeinfo entity. @author MyEclipse Persistence Tools
 */

public class Noticeinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Userinfo userinfo;
	private String title;
	private String subtitle;
	private String content;
	private String created;
	private String attachment;

	// Constructors

	/** default constructor */
	public Noticeinfo() {
	}

	/** minimal constructor */
	public Noticeinfo(String created) {
		this.created = created;
	}

	/** full constructor */
	public Noticeinfo(Userinfo userinfo, String title, String subtitle,
			String content, String created, String attachment) {
		this.userinfo = userinfo;
		this.title = title;
		this.subtitle = subtitle;
		this.content = content;
		this.created = created;
		this.attachment = attachment;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

}