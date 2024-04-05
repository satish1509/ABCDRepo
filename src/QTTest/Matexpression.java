package QTTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Matexpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91939\\eclipse-workspace\\Automation_project\\Drivers\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	      driver.get("https://material.angular.io/components/expansion/overview");
	      driver.manage().window().maximize();
	      //driver.findElement(By.xpath("//mat-expansion-panel[1]//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c1676997785-48']")).getText();
	      //System.out.println(driver.findElement(By.xpath("//mat-expansion-panel[1]//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c1676997785-48']")).getText());
	      WebElement firstExpansionTitle = driver.findElement(By.xpath("//mat-expansion-panel[1]//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c1676997785-48']"));
	        String firstTitleText = firstExpansionTitle.getText();
	        System.out.println("First Expansion title: " + firstTitleText);

	        // Locate the second mat-panel-title
	        WebElement secondExpansionTitle = driver.findElement(By.xpath("//mat-expansion-panel[2]//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c1676997785-50']"));
	        String secondTitleText = secondExpansionTitle.getText();
	        System.out.println("Second Expansion title: " + secondTitleText);

	}

}
