package himedia.myportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.dao.GuestbookDao;
import himedia.myportal.repositories.vo.GuestbookVo;
@Service("guestbookService")
public class GuestbookServiceImpl implements GuestbookService {
	@Autowired
	GuestbookDao guestbookDao;
	
	@Override
	public List<GuestbookVo> getMessageList() {
		List<GuestbookVo> list = guestbookDao.selectAll();
		return list;
	}

	@Override
	public boolean writeMessage(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMessage(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

}