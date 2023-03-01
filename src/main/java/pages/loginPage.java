package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import io.qameta.allure.Allure;

public class loginPage
{
	SoftAssert softAssert = new SoftAssert();
    
	public	WebDriver driver;
		    
		    public loginPage(WebDriver driver)
		    {
		        this.driver = driver;
		        
		    }
		    By userNameF =By.xpath("//*[@id=\"root\"]/div/form/div/div/div[2]/div/div/div[1]/div/input");
		    By passwordF = By.xpath("//*[@id=\"root\"]/div/form/div/div/div[2]/div/div/div[2]/div/input");
		    By rememberMe = By.xpath("//input[@id='remember_me']");
		    By loginBtn = By.xpath("/html/body/div[1]/div/form/div/div/div[2]/div/div/div[4]/button");
		    
		    public void loginClick(String userName, String password)
		    {
		    	driver.findElement(userNameF).sendKeys(userName);
		    	Allure.step("User name is entered");
		    	driver.findElement(passwordF).sendKeys(password);
		    	Allure.step("Password is entered");
		    	driver.findElement(loginBtn).click();
		    	Allure.step("Login Button is clicked");
		    	driver.findElement(rememberMe).click();
		    	Allure.step("Remember me checkbox is clicked");
		    	softAssert.assertEquals("Login","Login");   
			    softAssert.assertAll();
		    }
}