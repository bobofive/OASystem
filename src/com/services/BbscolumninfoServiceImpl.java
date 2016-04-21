package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Bbscolumninfo;

public class BbscolumninfoServiceImpl implements BbscolumninfoService {

	private BaseDaoHibImpl<Bbscolumninfo> baseDao;
	@Override
	public int creatBbscolumninfo(Bbscolumninfo bbscolumninfo) {
		// TODO Auto-generated method stub
		baseDao.save(bbscolumninfo);
		return 0;
	}

	@Override
	public boolean updateBbscolumninfo(Bbscolumninfo bbscolumninfo) {
		// TODO Auto-generated method stub
		try {
			baseDao.update(bbscolumninfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteBbscolumninfo(Integer id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Bbscolumninfo.class, id, "id");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List getBbscolumninfoById(Integer id) {
		// TODO Auto-generated method stub
		String hql="select b from Bbscolumninfo b where b.id="+id;
		return baseDao.find(hql);
	}

	@Override
	public List getAllBbscolumninfo() {
		// TODO Auto-generated method stub
		return baseDao.findAll(Bbscolumninfo.class);
	}

	
	
	public BaseDaoHibImpl<Bbscolumninfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Bbscolumninfo> baseDao) {
		this.baseDao = baseDao;
	}

}
