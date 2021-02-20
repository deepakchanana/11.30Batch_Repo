package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseHandling;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonLoad;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;

import com.jayway.restassured.response.Response;

public class TC4 
{
 public void testcase4() throws IOException
 {
	 Properties pr=PropertiesHandling.loadProperties("../APIFW/URI.properties");
	 String bodyData=JsonLoad.loadJsonFile("../APIFW/src/test/java/org/testing/Payloads/bodyDataforUpdate.json");
	 bodyData=JsonReplacement.assignValuetoVariable(bodyData,"id",TC1.responseIdValue);
	 bodyData=JsonReplacement.assignValuetoVariable(bodyData,"firstname","UpdatedFirstname"); 	 
     HTTPMethods http=new HTTPMethods();
   Response res= http.PutRequest(bodyData,"QA_URI",TC1.responseIdValue, pr);
   System.out.println("******TestCase4 Response**********");
   System.out.println(res.statusCode());
   System.out.println(res.asString());
   ResponseHandling.responseStatusCode(res,200);
   ResponseHandling.responseDataValidate("UpdatedFirst", res,"firstname");
 }
}
