package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Driver_Script5 {

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
		new Select(driver.findElement(By.id("location"))).selectByIndex(4);
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);
		new Select(driver.findElement(By.id("room_nos"))).selectByIndex(2);
		 //new Select(driver.findElement(By.id("datepick_in"))).selectByIndex("31/09/2021");// datepick_in
		 WebElement date = driver.findElement(By.id ("datepick_in"));
		 date.click();
		 date.clear();
		 date.sendKeys("03/04/2022");
		 WebElement dat = driver.findElement(By.id ("datepick_out"));
		 dat.click();
		 dat.clear();
		 dat.sendKeys("06/04/2022");
		 new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);
		 new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
		 driver.findElement(By.id("Submit")).click();
		 driver.findElement(By.id("radiobutton_0")).click();// id="radiobutton_0"
		 driver.findElement(By.id("continue")).click(); // id="continue"
		 WebElement name = driver.findElement(By.id ("first_name"));// id="first_name"
		 name.sendKeys("Kavita");
		 WebElement name1 = driver.findElement(By.id ("last_name"));// id="last_name"
		 name1.sendKeys("Khajure");
		 WebElement na = driver.findElement(By.id ("address"));// address
		 na.sendKeys("At Thane, Sanchay Society Plot no 68 Room No C5");
		 WebElement n = driver.findElement(By.id ("cc_num"));// id="cc_num"
		 n.sendKeys("1234567887654321");
		 new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2); // id="cc_type"
		 new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(4);// id="cc_exp_month"
		 new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(10);// cc_exp_year
		 WebElement cc = driver.findElement(By.id ("cc_cvv"));// id="cc_cvv"
		 cc.sendKeys("123");
		 driver.findElement(By.id("book_now")).click();// book_now
		

	}

}
