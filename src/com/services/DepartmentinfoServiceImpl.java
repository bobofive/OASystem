package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Departmentinfo;

public class DepartmentinfoServiceImpl implements DepartmentinfoService {

	private BaseDaoHibImpl<Departmentinfo> baseDao;
	@Override
	public int creatDeoartmentinfo(Departmentinfo departmentinfo) {
		// TODO Auto-generated method stub
		baseDao.save(departmentinfo);
		return 0;
	}

	@Override
	public boolean updateDepartmentinfo(Departmentinfo departmentinfo) {
		// TODO Auto-generated method stub
		try {
			baseDao.update(departmentinfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteDepartmentinfo(Integer departmentId) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Departmentinfo.class, departmentId, "departmentId");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List getAllDepartmentinfo() {
		// TODO Auto-generated method stub
		return baseDao.findAll(Departmentinfo.class);
	}

	@Override
	public List getDepartmentinfoById(Integer departmentId) {
		// TODO Auto-generated method stub
		String hql="select d from Departmentinfo d where d.departmentId="+departmentId;
		return baseDao.find(hql);
	}

	
	
	public BaseDaoHibImpl<Departmentinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Departmentinfo> baseDao) {
		this.baseDao = baseDao;
	}

}
