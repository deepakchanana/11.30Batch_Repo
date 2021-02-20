package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseHandling;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandling;

import com.jayway.restassured.response.Response;

// Get Request
public class TC2 
{
  public void testcase2() throws IOException
  {
	  Properties pr=PropertiesHandling.loadProperties("../APIFW/URI.properties");
	  String idValue=TC1.responseIdValue; 
	  HTTPMethods http=new HTTPMethods();
	 Response res= http.GetRequest(idValue,"QA_URI", pr);
	 System.out.println("***********TestCase2**************");
	 System.out.println("Status code is "+res.statusCode());
	 System.out.println("Data is "+res.asString());
    System.out.println("Response time is "+res.getTime());
    ResponseHandling.responseStatusCode(res,200);
    ResponseHandling.responseDataValidate("dc", res,"firstname");
  }
	
}
