package com.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_loginPage {

	public Pom_loginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement usn_edit;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pass_edit;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement login_btn;
	
	
	public WebElement getUsn() {
		return usn_edit;
	}

	public void setUsn(WebElement usn) {
		this.usn_edit = usn;
	}
//......................................................................
	public WebElement getPass() {
		return pass_edit;
	}

	public void setPass(WebElement pass) {
		this.pass_edit = pass;
	}
//......................................................................
	public WebElement getLogin_btn() {
		return login_btn;
	}

	public void setLogin_btn(WebElement login_btn) {
		this.login_btn = login_btn;
	}
//......................................................................	
	
	//business logic implementation in pom page only
	
	
	  public void loginToApp(String userName,String Password) 
	  {
	  usn_edit.sendKeys(userName); 
	  pass_edit.sendKeys(Password);
	  //login_btn.click(); 
	  }
	 
}
