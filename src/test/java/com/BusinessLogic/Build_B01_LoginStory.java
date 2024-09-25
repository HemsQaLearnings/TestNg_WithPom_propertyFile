package com.BusinessLogic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic_Utils.FileUtils;
import com.PomPages.Pom_loginPage;

public class Build_B01_LoginStory 
{

	@Test
	public void login_test() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		FileUtils fs=new FileUtils();
				String url=fs.read_data("url");
				String usn	= fs.read_data("LoginPage_Usn");
				String psw = fs.read_data("LoginPage_Pass");
				
		driver.get(url);
		Thread.sleep(3000);
		
		
		Pom_loginPage pl=new Pom_loginPage(driver);
		
		
		pl.loginToApp(usn, psw);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pl.loginToApp(usn, psw);
		Thread.sleep(3000);
		pl.getLogin_btn().click();
		Thread.sleep(3000);
		WebElement verify = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		String text = verify.getText();
		System.out.println(text+"===> Home Page is Displayed");
		Thread.sleep(3000);
		driver.quit();
		
	}
}


   // Prepared by instagram id : Hemsqalearnings