package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Fileinfo;

public class FileinfoServiceImpl implements FileinfoService {

	private BaseDaoHibImpl<Fileinfo> baseDao;
	@Override
	public int creatFileinfo(Fileinfo fileinfo) {
		// TODO Auto-generated method stub
		baseDao.save(fileinfo);
		return 0;
	}

	@Override
	public boolean updateFileinfo(Fileinfo fileinfo) {
		// TODO Auto-generated method stub
		try {
			baseDao.update(fileinfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteFileinfo(Integer id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Fileinfo.class,id,"id");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List getFileinfoById(Integer id) {
		// TODO Auto-generated method stub
		String hql="select f from Fileinfo f where f.id="+id;
		return baseDao.find(hql);
	}

	
	
	public BaseDaoHibImpl<Fileinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Fileinfo> baseDao) {
		this.baseDao = baseDao;
	}

}
