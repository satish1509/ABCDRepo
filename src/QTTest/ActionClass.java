package QTTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://jqueryui.com/droppable/");
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      Actions ac = new Actions(driver);
	      WebElement target = driver.findElement(By.id("draggable"));
	      WebElement source = driver.findElement(By.id("droppable"));
	      ac.dragAndDrop(source, target).build().perform();
	      driver.switchTo().defaultContent();
	      driver.findElement(By.linkText("Draggable")).click();
	      driver.switchTo().frame(0);
	      WebElement t = driver.findElement(By.id("draggable"));
	      ac.dragAndDropBy(t, 10, 50).build().perform();
	      
	}

}
