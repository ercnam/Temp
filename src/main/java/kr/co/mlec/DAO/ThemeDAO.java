package kr.co.mlec.DAO;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.VO.ThemeVO;

@Repository
public class ThemeDAO
{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<ThemeVO> selectAllTheme()
	{
		return sqlSessionTemplate.selectList("kr.co.mlec.ThemeDAO.selectAllTheme");
	}

	public List<ThemeVO> selectOneTheme(int themeId)
	{
		List<ThemeVO> list = new ArrayList<ThemeVO>();
		list.add((ThemeVO) sqlSessionTemplate.selectOne("kr.co.mlec.ThemeDAO.selectOneTheme", themeId));
		return list;
	}
}
