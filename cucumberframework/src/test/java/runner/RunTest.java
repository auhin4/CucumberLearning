package runner;

import org.testng.annotations.Test;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;


//Uncomment @RunWith if you are using Junit to run test
//@RunWith(Cucumber.class)

@SuppressWarnings("deprecation")
@CucumberOptions(features= {"src//test//java//features"}
					,glue= {"stepdefinitions", "utility"}
					,plugin= {"pretty", "html:target/cucumber"}
					,tags= "@web"
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{
	
}