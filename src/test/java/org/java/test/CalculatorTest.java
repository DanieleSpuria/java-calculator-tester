package org.java.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	static Calculator calc = null;
	float r = 0;
	
	@BeforeAll
	public static void beforeAll() {
		calc = new Calculator();
	}
		
	@Test
	@DisplayName("add")
	public void addCalc() {
		try {
			r = calc.add(1_945.565f, -2_425.89653f);				
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(-480.33153f, r);
	}
	
	@Test
	@DisplayName("sub")
	public void subCalc() {
		float r = calc.subtract(-45385.78655f,96750.89668f);
		float t = 0.001f;
		assertEquals(-142136.68323f, r, t);
	}
	
	@Test
	@DisplayName("divide")
	public void divCalc() {
		try {
			r = calc.divide(5_749_490.34343f, -3_5454.373849f);		
		} catch (Exception e) {
			e.getMessage();
		}	
		assertEquals(-162.165897159f, r);
	}
	
	@Test
	@DisplayName("divide zero")
	public void divideZeroCalc() {
		assertThrows(
				Exception.class, 
				() -> calc.divide(12f, 0), 
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
		r = calc.multiply(2_236.5772f, 9_650.987f);
		assertEquals(21_585_177.4817f, r);
	}
}
