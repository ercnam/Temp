package kr.co.mlec.DAO;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.VO.ThemeVO;
import kr.co.mlec.VO.UserVO;

@Repository
public class UserDAO
{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<UserVO> selectAllUser()
	{
		return sqlSessionTemplate.selectList("kr.co.mlec.UserDAO.selectAllUser");
	}

	public List<UserVO> selectOneUser(int themeId)
	{
		List<UserVO> list = new ArrayList<UserVO>();
		list.add((UserVO) sqlSessionTemplate.selectOne("kr.co.mlec.UserDAO.selectOneUser", themeId));
		return list;
	}
}
