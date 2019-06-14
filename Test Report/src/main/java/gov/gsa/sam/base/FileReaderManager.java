package gov.gsa.sam.base;

public class FileReaderManager {

	 private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static ConfigFileReader configFileReader;
	 
	 public static FileReaderManager getInstance() {
		 return fileReaderManager;
	 }
	 
	 public ConfigFileReader getConfigFileReader(){
		 if(configFileReader == null){
			 configFileReader = new ConfigFileReader();
		 }
		 
		 return configFileReader;
		 
	 }
}
