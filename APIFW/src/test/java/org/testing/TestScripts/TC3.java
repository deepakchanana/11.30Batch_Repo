package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseHandling;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandling;
import org.testing.utilities.ResponseParsingUsingOrgJson;

import com.jayway.restassured.response.Response;

public class TC3 
{
	public void testcase3() throws IOException
	  {
		  Properties pr=PropertiesHandling.loadProperties("../APIFW/URI.properties"); 
		  HTTPMethods http=new HTTPMethods();
		 Response res= http.GetAll("QA_URI", pr);
		 System.out.println("***********TestCase3**************");
		 System.out.println("Status code is "+res.statusCode());
		 System.out.println("Data is "+res.asString());
	    System.out.println("Response time is "+res.getTime());
	    ResponseParsingUsingOrgJson.ResponseParsing(res.asString(),"id");
	    ResponseHandling.responseStatusCode(res,200);
	  }

}
