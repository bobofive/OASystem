package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Bbscommentinfo;

public class BbscommentinfoServiceImpl implements BbscommentinfoService {

	private BaseDaoHibImpl<Bbscommentinfo> baseDao;
	@Override
	public int creatBbscommentinfo(Bbscommentinfo bbscommentinfo) {
		// TODO Auto-generated method stub
		baseDao.save(bbscommentinfo);
		return 0;
	}

	@Override
	public boolean updateBbscommentinfo(Bbscommentinfo bbscommentinfo) {
		// TODO Auto-generated method stub
		try {
			baseDao.update(bbscommentinfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteBbscommentinfo(Integer id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Bbscommentinfo.class,id,"id");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List getBbscommentinfoById(Integer id) {
		// TODO Auto-generated method stub
		String hql="select b from Bbscommentinfo b where b.id="+id;
		return baseDao.find(hql);
	}

	@Override
	public List getAllBbscommentinfo() {
		// TODO Auto-generated method stub
		return baseDao.findAll(Bbscommentinfo.class);
	}

	
	
	public BaseDaoHibImpl<Bbscommentinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Bbscommentinfo> baseDao) {
		this.baseDao = baseDao;
	}

}
