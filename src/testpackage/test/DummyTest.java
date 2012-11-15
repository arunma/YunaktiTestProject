package testpackage.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import testpackage.Dummy;
import firstPackage.MUT;
import firstPackage.TC;


@TC(classUnderTest = "testpackage.Dummy", helperClasses = "")
public class DummyTest {
Dummy dmy;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@MUT(methodUnderTest = "testDummy()")
	@Test
	public void test() {
		dmy.testDummy();
		dmy.testDummy("test1");
	}
	
	@MUT(methodUnderTest = "testDummy()")
	@Test
	public void test1() {
		dmy.testDummy();
		
	}
	
	@MUT(methodUnderTest = "testDummy(String)")
	@Test
	public void test1(int test) {
		dmy.testDummy("test1");
		
	}
	

}
