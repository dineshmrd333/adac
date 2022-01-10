package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class LoginPage extends LibGlobal {
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}


	@FindBy (id="username")
	private WebElement txtUserName;
	
	@FindBy (id="password")
	private WebElement txtPassword;
	
	@FindBy (className="login_button")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
public void login(String userName, String passWord) {
	type(getTxtUserName(), userName);
	type(getTxtPassword(), passWord);
	click(getBtnLogin());
}
	
	
	
	
	
}
