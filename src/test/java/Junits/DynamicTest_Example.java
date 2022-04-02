package Junits;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTest_Example {
	
	
	@TestFactory
	public List<DynamicTest> Method1() {
		
		
		return Arrays.asList(
				
			DynamicTest.dynamicTest("Positive Test", ()-> assertTrue(StringFunctions.ispalindrome("madam"))),
			
			DynamicTest.dynamicTest("Nagative Test", ()-> assertFalse(StringFunctions.ispalindrome("english")))
			
			);
				
	}

}
