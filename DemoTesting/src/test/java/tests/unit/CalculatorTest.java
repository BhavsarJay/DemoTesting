package tests.unit;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import app.Calculator;
import app.CalculatorService;

public class CalculatorTest {

	Calculator calc;
	CalculatorService service;
	
	@Before
	public void init() {
		service = Mockito.mock(CalculatorService.class);
		calc = new Calculator(service);
	}
	
	@Test
	public void testAdd() {
		int expected = 10;
		int actual = calc.add(1, 2, 3, 4);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		double expected = 5.0;
		double actual = calc.divide(10, 2);
		assertEquals(expected, actual, 0.001);
	}
	
	@Test
	public void testPercentage() {
		int expected = 100;
		when(service.multiply(200,50)).thenReturn(10000);
		//int actual = calc.getPercentage(200, 50);
		int actual = calc.getPercentage(200, 50);
		assertEquals(expected, actual);
	}

}
