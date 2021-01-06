package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.driverfactory.DriverFactory;
import com.qa.pages.demoPage_POM;

import io.cucumber.java.en.*;

public class DemoStep {
	private demoPage_POM demo_pag = new demoPage_POM(DriverFactory.getDriver());

	@Given("user navigates to google.com")
	public void user_navigates_to_google_com() {
		
		DriverFactory.getDriver().get("https://google.co.uk");
	}

	@Then("enters the search values as {string}")
	public void enters_the_search_values_as(String name) {
		demo_pag.enter_Text(name);
	}

	@Then("users clicks the search button")
	public void users_clicks_the_search_button() {
		demo_pag.click_searchBtn();
	}

	@Then("search result should be displayed sucessfully")
	public void search_result_should_be_displayed_sucessfully() {
		System.out.println(
				"The Value Present in the Page Source " + DriverFactory.getDriver().getPageSource().contains("Dinesh UK"));

	}

}
