package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Docinfo;

public class DocinfoServiceImpl implements DocinfoService {

	private BaseDaoHibImpl<Docinfo> baseDao;
	@Override
	public int creatDocinfo(Docinfo docinfo) {
		// TODO Auto-generated method stub
		baseDao.save(docinfo);
		return 0;
	}

	@Override
	public boolean updateDocinfo(Docinfo docinfo) {
		// TODO Auto-generated method stub
		try {
			baseDao.update(docinfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteDocinfo(Integer id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Docinfo.class, id, "id");
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

	@Override
	public List getDocinfoById(Integer id) {
		// TODO Auto-generated method stub
		String hql="select d from Docinfo d where d.id="+id;
		return baseDao.find(hql);
	}

	
	
	public BaseDaoHibImpl<Docinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Docinfo> baseDao) {
		this.baseDao = baseDao;
	}

}
