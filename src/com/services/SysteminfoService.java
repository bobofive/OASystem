package com.services;

import java.util.List;

import com.domain.Systeminfo;

public interface SysteminfoService {

	//����ϵͳ��Ϣ
	int creatSysteminfo(Systeminfo systeminfo);
	//ɾ��ϵͳ��Ϣ
	boolean deleteSysteminfo(Integer id);
	//�޸�ϵͳ��Ϣ
	boolean updateSysteminfo(Systeminfo systeminfo);
	//��ѯϵͳ��Ϣ
	List getSysteminfo(Integer id);
}
