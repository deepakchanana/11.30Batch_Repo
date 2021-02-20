package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

// Post request------------> 
// inputs------------------>bodydata,URI
public class HTTPMethods 
{
  public Response PostRequest(String bodyData,String uriKey,Properties pr)
  {
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .body(bodyData)
	  .when()
	  .post(pr.getProperty(uriKey));
	  
	  return res;
  }
  
  public Response PutRequest(String bodyData,String uriKey,String pathParameter,Properties pr)
  {
	  String uri=pr.getProperty(uriKey)+"/"+pathParameter;
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .body(bodyData)
	  .when()
	  .put(uri);
	  
	  return res;
  }
  
  public Response GetRequest(String pathParameter,String uriKey,Properties pr)
  {
	  String uri=pr.getProperty(uriKey)+"/"+pathParameter;
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .get(uri);
	  
	  return res;
  }
	
  public Response GetAll(String uriKey,Properties pr)
  {
	  Response res=
			  given()
			  .contentType(ContentType.JSON)
			  .when()
			  .get(pr.getProperty(uriKey));
			  
			  return res; 
  }
  
  public Response deleteRequest(String pathParameter,String uriKey,Properties pr)
  {
	 String uri=pr.getProperty(uriKey)+"/"+pathParameter;
	 Response res=
	 given()
	  .contentType(ContentType.JSON)
	  .when()
	  .delete(uri);
	    
	  return res;
  }
  
  
  
	
}
