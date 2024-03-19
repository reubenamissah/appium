package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class utilities {
	
String projectlocation = System.getProperty("user.dir");
	
	public String fetchLocators(String key) throws Exception{
		String propsFileLocation = projectlocation+"/propertiesFiles/locators.properties";
		FileInputStream file = new FileInputStream(propsFileLocation);
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}
	
	public String fetchdata(String key) throws Exception{
		String propsFileLocation = projectlocation+"/propertiesFiles/data.properties";
		FileInputStream file = new FileInputStream(propsFileLocation);
		Properties reader = new Properties();
		reader.load(file);
		String value = (String)reader.getProperty(key);
		return value;
	}

}
