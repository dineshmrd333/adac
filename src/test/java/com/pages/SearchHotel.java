package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class SearchHotel extends LibGlobal {
	
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id="location")
	private WebElement dDnLocation;
	
	@FindBy (name="hotels")
	private WebElement dDnHotels;
	
	@FindBy (id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy (id="room_nos")
	private WebElement dDnNoOfRoom;
	
	@FindBy (id="datepick_in")
	private WebElement txtChechInDate;
	
	@FindBy (id="datepick_out")
	private WebElement txtChechOutDate;
	
	@FindBy (id="adult_room")
	private WebElement dDnAdultPerRoom;
	
	@FindBy (id="child_room")
	private WebElement dDnChildernPerRoom;
	
	@FindBy (id="Submit")
	private WebElement btnSearch;
	
	@FindBy (id="username_show")
	private WebElement txtWelcome;
	

	public WebElement getTxtWelcome() {
		return txtWelcome;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public void setdDnLocation(WebElement dDnLocation) {
		this.dDnLocation = dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public void setdDnHotels(WebElement dDnHotels) {
		this.dDnHotels = dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public void setdDnRoomType(WebElement dDnRoomType) {
		this.dDnRoomType = dDnRoomType;
	}

	public WebElement getdDnNoOfRoom() {
		return dDnNoOfRoom;
	}

	public void setdDnNoOfRoom(WebElement dDnNoOfRoom) {
		this.dDnNoOfRoom = dDnNoOfRoom;
	}

	public WebElement getTxtChechInDate() {
		return txtChechInDate;
	}

	public void setTxtChechInDate(WebElement txtChechInDate) {
		this.txtChechInDate = txtChechInDate;
	}

	public WebElement getTxtChechOutDate() {
		return txtChechOutDate;
	}

	public void setTxtChechOutDate(WebElement txtChechOutDate) {
		this.txtChechOutDate = txtChechOutDate;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public void setdDnAdultPerRoom(WebElement dDnAdultPerRoom) {
		this.dDnAdultPerRoom = dDnAdultPerRoom;
	}

	public WebElement getdDnChildernPerRoom() {
		return dDnChildernPerRoom;
	}

	public void setdDnChildernPerRoom(WebElement dDnChildernPerRoom) {
		this.dDnChildernPerRoom = dDnChildernPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

	
public void verifyWelcomeText(String expValue) {
	String actValue = getAttribute(getTxtWelcome());
	Assert.assertEquals("verify welcome msg",expValue,actValue);
	
	}


	public void searchHotels(String location,String hotels,String roomType,String noOfRoom,String checkInDate,String checkOutDate,String adultPerRoom,String childrenPerRoom ) {
		
		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnHotels(), hotels);
		selectOptionByText(getdDnRoomType(), roomType);
		selectOptionByValue(getdDnNoOfRoom(), noOfRoom);
		type(getTxtChechInDate(), checkInDate);
		type(getTxtChechOutDate(), checkOutDate);
		selectOptionByText(getdDnAdultPerRoom(), adultPerRoom);
		selectOptionByText(getdDnChildernPerRoom(), childrenPerRoom);
		click(getBtnSearch());
		
		
		
		
		

	}
	


}
