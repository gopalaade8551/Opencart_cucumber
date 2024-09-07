package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(features={".//Features/Login_feature.feature"},

     glue="StepDefinition",
     dryRun=false,
     monochrome=true,
     tags= "@Sanity or @Regression"	,
     //plugin= {"pretty","html:target/cucumber-reports/reports1.html"}
   //  plugin= {"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    		 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Test extends AbstractTestNGCucumberTests {

	//AbstractTestNGCucumberTests

}
