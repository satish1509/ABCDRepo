import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	      driver.manage().window().maximize();
	      Thread.sleep(5000);
			   WebElement button =driver.findElement(By.xpath("//span[text()='right click me']"));
			   Actions act = new Actions(driver);
			   act.contextClick(button).perform();
		 
				
	}

}
