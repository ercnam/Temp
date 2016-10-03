package kr.co.mlec.VO;

//user_no int primary key auto_increment,
//user_id varchar(100) not null,
//user_phone_number varchar(13),
//user_name varchar(30) not null,
//user_cash int default 0,
//theme_id int default 1

public class UserVO
{
	private int userNo;
	private String userId;
	private String userPhoneNumber;
	private String userName;
	private int userCash;
	private int themeId;
	
	public int getUserNo()
	{
		return userNo;
	}
	public void setUserNo(int userNo)
	{
		this.userNo = userNo;
	}
	public String getUserId()
	{
		return userId;
	}
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	public String getUserPhoneNumber()
	{
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber)
	{
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public int getUserCash()
	{
		return userCash;
	}
	public void setUserCash(int userCash)
	{
		this.userCash = userCash;
	}
	public int getThemeId()
	{
		return themeId;
	}
	public void setThemeId(int themeId)
	{
		this.themeId = themeId;
	}
}
