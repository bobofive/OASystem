package com.services;

import java.util.List;

import com.domain.Systeminfo;

public interface SysteminfoService {

	//创建系统信息
	int creatSysteminfo(Systeminfo systeminfo);
	//删除系统信息
	boolean deleteSysteminfo(Integer id);
	//修改系统信息
	boolean updateSysteminfo(Systeminfo systeminfo);
	//查询系统信息
	List getSysteminfo(Integer id);
}
