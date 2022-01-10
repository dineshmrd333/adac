package com.stepdefinition;

import com.baseclass.LibGlobal;
import com.pages.CancelPage;
import com.pages.HotelBooking;
import com.pages.LoginPage;
import com.pages.SearchHotel;
import com.pages.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal {

	@Given("User is on the adactin page")
	public void userIsOnTheAdactinPage() {
		getDriver();
		maximize();
		loadUrl("https://adactinhotelapp.com/");

	}

	@When("User should login {string},{string}")
	public void userShouldLogin(String userName, String password) {

		LoginPage log = new LoginPage();
		log.login(userName, password);

	}

	@When("User should enter Search Hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldEnterSearchHotel(String Location, String Hotels, String RoomType, String NumberofRooms,
			String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {

		SearchHotel search = new SearchHotel();

		search.searchHotels(Location, Hotels, RoomType, NumberofRooms, CheckInDate, CheckOutDate, AdultsperRoom,
				ChildrenperRoom);


	}

	@When("User should enter Select Hotel click radiobutton,Continue button")
	public void userShouldEnterSelectHotelClickRadiobuttonContinueButton() {

		SelectHotel selectH = new SelectHotel();
		selectH.hotelSelection();

	}

	@When("User should enter Book A Hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldEnterBookAHotel(String FirstName, String LastName, String BillingAddress, String CreditCardNo,
			String CreditCardType, String SelectMonth, String SelectYear, String Cvv) {

		HotelBooking booking = new HotelBooking();

		booking.bookingPage(FirstName, LastName, BillingAddress, CreditCardNo, CreditCardType, SelectMonth, SelectYear,
				Cvv);

	}

	@Then("User should click Book Now")
	public void userShouldClickBookNow() {

	}
	
	@Then("user should cancel booking")
	public void userShouldCancelBooking() {
	   
		CancelPage cancel= new CancelPage();
		
		cancel.cancel();
		
		
	}

}
