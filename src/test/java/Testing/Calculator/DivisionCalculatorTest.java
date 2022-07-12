package Testing.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionCalculatorTest {
	private DivisionCalculator divisionCalculator;

	@BeforeEach
	public void initTests(){
		divisionCalculator = new DivisionCalculator();
	}

	@Test
	public void testDivide(){
		assertEquals(10, divisionCalculator.divide(100, 10));
	}

	@Test
	public void testDivideByZero(){
		assertThrows(ArithmeticException.class, () -> divisionCalculator.divide(10, 0));
	}
}