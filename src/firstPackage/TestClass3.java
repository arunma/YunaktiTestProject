package firstPackage;

import org.junit.Test;

import subSecPackage.ThirdMainClass;

@TC(classUnderTest = "subSecPackage.ThirdMainClass", helperClasses = "")
public class TestClass3 {

	ThirdMainClass thirdMainclass;
	@MUT(methodUnderTest = "thirdString()")
	@Test
	public void testThirdString()
	{
		thirdMainclass=new ThirdMainClass();
		thirdMainclass.thirdString();
		
	}
}
