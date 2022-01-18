package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use- to provide the path of all the feature files
        features = "src/test/resources/features/Login.feature",

        //glue is where we find implementations for gherkin steps
        //we provide the path of package where we define al the steps
        glue = "Steps",

        //if we set it to true, it will quickly scan all Gherkin steps whether they are implemented or not
        //if it is set to true, it stops actual execution
        //if it is set to false, it will execute all test cases
        dryRun = false, //change from false to true based on needs
        //it means that console output for cucumber test us having some irrelevant information
        //when we set it to true, it simply removes all the irrelevant information from the console

        monochrome = false, //-leave it //it removes unreadable character and cleans the console

        //tags will identify the scenario based on the tag we provide to the feature file
        tags ="@regression", //put any tag here to call it //and or

        plugin = {"pretty","html:target/cucumber.html"}  //reload disk from the project after this
        //rightclick on html -open in browser and generate the outcome to share

)


public class Regression {

}
