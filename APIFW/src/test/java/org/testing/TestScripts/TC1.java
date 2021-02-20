package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseHandling;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonLoad;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;
import org.testing.utilities.ResponseParsingUsingJsonPath;

import com.jayway.restassured.response.Response;

// TC1----------hit the post request
// before hitting the post request
// what is prerequisite 
// body data
// uri ----------
// uri will be fetched from the properties file

public class TC1 
{
	static String responseIdValue;
  public void testcase1() throws IOException
  {
Random r=new Random();
Integer idData=r.nextInt();  

	  
 Properties pr=PropertiesHandling.loadProperties("../APIFW/URI.properties");
 String bodyData=JsonLoad.loadJsonFile("../APIFW/src/test/java/org/testing/Payloads/bodyData.json");
 bodyData=JsonReplacement.assignValuetoVariable(bodyData,"id",idData.toString());
 
 System.out.println("changes done");
 
 HTTPMethods http=new HTTPMethods();
 Response res=http.PostRequest(bodyData,"QA_URI", pr);
 System.out.println("*******TestCase1***********");
 System.out.println("status code is "+res.statusCode());
 System.out.println("Response time is "+res.getTime());
 responseIdValue=ResponseParsingUsingJsonPath.responseParsing(res,"id");
 ResponseHandling.responseStatusCode(res,201);
 
 
 
 
 
  }
}
