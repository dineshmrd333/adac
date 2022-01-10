package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},features= {"src\\test\\resources\\Feature"}, glue = {"com.stepdefinition"},monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)


public class TestRunnerClass {
	
	public static  void afterClass() {
		

	}
	

}
