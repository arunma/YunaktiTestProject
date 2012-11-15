package testpackage.test;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import subSecPackage.HelperClass1;
import testpackage.TestClass2;
import firstPackage.MUT;
import firstPackage.TC;


@TC(classUnderTest = "testpackage.TestClass2", helperClasses = "subSecPackage.HelperClass1")
public class TestClass1Test {
    TestClass2 test;
    
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@MUT(methodUnderTest = "nothingDamnIt()")
	@Test
	public void testMethid1() {
		HelperClass1 helper1;
		test.nothingDamnIt();
		test.nothingDamnIt2();
	}

	
	
	@MUT(methodUnderTest = "nothingDamnIt()")
	@Test
	public void testMethid2() {
		test.nothingDamnIt();
	}

}
