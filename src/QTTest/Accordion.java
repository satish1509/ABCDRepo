package QTTest;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accordion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://jqueryui.com/accordion/");
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-id-2"))));
	      System.out.println(driver.findElement(By.id("ui-id-2")).getText());
	      driver.findElement(By.id("ui-id-3")).click();
	      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-id-4"))));
	      System.out.println(driver.findElement(By.id("ui-id-4")).getText());
	      driver.findElement(By.id("ui-id-5")).click();
	      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ui-id-6"))));
	      System.out.println(driver.findElement(By.id("ui-id-6")).getText());
	}

}
