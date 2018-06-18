package piyush;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class New1Test {
WebDriver driver;
@Test
public void f() throws Throwable {
			

	

	//member alerts

		


	//alert log

	Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='menu2']/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='submenu2.0']/span[2]")).click();
		List<WebElement> check = driver.findElements(By.name("alertIds"));
		for (WebElement e : check) {
			e.click();
			System.out.println("all the check boxes are checked");
		}
		driver.findElement(By.xpath(".//*[@id='tdContents']/form/table[2]/tbody/tr/td[2]/input")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("check boxes are dismissed");
		//driver.switchTo().alert.accept();
		driver.findElement(By.xpath(".//*[@id='submenu2.1']/span[2]")).click();
		driver.findElement(By.xpath(".//*[@id='selectAllButton']")).click();
		Thread.sleep(3000);
		System.out.println("all the check boxes are selected");
		driver.findElement(By.xpath(".//*[@id='selectNoneButton']")).click();
		Thread.sleep(3000);
		System.out.println("all the check boxes are not selected");
		driver.findElement(By.xpath(".//*[@id='tdContents']/form/table[2]/tbody/tr/td[2]/input")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath(".//*[@id='submenu2.2']/span[2]")).click();
		WebElement type = driver.findElement(By.name("query(type)"));
		Select dropdown = new Select(type);
		dropdown.selectByVisibleText("Member");
		WebElement date = driver.findElement(By.name("query(period).begin"));
		Thread.sleep(2000);
		date.sendKeys("40/13/2019");
		date.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		date.sendKeys("12/01/2014");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB, "23/06/2018");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='memberUsername']")).sendKeys("pinkubhui(pinkubhui)");
		driver.findElement(By.xpath(".//*[@id='memberName']")).sendKeys("pinkubhui");
		driver.findElement(By.xpath(".//*[@id='tdContents']/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td/input"))
				.click();
		System.out.println("member is selected is from list box");
		// System.out.println("System is selected");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td[2]/select/option[1]")).click();
		//	 driver.findElement(By.xpath(".//*[@id='tdContents']/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td/input")).click();
		//Thread.sleep(3000);
		//	 List <WebElement> systemList = driver.findElements(By.className("defaultTableContent"));
		//for(WebElement b: systemList)
		//System.out.println(b.getText());
	

}
@BeforeTest
public void beforeTest() {
	driver=new FirefoxDriver();
	driver.get("http://localhost:8585/do/login");
	String Expectedurl = "Cyclos";
	String Actualurl = driver.getTitle();
	Assert.assertEquals(Expectedurl,Actualurl);
	System.out.println("Expected url and Actual url are same");
	driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@value='1']")).click();
	driver.findElement(By.xpath("//input[@value='2']")).click();
	driver.findElement(By.xpath("//input[@value='3']")).click();
	driver.findElement(By.xpath("//input[@value='4']")).click();
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	
}

@AfterTest
public void afterTest() {
	System.out.println("sucessfully logged out");
	driver.close();
}


}