package steps;

import Base.BaseUtil;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by Karthik on 21/09/2019.
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
    }

    @BeforeStep
    public void BeforeStepExecution(Scenario scenario){
        System.out.println("The execution scenario step Before " + scenario.getLine());
    }

    @AfterStep
    public void AfterStepExecution(Scenario scenario){
        System.out.println("The execution scenario step After " + scenario.getLine());
    }

}
