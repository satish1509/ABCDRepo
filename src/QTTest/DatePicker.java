package QTTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://jqueryui.com/datepicker/");
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      driver.findElement(By.id("datepicker")).click();
	      //driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all' and @title='Next']")).click();
	      driver.findElement(By.xpath("//td[@data-month='11' and @data-year='2023']//a[text()='25']")).click();
	    
	}

}
