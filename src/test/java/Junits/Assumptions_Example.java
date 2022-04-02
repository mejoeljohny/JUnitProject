package Junits;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Assumptions_Example {
	
	
	@BeforeAll
	public static void Setup()
	{
	System.setProperty("ENV", "PROD");	
		
	}

	@Test
	public void test1() {

		assumeTrue("DEV".equals(System.getProperty("ENV")));
		assertTrue(StringFunctions.ispalindrome("madam"));
		assertTrue(StringFunctions.ispalindrome("malayalam"));

	}

	
}
