package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;


public class CancelPage extends LibGlobal {
	
	public CancelPage() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnItinerary;
	
	
	@FindBy(xpath="(//input[@type='button'])[1]")
	private WebElement btnCancel;
	
	


	public WebElement getBtnItinerary() {
		return btnItinerary;
	}


	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void cancel() {
		
		click(getBtnItinerary());
		click(getBtnCancel());
		alert();
	}

}
	