package org.testing.utilities;

import com.jayway.restassured.response.Response;

// this method will return the corresponding value to
// that node which it will take as a input

public class ResponseParsingUsingJsonPath 
{
  public static String responseParsing(Response res,String jsonPath)
  {
	  return res.jsonPath().get(jsonPath);
  }
}
