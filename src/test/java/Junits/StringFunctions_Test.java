package Junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StringFunctions_Test {

	@Tag("Sanity")
	@DisplayName("Postive Test")
	@Test
	public void test1() {
		assertTrue(StringFunctions.ispalindrome("madam"));
		assertTrue(StringFunctions.ispalindrome("malayalam"));
	}

	@CustomAnnotationExample
	public void test2() {
		assertFalse(StringFunctions.ispalindrome("english"));
	}

}
