package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsAppTest {

    private final StringUtilsApp utils = new StringUtilsApp();

    @ParameterizedTest
    @CsvSource({
            "'hola    món', 'hola món'",
            "'  Java   CI  és  útil  ', 'Java CI és útil'",
            "'un    dos     tres', 'un dos tres'",
            "'   espais al principi', 'espais al principi'",
            "'final amb espais   ', 'final amb espais'"
    })
    void testNormalizeSpaces(String input, String expected) {
        assertEquals(expected, utils.normalizeSpaces(input));
    }
}

