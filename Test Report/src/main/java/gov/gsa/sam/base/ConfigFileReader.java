package gov.gsa.sam.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigFileReader {
	private String envConfigFilePath = "src/test/resources/config/";
	
	private Properties properties;
	
	public ConfigFileReader(){
		String envConfigFileFullName;
		try{
			String envConfigFileName = System.getProperty("gsaConfig");
			if(envConfigFileName == null || envConfigFileName.trim().length() == 0){
				envConfigFileName = "gsa-qa.properties";
			}
			
			envConfigFileFullName = envConfigFilePath + envConfigFileName;
			
			File configFile = new File(envConfigFileFullName);
			properties = new Properties();
			properties.load(new FileInputStream(configFile));
		} catch(Exception e){
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public String getApplicationURL(){
		return properties.getProperty("app.url");
	}
	
	public String getBrowser(){
		return properties.getProperty("browser");
	}
	
	public boolean isWindowMaximize(){
		String windowMaximize = properties.getProperty("windowMaximize");
		System.out.println("windowMaximize:::"+windowMaximize);
		if(windowMaximize != null && (windowMaximize.equalsIgnoreCase("true") || windowMaximize.equalsIgnoreCase("false"))){
			return Boolean.valueOf(windowMaximize);
		}
		
		return false;
	}
	
	public int getImplicitlyWait(){
		return Integer.valueOf(properties.getProperty("implicitlyWait"));
	}
	
	public String getPropertyValue(String propertyName){
		return properties.getProperty(propertyName);
	}
	


}
