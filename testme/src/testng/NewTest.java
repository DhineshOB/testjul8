package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


import pack1.Sample;

@Test
public class NewTest {
  public void selection() {
	  System.out.println("Hello Testng");
	  Sample test = new Sample();
	  String result = test.method1();
	  Assert.assertEquals(result, "Method1");
	  
  }
}
