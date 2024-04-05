package QTTest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      driver.manage().window().maximize();
	      String winid = driver.getWindowHandle();
	      //System.out.println(winid);//72EABF38243529A8AC2B39C03B793689
	      driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	      Set<String> winid2 = driver.getWindowHandles();
	      //System.out.println(winid2);
	      /*Iterator<String> it = winid2.iterator();
	      String parentid = it.next();
	      String childid = it.next();
	      System.out.println("parent Id:" +parentid);
	      System.out.println("Child Id:" +childid);*/
	      List<String> winlist = new ArrayList(winid2);
	      String parentid = winlist.get(0);
	      String childid = winlist.get(1);
	      System.out.println("parent Id:" +parentid);
	      System.out.println("Child Id:" +childid);
	      driver.switchTo().window(parentid);
	      System.out.println("parent window title:"+driver.getTitle());
	      driver.switchTo().window(childid);
	      System.out.println("child window title:"+driver.getTitle());
	      
	}

}

