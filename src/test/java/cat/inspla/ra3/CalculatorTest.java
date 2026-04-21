package cat.inspla.ra3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void TODO_addAmbPositiusRetornaSumaCorrecta() {
        // TODO
        assertEquals(4,calculator.add(4,0));
        assertEquals(0,calculator.add(0,0));
        assertEquals(-2,calculator.add(-4,2));
        assertEquals(-14,calculator.add(-4,-10));
    }

    @Test
    void TODO_divideByZeroLlançaExcepció() {
        // TODO

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10,0);
        });
    }
}
