import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:/Selenium 5th batch/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		
//		for loading the site and trying to login
		driver.get("http://newtours.demoaut.com/");
		driver.findElement (By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("demo");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("demo");
		driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).submit();
		
//		implicit wait should be applied before the next page loads. or any mouse hover menu, or any time consuming content loading.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
//		for static dropdowns : passenger
		Select dd1 = new Select(driver.findElement(By.name("passCount")));
		dd1.selectByIndex(0);
		dd1.selectByIndex(1);
		dd1.selectByIndex(2);
		dd1.selectByIndex(3);
		
//		dropdowns: departing from 
		Select dd2 = new Select(driver.findElement(By.name("fromPort")));
		dd2.selectByIndex(0);
		dd2.selectByIndex(1);
		dd2.selectByIndex(2);
		dd2.selectByIndex(3);
		dd2.selectByIndex(4);
		dd2.selectByIndex(5);
		dd2.selectByIndex(6);
		dd2.selectByIndex(7);
		dd2.selectByIndex(8);
		dd2.selectByIndex(9);
		
	}

}
