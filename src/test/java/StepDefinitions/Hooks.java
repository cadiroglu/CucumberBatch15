package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {
    @Before
    public void preCondition(){
        openBrowserAndLaunchApplication();

    }

    //Scenario class holds the complete information of you tests execution in Cucumber framework
    @After
    public void postConditions(Scenario scenario) {

        byte[] pic;
        if(scenario.isFailed())
        {
            pic= takeScreenShot("failed/" + scenario.getName());
        }
        //else {
           //pic= takeScreenShot("passed/" + scenario.getName());
      //  }

        // attach the screenshot in my report
        //scenario.attach(pic, "image/png", scenario.getName());

        closeBrowser();

    }
}

