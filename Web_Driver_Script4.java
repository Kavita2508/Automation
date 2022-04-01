package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Driver_Script4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://www.adactinhotelapp.com");
		driver.manage().window().maximize();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname= driver.findElement(By.className("login_input"));
		uname.sendKeys("Kavita25");
		driver.findElement(By.id("password")).sendKeys("Kavi@123");
		driver.findElement(By.id("login")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		driver.quit();

	}

}
