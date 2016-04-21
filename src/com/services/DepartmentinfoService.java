package com.services;

import java.util.List;

import com.domain.Departmentinfo;

public interface DepartmentinfoService {

	//增添部门
	int creatDeoartmentinfo(Departmentinfo departmentinfo);
	//修改部门信息
	boolean updateDepartmentinfo(Departmentinfo departmentinfo);
	//删除部门信息
	boolean deleteDepartmentinfo(Integer departmentId);
	//查看所有的部门信息
	List getAllDepartmentinfo();
	//根据部门代码查询部门信息
	List getDepartmentinfoById(Integer departmentId);
}
