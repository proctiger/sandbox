package resourcesFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFromResourceFolderNonStaticWay {

	public String readConfigFileFromResource() {
		Properties prop = new Properties();
		String property = "";
		try {
	 
		  InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
		  prop.load(inputStream);
		  property = prop.getProperty("browser");
	 
        } catch (IOException e) {
			e.printStackTrace();
		}
		return property;
	 
	}
}
	
	
	
	

