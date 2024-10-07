package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/Login.feature",
        glue = "Definations"
)
public class TestRunner1 extends AbstractTestNGCucumberTests
{

}