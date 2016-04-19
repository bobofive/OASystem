package com.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String imageUrl;
	private String name;
	private String password;
	private Integer departmentId;
	private String sex;
	private String idNum;
	private Integer phoneNum;
	private String permissions;
	private String lastLoginIp;
	private String email;
	private Integer integral;
	private Double money;
	private Set mailinfosForTo = new HashSet(0);
	private Set noticeinfos = new HashSet(0);
	private Set fileinfos = new HashSet(0);
	private Set departmentinfos = new HashSet(0);
	private Set bbsforuminfos = new HashSet(0);
	private Set mailinfosForFrom = new HashSet(0);
	private Set docinfos = new HashSet(0);
	private Set bbscommentinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(String password, String permissions, String email) {
		this.password = password;
		this.permissions = permissions;
		this.email = email;
	}

	/** full constructor */
	public Userinfo(String imageUrl, String name, String password,
			Integer departmentId, String sex, String idNum, Integer phoneNum,
			String permissions, String lastLoginIp, String email,
			Integer integral, Double money, Set mailinfosForTo,
			Set noticeinfos, Set fileinfos, Set departmentinfos,
			Set bbsforuminfos, Set mailinfosForFrom, Set docinfos,
			Set bbscommentinfos) {
		this.imageUrl = imageUrl;
		this.name = name;
		this.password = password;
		this.departmentId = departmentId;
		this.sex = sex;
		this.idNum = idNum;
		this.phoneNum = phoneNum;
		this.permissions = permissions;
		this.lastLoginIp = lastLoginIp;
		this.email = email;
		this.integral = integral;
		this.money = money;
		this.mailinfosForTo = mailinfosForTo;
		this.noticeinfos = noticeinfos;
		this.fileinfos = fileinfos;
		this.departmentinfos = departmentinfos;
		this.bbsforuminfos = bbsforuminfos;
		this.mailinfosForFrom = mailinfosForFrom;
		this.docinfos = docinfos;
		this.bbscommentinfos = bbscommentinfos;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdNum() {
		return this.idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public Integer getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPermissions() {
		return this.permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Set getMailinfosForTo() {
		return this.mailinfosForTo;
	}

	public void setMailinfosForTo(Set mailinfosForTo) {
		this.mailinfosForTo = mailinfosForTo;
	}

	public Set getNoticeinfos() {
		return this.noticeinfos;
	}

	public void setNoticeinfos(Set noticeinfos) {
		this.noticeinfos = noticeinfos;
	}

	public Set getFileinfos() {
		return this.fileinfos;
	}

	public void setFileinfos(Set fileinfos) {
		this.fileinfos = fileinfos;
	}

	public Set getDepartmentinfos() {
		return this.departmentinfos;
	}

	public void setDepartmentinfos(Set departmentinfos) {
		this.departmentinfos = departmentinfos;
	}

	public Set getBbsforuminfos() {
		return this.bbsforuminfos;
	}

	public void setBbsforuminfos(Set bbsforuminfos) {
		this.bbsforuminfos = bbsforuminfos;
	}

	public Set getMailinfosForFrom() {
		return this.mailinfosForFrom;
	}

	public void setMailinfosForFrom(Set mailinfosForFrom) {
		this.mailinfosForFrom = mailinfosForFrom;
	}

	public Set getDocinfos() {
		return this.docinfos;
	}

	public void setDocinfos(Set docinfos) {
		this.docinfos = docinfos;
	}

	public Set getBbscommentinfos() {
		return this.bbscommentinfos;
	}

	public void setBbscommentinfos(Set bbscommentinfos) {
		this.bbscommentinfos = bbscommentinfos;
	}

}