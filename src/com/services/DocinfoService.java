package com.services;

import java.util.List;

import com.domain.Docinfo;

public interface DocinfoService {

	//添加文档
	int creatDocinfo(Docinfo docinfo);
	//修改文档信息
	boolean updateDocinfo(Docinfo docinfo);
	//删除文档
	boolean deleteDocinfo(Integer id);
	//查看文档
	List getDocinfoById(Integer id);
}
