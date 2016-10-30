package onoue.yoshihisa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * A Class to provide access to a configuration file.
 * For each configuration file, define subclass extending this class.
 * @author yoshihisaonoue
 *
 */
public abstract class AbstractConfigurationFile {
	private final Properties prop;
	
	protected AbstractConfigurationFile() {
		prop = new Properties();
		try {
			// Specify the path to a file by relative path from the project directory
			FileInputStream fileInputStream = new FileInputStream(getPath());
			
			// Specify the path to a file by relative path from the project directory
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, getEncoding());

			// Store the key value pair in the file
			prop.load(inputStreamReader);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Return the path to the configuration file to read.
	 * @return the path to a configuration file.
	 */
	protected abstract String getPath();
	
	/**
	 * Return the encoding of the configuration file to read.
	 * @return the encoding of the configuration file
	 */
	protected abstract String getEncoding();
	

	/**
	 * Return the value of the specified key.
	 * @param key
	 * @return a String value
	 */
	public String getString(String key) {
		return prop.getProperty(key);
	}
	
	//FIXME Define the method which returns the value after converting preferred data type.
	// such as public int getInteger(String key)....
}
