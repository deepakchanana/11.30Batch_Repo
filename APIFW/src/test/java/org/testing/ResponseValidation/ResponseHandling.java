package org.testing.ResponseValidation;

import org.testing.utilities.ResponseParsingUsingJsonPath;
import org.testng.Assert;

import com.jayway.restassured.response.Response;

// validate the status code
// validate the data
public class ResponseHandling 
{
	public static void responseStatusCode(Response res,int expectedStatusCode)
	{
		int actualStatusCode=res.statusCode();
	    Assert.assertEquals(actualStatusCode, expectedStatusCode,"Status Code is not matching so failed....");
	}
	
	public static void responseDataValidate(String expectedData,Response res,String jsonPath)
	{
		String actualData=ResponseParsingUsingJsonPath.responseParsing(res, jsonPath);
		Assert.assertEquals(actualData, expectedData);
		
	}

}
