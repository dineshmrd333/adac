package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class SelectHotel extends LibGlobal {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnRadioButton;

	@FindBy(className = "login_title")
	private WebElement txtSelectHotel;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getTxtSelectHotel() {
		return txtSelectHotel;
	}

	public WebElement getBtnRadioButton() {
		return btnRadioButton;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void verifySelectHotel(String expValue) {
		String actValue = gettext(getTxtSelectHotel());
		// String actValue = getAttribute(getTxtSelectHotel());

		Assert.assertEquals("verify select hotel msg", expValue, actValue);

	}

	public void hotelSelection() {
		click(getBtnRadioButton());
		click(getBtnContinue());

	}

}
