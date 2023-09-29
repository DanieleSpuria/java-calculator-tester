package org.java.test;

public class Main {
	public static void main(String[] args) {
		try {
			Calculator calc = new Calculator();
			
			System.out.println(calc.add(19.5f, 25.3f));
			System.out.println(calc.subtract(85.5f,90.8f));
			System.out.println(calc.multiply(2, 3));
			System.out.println(calc.divide(6, 0));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
