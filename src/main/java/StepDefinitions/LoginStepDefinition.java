package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ravitejaburugupalli/Downloads/chromedriver_2");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		
	}
	
	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
	    
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
		
	}
	
	//Reg Exps
	// \"(.*)\"
	// \"([^\"]*)\"
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password){
	    
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	}
	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		Thread.sleep(1000);
	}
	
	@Then("^User is on HomePage$")
	public void user_is_on_HomePage(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello");
	}
	

	@Then("^User moves to new contacts page$")
	public void user_moves_to_new_contacts_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hi There");
	    
	}
	
	@Then("^User types \"(.*)\", \"(.*)\" and \"(.*)\"$")
	public void user_types_firstname_lastname_and_position(String firstname, String lastname, String position) {
		
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(position);
		
	}

	
	@Then("^Close Browser$")
	public void close_browser() {
		driver.quit();
	}

	
}
