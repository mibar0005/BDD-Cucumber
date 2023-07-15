package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//feature, stepDefinition they need to be brought in
//Use the @CucumberOptions bean
//Use the features option to point to the features file (from src). You can also specify the file name
//if you want to specify a specific file, then add the file name. If you are working with the entire
//folder, then just pass the file
//Glue is a parameter you pass the stepDefinitions package (from features)
//If you want a report included, you should add the filed stepNotification = true
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        stepNotifications = true
)

public class TestRunner {

}


//Unit Test Runner / TestNG Test Runner / Java


