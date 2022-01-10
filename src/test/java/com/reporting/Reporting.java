package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting {
	public void generateJvmReport(String jsonFile) {
		File reportDirectory= new File("C:\\Users\\Dinesh\\eclipse-workspace\\CucumDay3\\src\\test\\resources\\report");
		
		Configuration configuration = new Configuration(reportDirectory, "adactin automation");
		
		configuration.addClassifications("os", "windows 10");
		configuration.addClassifications("browser", "chrome ");
		configuration.addClassifications("version", " 96");
		
	List<String>jsonFiles= new ArrayList <String>();
	jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();

	}

}