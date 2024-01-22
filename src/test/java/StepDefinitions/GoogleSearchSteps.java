package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
	    System.out.println("Inside Step - browser is open");
	    System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.navigate().to("https://tienda.caffenio.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='StickyNavSearchCart']/form/button"));
		driver.close();
		driver.quit();*/
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("Inside Step - user is on google search page");
		driver.navigate().to("https://tienda.caffenio.com/");
		Thread.sleep(5000);
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		//System.out.println("Inside Step - user enters a text in search box");
		//driver.findElement(By.xpath("//*[@id='StickyNavSearchCart']/form/button")).click();
		driver.findElement(By.xpath("//*[@id='SiteNavLabel-para-beber']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step - hits enter");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - user is navigated to search results");
	}

}
