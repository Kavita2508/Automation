package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://www.adactinhotelapp.com");
	       driver.manage().window().maximize();
		WebElement uname= driver.findElement(By.name("username"));
		uname.sendKeys("Kavita25");
		driver.findElement(By.name("password")).sendKeys("Kavi@123");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	}


