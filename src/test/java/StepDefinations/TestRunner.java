package StepDefinations;

import org.junit.runner.RunWith;

//import CucumberOptions.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/resources/Features",
   //path of step definition file
   glue = "StepDefinations",monochrome = true
   )

public class TestRunner {

}
