package org.testing.utilities;

import java.util.regex.Pattern;


public class JsonReplacement
{
  public static String assignValuetoVariable(String bodyData,String var,String varValue)
  {
	bodyData=bodyData.replaceAll(Pattern.quote("{{"+var+"}}"),varValue);
	return bodyData;
  }
}
