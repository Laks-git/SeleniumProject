package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/Sai Kumar/IdeaProjects/SeleniumProject/src/main/resources/features/OrangeHRMHome.feature", //the path of the feature files
        glue={"steps"}, //the path of the step definition files
       // format= {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        plugin = {"json:target/reports/Runner.json"},
        //monochrome = true, //display the console output in a proper readable format
       // strict = true, //it will check if any step is not defined in step definition file
        //dryRun = false, //to check the mapping is proper between feature file and step def file
        tags = "@SmokeTest or @RegressionTest"
)
public class Runner {



}
