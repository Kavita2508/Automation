package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_First_WebDriver_Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://www.adactinhotelapp.com");
       driver.manage().window().maximize();
       driver.navigate().to("https://www.google.com");
       driver.navigate().back();
       driver.navigate().forward();
	}

}
