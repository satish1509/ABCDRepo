import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.shaadi.com");
      //driver.get("https://www.actitime.com");
      //driver.get("https://omayo.blogspot.com/");
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//a[@data-testid=\"login_link\"]")).click();
      driver.findElement(By.xpath("//a[@data-testid='sign_up_free']")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//span[text()='Myself']")).click();
      driver.findElement(By.xpath("//span[text()=\"Male\"]")).click();
      //driver.findElement(By.xpath("//button[@tabindex=\"0\"]")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//span[text()=\"First name\"]/../../../input")).sendKeys("Test");
      driver.findElement(By.xpath("//span[text()=\"Last name\"]/../../../input")).sendKeys("QA");
      driver.findElement(By.xpath("//input[@placeholder=\"DD\"]")).sendKeys("22");
      driver.findElement(By.xpath("//input[@placeholder=\"MM\"]")).sendKeys("09");
      driver.findElement(By.xpath("//input[@placeholder=\"YYYY\"]")).sendKeys("1990");
      driver.findElement(By.xpath("//button[@tabindex=\"0\"]")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//div[@id=\"mui-component-select-community\"]")).click();
      List<WebElement> ee = driver.findElements(By.xpath("//ul[@tabindex=\"-1\"]/li"));
      String religion = "Christian";
      for(WebElement e : ee) {
    	  if(e.getText().equals(religion)) {
    		  e.click();
    		  break;
    	  }
      }
      driver.findElement(By.xpath("//div[@id=\"mui-component-select-mother_tongue\"]")).click();
      List<WebElement>re = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
      String community = "Hindi";
      for(WebElement c : re) {
    	  if(c.getText().equals(community)) {
    		  c.click();
    		  break;
    	  }
      }
      Thread.sleep(3000);
      driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/button[1]/span[1]/span[1]/p[1]")).click();
	}

}