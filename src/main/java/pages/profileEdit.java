package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class profileEdit 
{
SoftAssert softAssert = new SoftAssert();
    
	public	WebDriver driver;
		    
		    public profileEdit(WebDriver driver)
		    {
		        this.driver = driver;
		    }
		    By profileIcon =By.xpath("//img[@alt='profile-icon']");
		    By profile =By.xpath("//a[contains(text(),'Profile')]");
		    By editProfile =By.xpath("//p[contains(.,'Edit')]");
		    By fstName =By.xpath("//*[@id=\"personal\"]/div[2]/div/div[1]/div/input");
		    By lstName =By.xpath("//*[@id=\"personal\"]/div[2]/div/div[2]/div/input");
		    By edtSave =By.xpath("//button[contains(.,'Save')]");
		    
		    public void profiledit(String firstNm,String lstNm)
		    {
		    	driver.findElement(profileIcon).click();
		    	driver.findElement(profile).click();
		    	driver.findElement(editProfile).click();
		    	driver.findElement(fstName).sendKeys(firstNm);
		    	driver.findElement(lstName).sendKeys(lstNm);
		    }

}
