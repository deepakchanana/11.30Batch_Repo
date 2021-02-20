package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// what will be the input for this method ?
// the path of the properties file
// input---------Properties path
// activity-----it will load the properties file
// output-------it will return the object of Properties
public class PropertiesHandling 
{
 public static Properties loadProperties(String path) throws IOException
 {
	File f=new File(path);   // establish a connection
	FileInputStream fi=new FileInputStream(f);
	Properties pr=new Properties();
	pr.load(fi);   
	return pr;  // it will return the properties object
 }
}
