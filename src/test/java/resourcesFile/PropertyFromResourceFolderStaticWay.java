package resourcesFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFromResourceFolderStaticWay {

	
	
	public static void main(String[] args) {
		
		
		Properties prop = new Properties();
		String browser = "";
	 
		try {
	 
		  InputStream inputStream = 
				  PropertyFromResourceFolderStaticWay.class.
				  getClassLoader().
				  getResourceAsStream("config.properties");
	 
		  prop.load(inputStream);
		  browser = prop.getProperty("browser");
		  System.out.println("property browser:.... "+ browser);
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	 
		

