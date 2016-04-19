package com.domain;

/**
 * Mailinfo entity. @author MyEclipse Persistence Tools
 */

public class Mailinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Userinfo userinfoByFrom;
	private Userinfo userinfoByTo;
	private String name;
	private String content;
	private String attachment;
	private String replyTo;
	private Boolean read;
	private Integer create;
	private Integer modify;
	private Short isDel;

	// Constructors

	/** default constructor */
	public Mailinfo() {
	}

	/** minimal constructor */
	public Mailinfo(String name, String content, Boolean read, Integer create,
			Integer modify, Short isDel) {
		this.name = name;
		this.content = content;
		this.read = read;
		this.create = create;
		this.modify = modify;
		this.isDel = isDel;
	}

	/** full constructor */
	public Mailinfo(Userinfo userinfoByFrom, Userinfo userinfoByTo,
			String name, String content, String attachment, String replyTo,
			Boolean read, Integer create, Integer modify, Short isDel) {
		this.userinfoByFrom = userinfoByFrom;
		this.userinfoByTo = userinfoByTo;
		this.name = name;
		this.content = content;
		this.attachment = attachment;
		this.replyTo = replyTo;
		this.read = read;
		this.create = create;
		this.modify = modify;
		this.isDel = isDel;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Userinfo getUserinfoByFrom() {
		return this.userinfoByFrom;
	}

	public void setUserinfoByFrom(Userinfo userinfoByFrom) {
		this.userinfoByFrom = userinfoByFrom;
	}

	public Userinfo getUserinfoByTo() {
		return this.userinfoByTo;
	}

	public void setUserinfoByTo(Userinfo userinfoByTo) {
		this.userinfoByTo = userinfoByTo;
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

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	public String getReplyTo() {
		return this.replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public Boolean getRead() {
		return this.read;
	}

	public void setRead(Boolean read) {
		this.read = read;
	}

	public Integer getCreate() {
		return this.create;
	}

	public void setCreate(Integer create) {
		this.create = create;
	}

	public Integer getModify() {
		return this.modify;
	}

	public void setModify(Integer modify) {
		this.modify = modify;
	}

	public Short getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}

}