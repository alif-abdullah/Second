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
		
//		----------------------------- Second page---------------------
//		Type
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		
//		for static dropdowns : passenger
		/*Select dd1 = new Select(driver.findElement(By.name("passCount")));
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
		
//		Dropdowns date month
		Select dd3 = new Select (driver.findElement(By.name("fromMonth")));
		dd3.selectByIndex(0);
		dd3.selectByIndex(1);
		dd3.selectByIndex(2);
		dd3.selectByIndex(3);
		dd3.selectByIndex(4);
		dd3.selectByIndex(5);
		dd3.selectByIndex(6);
		dd3.selectByIndex(7);
		dd3.selectByIndex(8);
		dd3.selectByIndex(9);
		dd3.selectByIndex(10);
		dd3.selectByIndex(11); */
		
//		day
		/*Select dd4 = new Select (driver.findElement(By.name("fromDay")));
		dd4.selectByIndex(0);
		dd4.selectByIndex(1);
		dd4.selectByIndex(2);
		dd4.selectByIndex(3);
		dd4.selectByIndex(4);
		dd4.selectByIndex(5);
		dd4.selectByIndex(6);
		dd4.selectByIndex(7);
		dd4.selectByIndex(8);
		dd4.selectByIndex(9);
		dd4.selectByIndex(10);
		dd4.selectByIndex(11);
		dd4.selectByIndex(12);
		dd4.selectByIndex(13);
		dd4.selectByIndex(14);
		dd4.selectByIndex(15);
		dd4.selectByIndex(16);
		dd4.selectByIndex(17);
		dd4.selectByIndex(18);
		dd4.selectByIndex(19);
		dd4.selectByIndex(20);
		dd4.selectByIndex(21);
		dd4.selectByIndex(22);
		dd4.selectByIndex(23);
		dd4.selectByIndex(24);
		dd4.selectByIndex(25);
		dd4.selectByIndex(26);
		dd4.selectByIndex(27);
		dd4.selectByIndex(28);
		dd4.selectByIndex(29);
		dd4.selectByIndex(30);
		dd4.selectByIndex(31);*/
		
//		departing from
		/*Select dd5 = new Select(driver.findElement(By.name("toPort")));
		dd5.selectByIndex(0);
		dd5.selectByIndex(1);
		dd5.selectByIndex(2);
		dd5.selectByIndex(3);
		dd5.selectByIndex(4);
		dd5.selectByIndex(5);
		dd5.selectByIndex(6);
		dd5.selectByIndex(7);
		dd5.selectByIndex(8);
		dd5.selectByIndex(9);*/
		
//		returning month
		/*Select dd6 = new Select (driver.findElement(By.name("toMonth")));
		dd6.selectByIndex(0);
		dd6.selectByIndex(1);
		dd6.selectByIndex(2);
		dd6.selectByIndex(3);
		dd6.selectByIndex(4);
		dd6.selectByIndex(5);
		dd6.selectByIndex(6);
		dd6.selectByIndex(7);
		dd6.selectByIndex(8);
		dd6.selectByIndex(9);
		dd6.selectByIndex(10);
		dd6.selectByIndex(11);
//		retuning day
		Select dd7 = new Select (driver.findElement(By.name("toDay")));
		dd7.selectByIndex(0);
		dd7.selectByIndex(1);
		dd7.selectByIndex(2);
		dd7.selectByIndex(3);
		dd7.selectByIndex(4);
		dd7.selectByIndex(5);
		dd7.selectByIndex(6);
		dd7.selectByIndex(7);
		dd7.selectByIndex(8);
		dd7.selectByIndex(9);
		dd7.selectByIndex(10);
		dd7.selectByIndex(11);
		dd7.selectByIndex(12);
		dd7.selectByIndex(13);
		dd7.selectByIndex(14);
		dd7.selectByIndex(15);
		dd7.selectByIndex(16);
		dd7.selectByIndex(17);
		dd7.selectByIndex(18);
		dd7.selectByIndex(19);
		dd7.selectByIndex(20);
		dd7.selectByIndex(21);
		dd7.selectByIndex(22);
		dd7.selectByIndex(23);
		dd7.selectByIndex(24);
		dd7.selectByIndex(25);
		dd7.selectByIndex(26);
		dd7.selectByIndex(27);
		dd7.selectByIndex(28);
		dd7.selectByIndex(29);
		dd7.selectByIndex(30);
		dd7.selectByIndex(31);*/
		
		
//		service class
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();

//		airline
		Select dd8 = new Select (driver.findElement(By.name("airline")));
		dd8.selectByIndex(0);
		dd8.selectByIndex(1);
		dd8.selectByIndex(2);
		dd8.selectByIndex(3);
		
//		continuebutton
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input")).submit();
		
		
//		----------------------------------------------------- Third page --------------------------------------
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		upper radios
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input")).click();
		
//		returnflights
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input")).click();
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input")).click();
		
//		continuebutton
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input")).submit();
	}

}
