package appHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {

	@Before
	public void before_new(){
		System.out.println("Befor executed");
	}
	
	@After
	public void before_last(){
		System.out.println("After execution");
	}
	
}
