package firstPackage;

import java.util.Date;

import firstPackage.subFolder.MainClass;

@TC(classUnderTest = "firstPackage.subFolder.MainClass", helperClasses = "")
public class TestClass {
	
	private String name;
	private String address;
	private int number;
	MainClass main;
	
	public TestClass(){
		main=new MainClass();
	}
	
	public TestClass(String name){
		this.name = name;
	}
	
	public TestClass(int number){
		this.number = number;
	}

	@MUT(methodUnderTest = "mySecondMethod()")
	public String testString(Date tmpDate){
		
		Date current = new Date();
		
		main.mySecondMethod();
		
		//TestClass2 tmpClass2 = new TestClass2();
		
	//	String tmpString = tmpClass2.testString();
		
		printLine(new String("Just for testing"));
		
		double d = Math.PI;
		
		for(int i = 0; i < Math.PI; i ++){
			
			System.out.println("Test ====> " + i);
			while(i >= 1){
				
				switch(i){
				case 1:
					new Date();
				case 2:
					new Date();
				default:
					System.out.println("Default switch");
				}
			}
		}
		
		return "test";
	}
	
	private String printLine(String tmp){
		
		return tmp;
	}
	
	
	
}
