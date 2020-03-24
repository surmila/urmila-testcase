package com.testrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/main/resources/feature/Login.feature",
tags = {"@tc01_search","@tc02_invalidsearch"," @tc03_searchbyhint","@tc04_searchbyproductid","@tc05_printtable"},
glue = {"steps"},
monochrome = true
)

public class jpet_testcases {

}
