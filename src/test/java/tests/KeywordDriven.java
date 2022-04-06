package tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.MyAccountPage;
import readers.ExcelReader;
import utilitiesPages.Paths;
import utilitiesPages.Screenshots;

public class KeywordDriven extends pom.LoginPage {
	pom.HomePage homePage = new pom.HomePage();
	MyAccountPage myAccountPage = new pom.MyAccountPage();
	ExcelReader excelReader = new ExcelReader();
	Screenshots screenshots = new Screenshots();
	String keyword = "not assigned";
	int row = 1;
	//=======================================================
	@BeforeClass()
	public void loadLoginData()
	{
		Paths paths = new Paths() ;
		String filepath = paths.KEYWORD_DATA;
		try {
			excelReader.setPath(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void login()
	{
		while(!keyword.equals("EndOfTest"))
		{
			try {
				keyword = ExcelReader.read(row, 0);
				if(keyword.equals("OpenWebSite"))
				{
					homePage.openAutomationPractice();
				}
				else if(keyword.equals("clickSignIn"))
				{
					homePage.clickSignIn();
				}
				else if(keyword.equals("typeEmail"))
				{
					typeEmail(excelReader.read(row, 1));
				}
				else if(keyword.equals("typePassword"))
				{
					typePassword(excelReader.read(row, 1));
				}
				else if(keyword.equals("typePassword"))
				{
					typePassword(excelReader.read(row, 1));
				}
				else if(keyword.equals("clickSubmitLogin"))
				{
					clickSubmit();
				}
				else if(keyword.equals("validateMyAccount"))
				{
					myAccountPage.assertMyAccountTitle();
				}
				else if(keyword.equals("takeScreenshot"))
				{
					screenshots.captureScreenShot("testScreenshot");
				}
				row++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
