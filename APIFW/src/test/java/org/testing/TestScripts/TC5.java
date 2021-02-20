package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseHandling;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandling;

import com.jayway.restassured.response.Response;

public class TC5 {
	
	public void testcase5() throws IOException
	{
    Properties pr=PropertiesHandling.loadProperties("../APIFW/URI.properties");
    HTTPMethods http=new HTTPMethods();
	Response res= http.deleteRequest(TC1.responseIdValue,"QA_URI", pr);
	System.out.println("**********testcase5*************");
	System.out.println(res.statusCode());
	ResponseHandling.responseStatusCode(res,200);
	}

}
