package calculator

import org.junit.jupiter.api.Test

class CalculatorTest {
	@Test
	void calculatorTest() {
		assert Calculator.add(2, 3) == 5
	}
}
