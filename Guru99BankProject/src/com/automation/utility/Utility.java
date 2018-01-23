package com.automation.utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;

public class Utility {
public static String fetchpropertyvalue(String key)throws  IOException {
	FileInputStream file= new FileInputStream("./Config/config.properties");
	Properties property =new Properties();
	property.load(file);
	return property.get(key).toString();
}
}
