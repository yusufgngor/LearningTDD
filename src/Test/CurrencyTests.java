package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import MyApp.Dollar;

public class CurrencyTests {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        final Dollar product = five.times(2);
        assertEquals(10, product.amount);
        final Dollar product2 = five.times(3);
        assertEquals(15, product2.amount);

    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

    }

}
