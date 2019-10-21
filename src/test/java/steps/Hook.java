package steps;

import Base.BaseUtil;


import cucumber.api.PickleStepTestStep;
import cucumber.api.TestCase;
import gherkin.pickles.PickleStep;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


/**
 * Created by Karthik on 31/01/2019.
 */

public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {


        scenarioDef = base.features.createNode(scenario.getName());

        System.out.println("Opening the browser : Firefox");

        /*System.setProperty("webdriver.firefox.marionette", "D:\\Libs\\geckodriver.exe");
        base.Driver = new FirefoxDriver();*/


        //Chrome driver
//        System.setProperty("webdriver.chrome.driver", "/Users/karthikkk/ChromeDriver/chromedriver");
//        base.Driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "/Users/karthikkk/ChromeDriver/chromedriver");
        base.Driver = new ChromeDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
        base.Driver.quit();
    }

    @BeforeStep
    public void BeforeEveryStep(Scenario scenario) {
        System.out.println("Before every step " + scenario.getId());

        //((PickleStep)((PickleStepTestStep)
    }

    @AfterStep
    public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
        //System.out.println("Before every step " + stepTestStep.getId());
    }

}
