package org.testing.runner;

import java.io.IOException;

import org.testing.TestScripts.TC1;
import org.testing.TestScripts.TC2;
import org.testing.TestScripts.TC3;
import org.testing.TestScripts.TC4;
import org.testing.TestScripts.TC5;

public class Runner
{
 public static void main(String[] args) throws IOException
 {
   TC1 tc1=new TC1();
   tc1.testcase1();
   
   TC2 tc2=new TC2();
   tc2.testcase2();
   
   TC3 tc3=new TC3();
   tc3.testcase3();
   
   TC4 tc4=new TC4();
   tc4.testcase4();
   
   TC5 tc5=new TC5();
   tc5.testcase5();
 }
}
