package cucum1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Selenium\\cucum1\\src\\test\\resources\\Feature\\twodMap.feature", 
		glue="cucum1",plugin="html:target")
public class Testrunner {

}
