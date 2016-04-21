package com.services;

import java.util.List;

import com.dao.BaseDaoHibImpl;
import com.domain.Noticeinfo;

public class NoticeinfoServiceImpl implements NoticeinfoService {

	private BaseDaoHibImpl<Noticeinfo> baseDao;
	
	@Override
	public int creatNoticeinfo(Noticeinfo noticeinfo) {
		// TODO Auto-generated method stub
		baseDao.save(noticeinfo);
		return 0;
	}

	@Override
	public boolean updateNoticeinfo(Noticeinfo noticeinfo) {
		// TODO Auto-generated method stub
		try {
			baseDao.update(noticeinfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteNoticeinfo(Integer id) {
		// TODO Auto-generated method stub
		try {
			baseDao.delete(Noticeinfo.class, id, "id");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List getAllNoticeinfo() {
		// TODO Auto-generated method stub
		return baseDao.findAll(Noticeinfo.class);
	}

	@Override
	public Noticeinfo getNoticeinfoById(Integer id) {
		// TODO Auto-generated method stub
		return baseDao.get(Noticeinfo.class, id);
	}

	@Override
	public List getIndexNotice() {
		// TODO Auto-generated method stub
		String hql="select n from Noticeinfo n order by n.date desc limit 10";
		return baseDao.find(hql);
	}

	
	
	public BaseDaoHibImpl<Noticeinfo> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDaoHibImpl<Noticeinfo> baseDao) {
		this.baseDao = baseDao;
	}

}
