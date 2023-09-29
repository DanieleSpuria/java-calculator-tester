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
	@DisplayName("value null")
	public void valueNull() {
		assertThrows(
				Exception.class, 
				() -> calc.inputNull(Float.NaN, 456.8f), 
				"L'Exception gestisce i campi lasciati vuoti.");
	}
		
	@Test
	@DisplayName("add")
	public void add() {
		try {
			r = calc.add(4656350.6544f, 262665.567765f);				
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(4919016.22216f, r);
	}
	
	@Test
	@DisplayName("add negative")
	public void addNeg() {
		try {
			r = calc.add(1_945.565f, -2_425.89653f);				
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(-480.33153f, r);
	}
	
	@Test
	@DisplayName("sub")
	public void sub() {
		try {
			r = calc.subtract(547675.78455f,4650.86568f);
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(543024.91887f, r);
	}
	
	
	@Test
	@DisplayName("sub negative")
	public void subNeg() {
		try {
			r = calc.subtract(-45385.78655f,96750.89668f);
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(-142136.68323f, r);
	}
	
//	@Test
//	@DisplayName("sub max value")
//	public void subMax() {
//		float r = calc.subtract(Float.MAX_VALUE,(Float.MAX_VALUE - 1));
//		assertEquals(1, r);
//	}
	
	@Test
	@DisplayName("divide")
	public void div() {
		try {
			r = calc.divide(5_749_490.34343f, 3_5454.373849f);		
		} catch (Exception e) {
			e.getMessage();
		}	
		assertEquals(162.165897159f, r);
	}
	
	@Test
	@DisplayName("divide negative")
	public void divNeg() {
		try {
			r = calc.divide(5_749_490.34343f, -3_5454.373849f);		
		} catch (Exception e) {
			e.getMessage();
		}	
		assertEquals(-162.165897159f, r);
	}
	
	@Test
	@DisplayName("divide zero")
	public void divideZero() {
		assertThrows(
				Exception.class, 
				() -> calc.divide(12f, 0), 
				"Deve dare l'Exception con il divisore uguale a 0.");
	}
	
	@Test
	@DisplayName("divide not zero")
	public void divideNotZero() {
		assertDoesNotThrow(
				() -> calc.divide(50f, 4f), 
				"Il divisore deve essere diverso da 0.");
	}
	
	@Test
	@DisplayName("multiply")
	public void mult() {
		try {
			r = calc.multiply(2_236.5772f, 9_650.987f);
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(21_585_177.4817f, r);
	}
	
	@Test
	@DisplayName("multiply negative")
	public void multNeg() {
		try {
			r = calc.multiply(-2_236.5772f, 9_650.987f);
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(-21_585_177.4817f, r);
	}
}
