package cucum1;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Customer {
	static WebDriver driver;
	
	@Given("User should launch browser and load url.")
	public void user_should_launch_browser_and_load_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\cucum1\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
	}

	/*@When("User provides valid details.")
	public void user_provides_valid_details() {
	    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    driver.findElement(By.id("fname")).sendKeys("kamur");
	    driver.findElement(By.id("lname")).sendKeys("kamur");
	    driver.findElement(By.id("email")).sendKeys("kamur@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Chennai");
	    driver.findElement(By.id("telephoneno")).sendKeys("11111111");
	    driver.findElement(By.name("submit")).click();
	}
*/
	/*@When("User provides valid detail {string},{string},{string},{string},{string}")
	public void user_provides_valid_detail(String fname, String lname, String email, String addr, String telephoneno) {
		 driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		    driver.findElement(By.id("fname")).sendKeys(fname);
		    driver.findElement(By.id("lname")).sendKeys(lname);
		    driver.findElement(By.id("email")).sendKeys(email);
		    driver.findElement(By.name("addr")).sendKeys(addr);
		    driver.findElement(By.id("telephoneno")).sendKeys(telephoneno);
		    driver.findElement(By.name("submit")).click();
	}
	*/
	

/*@When("User provides valid detail")
public void user_provides_valid_detail(io.cucumber.datatable.DataTable dataTable) {
   List<String> l = dataTable.asList(String.class);
   driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
   driver.findElement(By.id("fname")).sendKeys(l.get(0));
   driver.findElement(By.id("lname")).sendKeys(l.get(1));
   driver.findElement(By.id("email")).sendKeys(l.get(2));
   driver.findElement(By.name("addr")).sendKeys(l.get(3));
   driver.findElement(By.id("telephoneno")).sendKeys(l.get(4));
   driver.findElement(By.name("submit")).click();
}
*/

/*@When("User provides valid details")
public void user_provides_valid_details(io.cucumber.datatable.DataTable dataTable) {
    List<List<String>> l1 = dataTable.asLists(String.class);
    driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
    driver.findElement(By.id("fname")).sendKeys(l1.get(0).get(1));
    driver.findElement(By.id("lname")).sendKeys(l1.get(1).get(1));
    driver.findElement(By.id("email")).sendKeys(l1.get(1).get(2));
    driver.findElement(By.name("addr")).sendKeys(l1.get(0).get(2));
    driver.findElement(By.id("telephoneno")).sendKeys(l1.get(1).get(3));
    driver.findElement(By.name("submit")).click();
    
}*/
	@When("User provides valid detail")
	public void user_provides_valid_detail(io.cucumber.datatable.DataTable dataTable) {
	   List<Map<String, String>> twodMaps = dataTable.asMaps(String.class,String.class);
	   driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    driver.findElement(By.id("fname")).sendKeys(twodMaps.get(0).get("fname"));
	    driver.findElement(By.id("lname")).sendKeys(twodMaps.get(1).get("lname"));
	    driver.findElement(By.id("email")).sendKeys(twodMaps.get(1).get("email"));
	    driver.findElement(By.name("addr")).sendKeys(twodMaps.get(0).get("addr"));
	    driver.findElement(By.id("telephoneno")).sendKeys(twodMaps.get(1).get("telephoneno"));
	    driver.findElement(By.name("submit")).click();
	}
	
	@Then("the Customer id should be displayed.")
	public void the_Customer_id_should_be_displayed() {
		
		Boolean submit = driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed();
		Assert.assertTrue(submit);
	}


}
