package com.services;

import java.util.List;

import com.domain.Bbscommentinfo;

public interface BbscommentinfoService {

	int creatBbscommentinfo(Bbscommentinfo bbscommentinfo);
	boolean updateBbscommentinfo(Bbscommentinfo bbscommentinfo);
	boolean deleteBbscommentinfo(Integer id);
	List getBbscommentinfoById(Integer id);
	List getAllBbscommentinfo();
}
