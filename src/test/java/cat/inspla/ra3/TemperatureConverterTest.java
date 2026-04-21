package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @ParameterizedTest
    @CsvSource({
            "0,32",
            "100,212",
            "-40,-40"
        // TODO
    })


    void TODO_convertCelsiusToFahrenheitRetornaValorCorrecte(double c, double expected) {
        // TODO
        assertEquals(expected, converter.convertCelsiusToFahrenheit(c));
    }

    @ParameterizedTest
    @CsvSource({
            "32,0",
            "212,100",
            "-40,-40"
            // TODO
    })

    void TODO_convertFahrenheitToCelsiusRetornaValorCorrecte(double c, double expected) {
        // TODO
        assertEquals(expected, converter.convertFahrenheitToCelsius(c));
    }

    //S’utilitza delta perquè els decimals no són exactes i poden tenir petits errors de precisió.
}
