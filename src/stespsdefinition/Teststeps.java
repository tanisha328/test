package stespsdefinition;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Teststeps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C://driver9999//chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		 driver.findElement(By.linkText("SignIn")).click();
	}

//	@When("^User enters Credentials to LogIn$")
//	public void user_enters_Credentials_to_LogIn(DataTable arg1) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//	    
//	}
	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {

		//Write the code to handle Data Table
		for (Credentials credentials : usercredentials) {
			driver.findElement(By.name("userName")).clear();
		    driver.findElement(By.name("userName")).sendKeys(credentials.getUsername());
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys(credentials.getPassword());
		   // driver.findElement(By.name("Login")).click();
		   // driver.findElement(By.linkText("SignOut")).click();
			}		
	}
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

}