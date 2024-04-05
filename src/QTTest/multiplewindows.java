package QTTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://demoqa.com/browser-windows");
	      driver.manage().window().maximize();
	      driver.switchTo().frame(0);
	      String pwin = driver.getWindowHandle();
	      driver.findElement(By.id("tabButton")).click();
	      Set<String> wins = driver.getWindowHandles();
	      for(String win : wins) {
	    	  if(!win.equals(pwin)) {
	    		  driver.switchTo().window(win);
	    		  break;
	    	  }
	      }
	      System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	}

}
