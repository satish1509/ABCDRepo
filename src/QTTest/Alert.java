package QTTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://demoqa.com/alerts");
	      driver.manage().window().maximize();
	      //driver.switchTo().frame(0);
	      driver.findElement(By.id("alertButton")).click();
	      //System.out.println(driver.switchTo().alert().getText());
	      Thread.sleep(5000);
	      driver.switchTo().alert().accept();
	      
	      driver.findElement(By.id("timerAlertButton")).click();
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.alertIsPresent());
	      System.out.println(driver.switchTo().alert().getText());
	      driver.switchTo().alert().dismiss();
	      driver.close();
	}

}
