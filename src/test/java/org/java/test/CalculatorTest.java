package org.java.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	static Calculator calc = null;
	
	@BeforeAll
	public static void beforeAll() {
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("add")
	public void addCalc() {
		float r = calc.add(19.5f, 25.3f);	
		assertEquals(44.8f, r);
	}
	
	@Test
	@DisplayName("sub")
	public void subCalc() {
		float r = calc.subtract(85.5f,90.8f);
		float t = 0.001f;
		assertEquals(-5.3f, r, t);
	}
	
	@Test
	@DisplayName("divide")
	public void divCalc() {
		float r = 0;
		
		try {
			r = calc.divide(45f, 23.5f);		
		} catch (Exception e) {
			e.getMessage();
		}
		
		assertEquals(1.91489361702f, r);
	}
	
	@Test
	@DisplayName("divide zero")
	public void divideZeroCalc() {
		assertThrows(
				Exception.class, 
				() -> calc.divide(12, 0), 
				"Deve dare l'Exception con il divisore uguale a 0.");
	}
	
	@Test
	@DisplayName("divide not zero")
	public void divideNotZeroCalc() {
		assertDoesNotThrow(
				() -> calc.divide(50f, 4f), 
				"Il divisore deve essere diverso da 0.");
	}
	
	@Test
	@DisplayName("multiply")
	public void multCalc() {
		float r = calc.multiply(2_236.5772f, 9_650.987f);
		assertEquals(21_585_177.4817f, r);
	}
}
