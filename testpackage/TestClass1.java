package testpackage;

import subSecPackage.HelperClass1;
import firstPackage.TC;

@TC(classUnderTest = "testpackage.TestClass2", helperClasses = "subSecPackage.HelperClass1")
public class TestClass1 {
HelperClass1 helper1;
	
	public String methid1(int a, int b)
	{
		return "I am stupid";
		
	}
	public int methid2()
	{
		return 10;
		
	}
}
