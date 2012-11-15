package subSecPackage;

import org.junit.Before;
import org.junit.Test;

import firstPackage.MUT;
import firstPackage.TC;
import firstPackage.subFolder.MainClass;

@TC(classUnderTest = "firstPackage.subFolder.MainClass", helperClasses = "subSecPackage.HelperClass1")
public class TestSecond {
	MainClass mainClass;
	HelperClass1 helperClass1;
	@Before
	public void initSetup()
	{
		mainClass=new MainClass();
	}
	
	
	
	
	@MUT(methodUnderTest = "myFirstMethod()")
	@Test
	public void testOne()
	{
		mainClass.myFirstMethod();
		
		helperClass1.getAllValues();
		helperClass1.getAllValues();
	}
	
	
	@MUT(methodUnderTest = "myFirstMethod()")
	@Test
	public void testTwo()
	{
		mainClass.myFirstMethod();
		
		helperClass1.getAllValues();
		helperClass1.getAllValues();
	}
}
