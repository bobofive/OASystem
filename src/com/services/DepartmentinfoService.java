package com.services;

import java.util.List;

import com.domain.Departmentinfo;

public interface DepartmentinfoService {

	//������
	int creatDeoartmentinfo(Departmentinfo departmentinfo);
	//�޸Ĳ�����Ϣ
	boolean updateDepartmentinfo(Departmentinfo departmentinfo);
	//ɾ��������Ϣ
	boolean deleteDepartmentinfo(Integer departmentId);
	//�鿴���еĲ�����Ϣ
	List getAllDepartmentinfo();
	//���ݲ��Ŵ����ѯ������Ϣ
	List getDepartmentinfoById(Integer departmentId);
}
