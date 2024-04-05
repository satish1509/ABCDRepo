package QTTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://jqueryui.com/Selectable/");
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      //driver.findElement(By.linkText("Selectable"));
	      Actions ac = new Actions(driver);
	      ac.keyDown(Keys.CONTROL).build().perform();
	      driver.findElement(By.xpath("//li[text()='Item 1']")).click();
	      driver.findElement(By.xpath("//li[text()='Item 2']")).click();
	      ac.keyUp(Keys.CONTROL).build().perform();
	      System.out.println(driver.findElement(By.xpath("//li[text()='Item 1']")).getAttribute("class").contains("ui-selected"));
	}

}
