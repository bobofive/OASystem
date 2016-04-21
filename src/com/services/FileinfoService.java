package com.services;

import java.util.List;

import com.domain.Fileinfo;

public interface FileinfoService {
	
	//添加文件
	int creatFileinfo(Fileinfo fileinfo);
	//修改文件信息
	boolean updateFileinfo(Fileinfo fileinfo);
	//删除文件
	boolean deleteFileinfo(Integer id);
	//查看文件信息
	List getFileinfoById(Integer id);

}
