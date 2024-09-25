package whyPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Why_Pom_Test {

	@Test
	public void refreshPage() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		driver.navigate().refresh();
		Thread.sleep(4000);
	
		pass.sendKeys("admin@123");
		//once we refresh we cannot interact with the expired element address, then we come across stale element exception
		
		
		driver.quit();
		
		
	}

}
