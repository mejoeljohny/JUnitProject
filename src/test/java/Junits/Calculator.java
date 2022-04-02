package Junits;

import org.junit.jupiter.api.Tag;

public class Calculator {
	
	@Tag("Sanity")
	public static int Addition(int a, int b) {
		return a + b;

	}

	@Tag("Sanity")
	public static int Substraction(int a, int b) {
		return a - b;

	}

	@Tag("Sanity")
	public static int Multiplication(int a, int b) {
		return a * b;

	}
	
	@Tag("Sanity")
	public static int Division(int a, int b) {
		return a / b;

	}
}
