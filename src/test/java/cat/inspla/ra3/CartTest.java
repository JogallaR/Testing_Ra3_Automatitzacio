package cat.inspla.ra3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;

    @BeforeEach
    void setUp() {
        // TODO
        cart = new Cart();
    }

    @Test
    void cartNovaTeTotalZero() {
        assertEquals(0.0, cart.getTotal(), 0.01);
    }

    @Test
    void afegirItemIncrementaTotal() {
        cart.addItem("Test", 5.0);
        assertEquals(5.0, cart.getTotal(), 0.01);
    }

    @Test
    void clearDeixaCartBuit() {
        cart.addItem("Test", 5.0);
        cart.clear();

        assertEquals(0.0, cart.getTotal(), 0.01);
        assertEquals(0, cart.getItemCount());
    }
}
