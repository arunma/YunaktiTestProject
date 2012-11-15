package firstPackage.subFolder;

import subSecPackage.HelperClass2;
import firstPackage.TC;


@TC(classUnderTest = "firstPackage.subFolder.MainClass", helperClasses = "subSecPackage.HelperClass2")
public class TestClass2 {
HelperClass2 helper2;
	public String testString(){
		helper2=new HelperClass2();
		return "Test Class 2";
	}
}
