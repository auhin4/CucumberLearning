package stepdefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Test.feature",glue= "stepdefinitions", plugin= {"html:target/test-report"} )
public class Registration {
	
}

