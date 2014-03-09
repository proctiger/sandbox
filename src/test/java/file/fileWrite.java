package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {
	   public static void createLocalFile(String xml) throws IOException{
		   try{
			   File file = new File("/tmp/wmonaco.xml");
			   // Create file 
			   FileWriter fstream = new FileWriter(file.toString());
			   BufferedWriter out = new BufferedWriter(fstream);
			   out.write(xml);
			   //Close the output stream
			   out.close();
	   		}catch (Exception e){//Catch exception if any
	   			System.err.println("Error: " + e.getMessage());
		   }
	   }
}
