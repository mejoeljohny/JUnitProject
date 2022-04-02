package Junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Calculator_Test {
	@Test
	public void addtest1() {
		assertEquals(9, Calculator.Addition(4, 5));
		System.out.println("Addition Successful");
	}

	@Test
	public void subtest1() {
		assertEquals(95, Calculator.Substraction(100, 5));
		System.out.println("Substraction Successful");
	}

	@Test
	public void multest1() {
		assertEquals(25, Calculator.Multiplication(5, 5));
		System.out.println("Multiplication Successful");
	}

	@Test
	public void divtest1() {
		assertEquals(1, Calculator.Division(5, 5));
		System.out.println("Division Successful");
	}
}
