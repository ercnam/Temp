package kr.co.mlec.VO;

//theme_id int primary key auto_increment,
//theme_name varchar(50) default '새 테마',
//theme_font_light varchar(10) default '#000000',
//theme_font_heavy varchar(10) default '#000000',
//theme_back_light varchar(10) default '#FFFFFF',
//theme_back_heavy varchar(10) default '#FFFFFF',
//theme_border_light varchar(10) default '#000000',
//theme_border_heavy varchar(10) default '#000000',
//theme_days varchar(10) default '#FFFFFF',
//theme_calendar varchar(10) default '#FFFFFF'

public class ThemeVO
{
	private int themeId;
	private String themeName;
	private String themeFontLight;
	private String themeFontHeavy;
	private String themeBackLight;
	private String themeBackHeavy;
	private String themeBorderLight;
	private String themeBorderHeavy;
	private String themeDays;
	private String themeCalendar;
	
	public int getThemeId()
	{
		return themeId;
	}
	public void setThemeId(int themeId)
	{
		this.themeId = themeId;
	}
	public String getThemeName()
	{
		return themeName;
	}
	public void setThemeName(String themeName)
	{
		this.themeName = themeName;
	}
	public String getThemeFontLight()
	{
		return themeFontLight;
	}
	public void setThemeFontLight(String themeFontLight)
	{
		this.themeFontLight = themeFontLight;
	}
	public String getThemeFontHeavy()
	{
		return themeFontHeavy;
	}
	public void setThemeFontHeavy(String themeFontHeavy)
	{
		this.themeFontHeavy = themeFontHeavy;
	}
	public String getThemeBackLight()
	{
		return themeBackLight;
	}
	public void setThemeBackLight(String themeBackLight)
	{
		this.themeBackLight = themeBackLight;
	}
	public String getThemeBackHeavy()
	{
		return themeBackHeavy;
	}
	public void setThemeBackHeavy(String themeBackHeavy)
	{
		this.themeBackHeavy = themeBackHeavy;
	}
	public String getThemeBorderLight()
	{
		return themeBorderLight;
	}
	public void setThemeBorderLight(String themeBorderLight)
	{
		this.themeBorderLight = themeBorderLight;
	}
	public String getThemeBorderHeavy()
	{
		return themeBorderHeavy;
	}
	public void setThemeBorderHeavy(String themeBorderHeavy)
	{
		this.themeBorderHeavy = themeBorderHeavy;
	}
	public String getThemeDays()
	{
		return themeDays;
	}
	public void setThemeDays(String themeDays)
	{
		this.themeDays = themeDays;
	}
	public String getThemeCalendar()
	{
		return themeCalendar;
	}
	public void setThemeCalendar(String themeCalendar)
	{
		this.themeCalendar = themeCalendar;
	}
}
