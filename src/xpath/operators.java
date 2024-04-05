package xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class operators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	      driver.manage().window().maximize();
	      //driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys("test1");
	      //driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys("test2");
	      List<WebElement> elements = (List<WebElement>) driver.findElement(By.xpath("//input[@maxlength<=15]"));
	     
	      }
	}

	

	


