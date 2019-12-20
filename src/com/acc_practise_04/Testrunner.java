package com.acc_practise_04;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature70"
		,glue={"stepsdefinition"}
		)

public class Testrunner {

}