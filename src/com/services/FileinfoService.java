package com.services;

import java.util.List;

import com.domain.Fileinfo;

public interface FileinfoService {
	
	//����ļ�
	int creatFileinfo(Fileinfo fileinfo);
	//�޸��ļ���Ϣ
	boolean updateFileinfo(Fileinfo fileinfo);
	//ɾ���ļ�
	boolean deleteFileinfo(Integer id);
	//�鿴�ļ���Ϣ
	List getFileinfoById(Integer id);

}
