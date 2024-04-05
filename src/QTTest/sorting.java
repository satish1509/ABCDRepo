package QTTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://jqueryui.com/sortable/");
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      Actions ac = new Actions(driver);
	      WebElement source = driver.findElement(By.xpath("//li[text()='Item 1']"));
	      WebElement dest = driver.findElement(By.xpath("//li[text()='Item 4']"));
	      ac.clickAndHold(source).moveToElement(dest).moveByOffset(0, 20).release().build().perform();
	      driver.switchTo().defaultContent();
	      driver.findElement(By.linkText("Selectable")).click();
	      driver.switchTo().frame(0);
	      ac.keyDown(Keys.CONTROL).build().perform();
	      driver.findElement(By.xpath("//li[text()='Item 1']")).click();
	      driver.findElement(By.xpath("//li[text()='Item 2']")).click();
	      ac.keyUp(Keys.CONTROL).build().perform();
	      
	}

}
