package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Systeminfo;

public class SysteminfoServiceImpl implements SysteminfoService {

	private BaseDaoHibImpl<Systeminfo> baseDao;
	@Override
	public int creatSysteminfo(Systeminfo systeminfo) {
		// TODO Auto-generated method stub
		baseDao.save(systeminfo);
		return 0;
	}

	@Override
	public boolean deleteSysteminfo(Integer id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Systeminfo.class, id, "id");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateSysteminfo(Systeminfo systeminfo) {
		// TODO Auto-generated method stub
		try {
			baseDao.update(systeminfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List getSysteminfo(Integer id) {
		// TODO Auto-generated method stub
		String hql="select s from Systeminfo s where s.id="+id;
		return baseDao.find(hql);
	}

	
	
	public BaseDaoHibImpl<Systeminfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Systeminfo> baseDao) {
		this.baseDao = baseDao;
	}

}
