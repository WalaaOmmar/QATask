package Runner;

import Utilities.BaseTest;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/resources/Features/Activities.feature"
        , glue = {"Steps"}
        , plugin = {"pretty", "html:target/cucumber.html"}
        , monochrome = true
        , publish = true
)
public class TestsRunner extends BaseTest {

}
