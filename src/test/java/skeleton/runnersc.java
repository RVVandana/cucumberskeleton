package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\skeleton\\sc1.feature",
plugin = {"json:target/cucumberreport.json"})
public class runnersc {

}
