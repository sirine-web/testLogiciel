
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.*;


public class TestCalculatrice {

    @Test
    public void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(calculatrice.addition(3, 4), 7);
        assertEquals(calculatrice.addition(-3, 4), 1);
        assertEquals(calculatrice.addition(0, 0), 0);
    }

    @Test
    public void testSoustraction() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(calculatrice.soustraction(5, 3), 2);
        assertEquals(calculatrice.soustraction(-5, 3), -8);
        assertEquals(calculatrice.soustraction(0, 0), 0);
    }

    @Test
    public void testMultiplication() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(calculatrice.multiplication(5, 3), 15);
        assertEquals(calculatrice.multiplication(-5, 3), -15);
        assertEquals(calculatrice.multiplication(0, 5), 0);
    }

    //@Test(expected=IllegalArgumentException.class)
    @Test
    public void testDivision() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(calculatrice.division(10, 2), 5);
        assertEquals(calculatrice.division(-10, 2), -5);
        assertThrows(IllegalArgumentException.class, () -> calculatrice.division(5, 0)); // Attend une exception
    }
}
