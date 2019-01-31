package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Created by Karthik on 31/01/2019.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"} , format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests{

}
