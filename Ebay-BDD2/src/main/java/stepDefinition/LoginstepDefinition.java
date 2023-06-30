package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import org.junit.Assert;

public class LoginstepDefinition {
	

	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
	  	}

	@When("^title of loginpage is ebay$")
	public void title_of_loginpage_is_ebay() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Electronics, Cars, Fashion, Collectibles & More | eBay", title);
	
	}
	

	@Then("^search button is present$")
	public void search_button_is_present() {
	
	  List<WebElement> searchbutton= driver.findElements(By.xpath("//input[@id='gh-btn']"));
		System.out.println(searchbutton.size());
		
		if(searchbutton.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element Not Present");
		}
	 
	}

	@Then("^user enters abc in searchwindow$")
	public void user_enters_abc_in_searchwindow() {
	   WebElement searchwindow=driver.findElement(By.xpath("//input[@id='gh-ac']"));
	   searchwindow.sendKeys("abc");
	   	}

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() {
		  WebElement  searchbutton= driver.findElement(By.xpath("//input[@id='gh-btn']"));
		  searchbutton.click();

	}
	@Then("^user close browser$")
	public void user_close_broweser() {
		driver.close();
	}
}
