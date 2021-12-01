package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void Initial()
	{
		//Do all stuff before hook is invoked
		System.out.print("Before hook is invoked.");
	}
	
	@After
	public void Refresh()
	{
		//After hook is invoked
		System.out.print("After hook is invoked");
	}
	
}
