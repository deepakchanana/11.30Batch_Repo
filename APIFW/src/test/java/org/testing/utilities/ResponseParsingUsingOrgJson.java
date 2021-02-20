package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class ResponseParsingUsingOrgJson
{
 public static void ResponseParsing(String responseData,String searchKey)
 {
	JSONArray data=new JSONArray(responseData);
	int l=data.length();
	for(int i=0;i<l;i++)
	{
		JSONObject ob=data.getJSONObject(i);
		System.out.println(ob.get(searchKey));		
	}
 }
	
}
