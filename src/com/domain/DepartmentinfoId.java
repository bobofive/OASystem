package com.domain;

/**
 * DepartmentinfoId entity. @author MyEclipse Persistence Tools
 */

public class DepartmentinfoId implements java.io.Serializable {

	// Fields

	private Integer departmentId;
	private String name;
	private Integer totalNum;
	private String introduction;
	private Userinfo userinfo;
	private Integer isDel;
	private Integer pid;
	private Integer sort;

	// Constructors

	/** default constructor */
	public DepartmentinfoId() {
	}

	/** minimal constructor */
	public DepartmentinfoId(Integer departmentId, String name) {
		this.departmentId = departmentId;
		this.name = name;
	}

	/** full constructor */
	public DepartmentinfoId(Integer departmentId, String name,
			Integer totalNum, String introduction, Userinfo userinfo,
			Integer isDel, Integer pid, Integer sort) {
		this.departmentId = departmentId;
		this.name = name;
		this.totalNum = totalNum;
		this.introduction = introduction;
		this.userinfo = userinfo;
		this.isDel = isDel;
		this.pid = pid;
		this.sort = sort;
	}

	// Property accessors

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Integer getIsDel() {
		return this.isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DepartmentinfoId))
			return false;
		DepartmentinfoId castOther = (DepartmentinfoId) other;

		return ((this.getDepartmentId() == castOther.getDepartmentId()) || (this
				.getDepartmentId() != null
				&& castOther.getDepartmentId() != null && this
				.getDepartmentId().equals(castOther.getDepartmentId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getTotalNum() == castOther.getTotalNum()) || (this
						.getTotalNum() != null
						&& castOther.getTotalNum() != null && this
						.getTotalNum().equals(castOther.getTotalNum())))
				&& ((this.getIntroduction() == castOther.getIntroduction()) || (this
						.getIntroduction() != null
						&& castOther.getIntroduction() != null && this
						.getIntroduction().equals(castOther.getIntroduction())))
				&& ((this.getUserinfo() == castOther.getUserinfo()) || (this
						.getUserinfo() != null
						&& castOther.getUserinfo() != null && this
						.getUserinfo().equals(castOther.getUserinfo())))
				&& ((this.getIsDel() == castOther.getIsDel()) || (this
						.getIsDel() != null && castOther.getIsDel() != null && this
						.getIsDel().equals(castOther.getIsDel())))
				&& ((this.getPid() == castOther.getPid()) || (this.getPid() != null
						&& castOther.getPid() != null && this.getPid().equals(
						castOther.getPid())))
				&& ((this.getSort() == castOther.getSort()) || (this.getSort() != null
						&& castOther.getSort() != null && this.getSort()
						.equals(castOther.getSort())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getDepartmentId() == null ? 0 : this.getDepartmentId()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getTotalNum() == null ? 0 : this.getTotalNum().hashCode());
		result = 37
				* result
				+ (getIntroduction() == null ? 0 : this.getIntroduction()
						.hashCode());
		result = 37 * result
				+ (getUserinfo() == null ? 0 : this.getUserinfo().hashCode());
		result = 37 * result
				+ (getIsDel() == null ? 0 : this.getIsDel().hashCode());
		result = 37 * result
				+ (getPid() == null ? 0 : this.getPid().hashCode());
		result = 37 * result
				+ (getSort() == null ? 0 : this.getSort().hashCode());
		return result;
	}

}