package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.repositories.vo.GuestbookVo;

@Repository("guestbookDao")
public class GuestbookDaoImpl implements GuestbookDao {
	@Autowired
	SqlSession sqlSession; 
	
	@Override
	public List<GuestbookVo> selectAll() {
		List<GuestbookVo> list = 
				sqlSession.selectList("guestbook.selectAll");
		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}