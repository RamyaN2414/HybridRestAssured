package api.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="D:\\Java\\Hybrid_RestAssured\\Hybrid_Features\\FeaturesFile.feature",
		         glue="api.StepDefination",
		         dryRun=false,
		         monochrome=true,
		         plugin= {"pretty","html:testOutput"}
		
		        )
public class TestRunner {

}
