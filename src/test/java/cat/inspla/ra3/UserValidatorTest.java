package cat.inspla.ra3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private final UserValidator validator = new UserValidator();

    @Test
    void TODO_usernameCorrecteÉsVàlid() {
        // TODO
        assertFalse(validator.isValidUsername("JW"));
        assertTrue(validator.isValidUsername("Hola"));
        assertFalse(validator.isValidUsername(null));
        assertFalse(validator.isAdult(17));
        assertTrue(validator.isAdult(18));
        assertTrue(validator.isAdult(19));

    }

    @Test
    void TODO_validateRequiredTextAmbCadenaBuidaLlançaExcepció() {
        // TODO
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateRequiredText(null);
        });
    }
    //Aixo es caixa negre, no es pot veure el codi.
}
