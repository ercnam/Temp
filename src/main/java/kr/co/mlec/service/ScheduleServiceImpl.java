package kr.co.mlec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.DAO.ThemeDAO;
import kr.co.mlec.DAO.UserDAO;
import kr.co.mlec.VO.ThemeVO;
import kr.co.mlec.VO.UserVO;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService
{
	@Autowired
	private ThemeDAO themeDAO;
	@Autowired
	private UserDAO userDAO;

	public List<ThemeVO> selectAllTheme()
	{
		return themeDAO.selectAllTheme();
	}

	public List<ThemeVO> selectOneTheme(int themeId)
	{
		return themeDAO.selectOneTheme(themeId);
	}

	public UserVO isDuplicate(String userId)
	{
		return userDAO.isDuplicate(userId);
	}

	public void join(UserVO user)
	{
		userDAO.join(user);		
	}
	
//	@Override
//	public List<BoardVO> list() throws Exception
//	{		
//		return dao.selectAll();	
//	}
//
//	@Override
//	public void replyDelete(int delNo) throws Exception
//	{
//		dao.deleteReply(delNo);
//	}
//	
//	@Override
//	public void insertReply(ReplyVO rVo) throws Exception
//	{
//		dao.insertReply(rVo);		
//	}
//
//	@Override
//	public void deleteBoard(int no) throws Exception
//	{
//		dao.deleteBoard(no);		
//	}
//
//	@Override
//	public BoardVO selectOne(int postNo) throws Exception
//	{
//		return dao.selectOne(postNo);
//	}
//
//	@Override
//	public FileVO selectFileByNo(int postNo) throws Exception
//	{		
//		return dao.selectFileByNo(postNo);
//	}
//
////	@Override
////	public List<ReplyVO> selectAllReply(int postNo) throws Exception
////	{
////		return dao.selectAllReply(postNo);
////	}
//
//	@Override
//	public void updateBoard(BoardVO board)
//	{
//		dao.updateBoard(board);		
//	}
//
//	@Override
//	public int insertBoard(BoardVO board)
//	{		
//		return dao.insertBoard(board);
//	}
//
//	@Override
//	public void insertFile(FileVO fVo)
//	{
//		dao.insertFile(fVo);
//	}
//
//	@Override
//	public List<ReplyVO> replyList(int postNo) throws Exception
//	{
//		return dao.selectAllReply(postNo);
//	}
//
//	@Override
//	public void updateReply(ReplyVO rVo) throws Exception
//	{
//		dao.updateReply(rVo);
//	}
//
//	@Override
//	public Member loginUser(Member loginUser) throws Exception
//	{		
//		return dao.loginUser(loginUser);
//	}
}
