package testCases;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import pages.loginPage;
import utilities.BaseClass;
import utilities.CommonUtilities;
@Listeners({utilities.AllureListners.class})
public class loginTest extends BaseClass
{
	public WebDriver driver;
	CommonUtilities	xcl = new CommonUtilities();
	@BeforeTest
	public void beforetest()
	{
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
    	driver.get("http://ecompartner.digitalmesh.co.in/");
	}
	@Test(priority=1)
	@Description("TestCase : To verify login Testcase")
	//Login
	public void login()
	{
		loginPage lp =new loginPage(driver);
		lp.loginClick(xcl.getCellData("Login","User Name"), xcl.getCellData("Login","Password"));	
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
}
