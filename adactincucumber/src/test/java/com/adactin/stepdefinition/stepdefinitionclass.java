package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runnerclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitionclass {
	
	public static WebDriver driver = Runnerclass.driver;
	@Given("^user Launch the Url in Adactin Web Appliction$")
	public void user_Launch_the_Url_in_Adactin_Web_Appliction() throws Throwable {
		driver.get("https://adactinhotelapp.com/index.php");
	    
	}

	@When("^user Enter the Username in Username Field$")
	public void user_Enter_the_Username_in_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("JayaSenthil");
	}

	@When("^user Enter the Password in Password Field$")
	public void user_Enter_the_Password_in_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("863KYO");
	}

	@Then("^user click the Login Button And It Navigate To Search Hotel Page$")
	public void user_click_the_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("^user Select the Hotel Location in Location dropdown$")
	public void user_Select_the_Hotel_Location_in_Location_dropdown() throws Throwable {
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByValue("New York");
	}

	@When("^User Select the Hotel  in hotel dropdown$")
	public void user_Select_the_Hotel_in_hotel_dropdown() throws Throwable {
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByVisibleText("Hotel Sunshine");
		
	}

	@When("^User Select the Roomtype in Room-Type dropdown$")
	public void user_Select_the_Roomtype_in_Room_Type_dropdown() throws Throwable {
		WebElement roomtype = driver.findElement(By.name("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByValue("Super Deluxe");
	}

	@When("^User Select Number Of Rooms  in Number Of Rooms dropdown$")
	public void user_Select_Number_Of_Rooms_in_Number_Of_Rooms_dropdown() throws Throwable {
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		Select s3=new Select(room_nos);
		s3.selectByValue("3");
	}

	@When("^user Select the Check in date in the calendar field$")
	public void user_Select_the_Check_in_date_in_the_calendar_field() throws Throwable {
		WebElement check_in = driver.findElement(By.id("datepick_in"));
		check_in.sendKeys("15/11/2023");
	}

	@When("^User select the check out date in the calendar field$")
	public void user_select_the_check_out_date_in_the_calendar_field() throws Throwable {
		WebElement check_out = driver.findElement(By.id("datepick_out"));
		check_out.sendKeys("17/11/2023");
	}

	@When("^user Select the Adultsperroom in the dropdown$")
	public void user_Select_the_Adultsperroom_in_the_dropdown() throws Throwable {
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adults);
		s4.selectByValue("2");
	}

	@When("^user Select the ChildrenPerroom in the dropdown$")
	public void user_Select_the_ChildrenPerroom_in_the_dropdown() throws Throwable {
		WebElement children = driver.findElement(By.id("child_room"));
		Select s5=new Select(children);
		s5.selectByValue("2");
	}

	@Then("^user Click the Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_the_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
	}

	@When("^user Click the Hotel in Hotel name Radio Button$")
	public void user_Click_the_Hotel_in_Hotel_name_Radio_Button() throws Throwable {
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
	}

	@Then("^user Click the Contine Button And It Navigate to Book A Hotel Page$")
	public void user_Click_the_Contine_Button_And_It_Navigate_to_Book_A_Hotel_Page() throws Throwable {
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
	}

	@When("^user Enter the Firstname in the Firstname Field$")
	public void user_Enter_the_Firstname_in_the_Firstname_Field() throws Throwable {

		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Jaya");
	}

	@When("^user Enter the Lastname in the Lastname Field$")
	public void user_Enter_the_Lastname_in_the_Lastname_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Senthil");
		
	}

	@When("^user Enter the Address in the Address Field$")
	public void user_Enter_the_Address_in_the_Address_Field() throws Throwable {
		WebElement addr = driver.findElement(By.id("address"));
		addr.sendKeys("chennai");
	}

	@When("^user Enter the Credit card Number in Credit card Number Field$")
	public void user_Enter_the_Credit_card_Number_in_Credit_card_Number_Field() throws Throwable {
		WebElement card_num = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		card_num.sendKeys("1111111111111111");
	}

	@When("^user Select the Credit Card Type in Credit Card Type Dropdown$")
	public void user_Select_the_Credit_Card_Type_in_Credit_Card_Type_Dropdown() throws Throwable {
		WebElement card_type= driver.findElement(By.xpath("//option[text()='VISA']"));
		card_type.click();
		
	}

	@When("^user Select the Expiry Month and Year in the Expiry Month and Year Dropdown$")
	public void user_Select_the_Expiry_Month_and_Year_in_the_Expiry_Month_and_Year_Dropdown() throws Throwable {
		WebElement expiry_month= driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s6=new Select(expiry_month);
		s6.selectByValue("2");
	}

	@When("^user Enter the CVV Number in CVV number Field$")
	public void user_Enter_the_CVV_Number_in_CVV_number_Field() throws Throwable {
		WebElement expiry_year= driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s7=new Select(expiry_year);
		s7.selectByValue("2024");
	}

	@Then("^user Click Book Now Button And It Navigate to Booking Confirmation Page$")
	public void user_Click_Book_Now_Button_And_It_Navigate_to_Booking_Confirmation_Page() throws Throwable {
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();
	}

	@Then("^user Click the Logout Button And It Navigate to Logout Page$")
	public void user_Click_the_Logout_Button_And_It_Navigate_to_Logout_Page() throws Throwable {
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
	}


	
	

}
