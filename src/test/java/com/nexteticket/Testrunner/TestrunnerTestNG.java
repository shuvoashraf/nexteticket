package com.nexteticket.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {


	@CucumberOptions (
			
			features = {"Features"},
			glue = {"com.nexteticket.Stepdef"}
			//tags= {"@samsungaction","@bestseller"}
			)

public class TestRunner extends AbstractTestNGCucumberTests{}
}
