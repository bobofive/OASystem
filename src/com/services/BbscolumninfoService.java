package com.services;

import java.util.List;

import com.domain.Bbscolumninfo;

public interface BbscolumninfoService {

	int creatBbscolumninfo(Bbscolumninfo bbscolumninfo);
	boolean updateBbscolumninfo(Bbscolumninfo bbscolumninfo);
	boolean deleteBbscolumninfo(Integer id);
	List getBbscolumninfoById(Integer id);
	List getAllBbscolumninfo();
}
