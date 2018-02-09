package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					monochrome = true,
					glue = {"Steps",},
					features = "src/Features/TC01.feature"
					//format = { "pretty","html: cucumber-html-reports",
	                //"html: cucumber-html-reports/cucumber.html" }
					)
public class TC01 {

}
