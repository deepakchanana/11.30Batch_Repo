package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

// input-------json file path
// action------it will load(read) the json file
// output------the content of the json file
public class JsonLoad
{
  public static String loadJsonFile(String path) throws FileNotFoundException
  {
	File f=new File(path);
	FileInputStream fi=new FileInputStream(f);
	JSONTokener js=new JSONTokener(fi);
	JSONObject data=new JSONObject(js);
	return data.toString();
  }
}
