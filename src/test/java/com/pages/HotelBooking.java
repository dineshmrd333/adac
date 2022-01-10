package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class HotelBooking extends LibGlobal {
	
	public  HotelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="first_name")
	private WebElement txtFirstName;
	
	@FindBy (id="last_name")
	private WebElement txtlastName;
	
	@FindBy (id="address")
	private WebElement txtAddress;
	
	@FindBy (id="cc_num")
	private WebElement txtCcNo;
	
	@FindBy (id="cc_type")
	private WebElement dDnCcType;
	
	@FindBy (id="cc_exp_month")
	private WebElement dDnExpMonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement dDnExpYear;
	
	@FindBy (id="cc_cvv")
	private WebElement txtCvvNo;
	
	@FindBy (id="book_now")
	private WebElement btnBookNow;
	
	
	
	@FindBy (xpath="(//td[@class='login_title'])[2]")
	private WebElement txtBookaHotel;
	
	public WebElement getTxtBookaHotel() {
		return txtBookaHotel;
	}


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtlastName() {
		return txtlastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNo() {
		return txtCcNo;
	}

	public WebElement getdDnCcType() {
		return dDnCcType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public void verifyBookaHotel(String expValue) {
		//String actValue = getAttribute(getTxtBookaHotel());
		
		String actValue = gettext(getTxtBookaHotel());
		
		Assert.assertEquals("verify book a hotel msg", expValue,actValue);
		
		
	}
	
	public void bookingPage(String firstname,String lastName,String address,String cardnum,String cardtype,String expmonth,String expyear,String cvv) {
		type(getTxtFirstName(), firstname);
		type(getTxtlastName(), lastName);
		type(getTxtAddress(), address);
		type(getTxtCcNo(), cardnum);
		selectOptionByText(getdDnCcType(), cardtype);
		selectOptionByText(getdDnExpMonth(), expmonth);
		selectOptionByText(getdDnExpYear(), expyear);
		type(getTxtCvvNo(), cvv);
		click(getBtnBookNow());
		
		
		
		
		
		
	
		

	}
	

}
