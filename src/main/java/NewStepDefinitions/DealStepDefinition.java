package NewStepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Datatables with Maps for parameterization of test cases

public class DealStepDefinition {
	
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
	
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable creds	){
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data =  creds.raw();
		
		// Map<String, String> data = (Map<String, String>)creds.asMaps(String.class, String.class); 
		
		//for(Map<String. String> data: creds.asMaps(String.class, String.class){
		//  driver.findElement(By.name("email")).sendKeys(data.get("username"));
		//  driver.findElement(By.name("password")).sendKeys(data.get("password"));
		// }
		
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	    
	}

	
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		Thread.sleep(1000);
	}
	
	@Then("^User is on HomePage$")
	public void user_is_on_HomePage(){
		System.out.println("Hello");
	}
	
	@Then("^User moves to new deals page$")
	public void user_moves_to_new_deals_page(){
	    
	}

	@Then("^User types deals details$")
	public void user_types_deals_details(DataTable arg1) {
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data =  arg1.raw();
		driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
		
	}
	
	@Then("^Close Browser$")
	public void close_browser() {
		driver.quit();
	}


}
