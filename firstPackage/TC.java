package firstPackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TC {

	public String classUnderTest();
	public String helperClasses() default "[none]";
}
