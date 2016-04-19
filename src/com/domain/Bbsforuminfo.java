package com.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Bbsforuminfo entity. @author MyEclipse Persistence Tools
 */

public class Bbsforuminfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Userinfo userinfo;
	private String name;
	private String content;
	private Integer views;
	private Integer reply;
	private Integer order;
	private String attachment;
	private Integer create;
	private Integer update;
	private Short isDel;
	private Short isTop;
	private Set bbscommentinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bbsforuminfo() {
	}

	/** minimal constructor */
	public Bbsforuminfo(String name, String content, Integer views,
			Integer reply, Integer order, String attachment, Integer create,
			Integer update, Short isDel) {
		this.name = name;
		this.content = content;
		this.views = views;
		this.reply = reply;
		this.order = order;
		this.attachment = attachment;
		this.create = create;
		this.update = update;
		this.isDel = isDel;
	}

	/** full constructor */
	public Bbsforuminfo(Userinfo userinfo, String name, String content,
			Integer views, Integer reply, Integer order, String attachment,
			Integer create, Integer update, Short isDel, Short isTop,
			Set bbscommentinfos) {
		this.userinfo = userinfo;
		this.name = name;
		this.content = content;
		this.views = views;
		this.reply = reply;
		this.order = order;
		this.attachment = attachment;
		this.create = create;
		this.update = update;
		this.isDel = isDel;
		this.isTop = isTop;
		this.bbscommentinfos = bbscommentinfos;
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

	public Integer getViews() {
		return this.views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getReply() {
		return this.reply;
	}

	public void setReply(Integer reply) {
		this.reply = reply;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
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

	public Short getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Short isDel) {
		this.isDel = isDel;
	}

	public Short getIsTop() {
		return this.isTop;
	}

	public void setIsTop(Short isTop) {
		this.isTop = isTop;
	}

	public Set getBbscommentinfos() {
		return this.bbscommentinfos;
	}

	public void setBbscommentinfos(Set bbscommentinfos) {
		this.bbscommentinfos = bbscommentinfos;
	}

}