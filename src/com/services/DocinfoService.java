package com.services;

import java.util.List;

import com.domain.Docinfo;

public interface DocinfoService {

	//����ĵ�
	int creatDocinfo(Docinfo docinfo);
	//�޸��ĵ���Ϣ
	boolean updateDocinfo(Docinfo docinfo);
	//ɾ���ĵ�
	boolean deleteDocinfo(Integer id);
	//�鿴�ĵ�
	List getDocinfoById(Integer id);
}
