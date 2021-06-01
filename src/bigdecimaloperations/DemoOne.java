package bigdecimaloperations;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DemoOne {

    @Test
    public void whenGettingAttributes_thenExpectedResult() {
        BigDecimal bigDecimal = new BigDecimal("-12345.6789");
        assertEquals(9, bigDecimal.precision());
        assertEquals(4, bigDecimal.scale());
        assertEquals(-1, bigDecimal.signum());
        System.out.println(bigDecimal.unscaledValue());
    }

    @Test
    public void whenComparingBigDecimals_thenExpectedResult() {
        BigDecimal bigDecimalOne = new BigDecimal("1.0");
        BigDecimal bigDecimalTwo = new BigDecimal("1.00");
        BigDecimal bigDecimalThree = new BigDecimal("2.0");

        /* this compare method ignores the scale while comparing */

        assertTrue(bigDecimalOne.compareTo(bigDecimalThree) < 0);
        assertTrue(bigDecimalThree.compareTo(bigDecimalOne) > 0);
        assertTrue(bigDecimalOne.compareTo(bigDecimalTwo) == 0);
//        assertEquals(0, bigDecimalOne.compareTo(bigDecimalTwo));
        assertTrue(bigDecimalOne.compareTo(bigDecimalThree) <= 0);
        assertTrue(bigDecimalOne.compareTo(bigDecimalTwo) >= 0);
        assertTrue(bigDecimalOne.compareTo(bigDecimalThree) != 3);

    }

    @Test
    public void whenEqualsCalled_thenSizeAndScaleMatched() {
        BigDecimal bigDecimalOne = new BigDecimal("1.0");
        BigDecimal bigDecimalTwo = new BigDecimal("1.00");

        /* this equals() method considers two BigDecimal objects as equal
        * if they're equal in value and scale.*/

//        assertNotEquals(bigDecimalOne, bigDecimalTwo);
        assertFalse(bigDecimalOne.equals(bigDecimalTwo));
    }

    public void whenPerformingArithmetic_thenExpectedResult() {
        BigDecimal bigDecimalOne = new BigDecimal("4.0");
        BigDecimal bigDecimalTwo = new BigDecimal("2.0");

        BigDecimal sum = bigDecimalOne.add(bigDecimalTwo);
        BigDecimal difference = bigDecimalOne.subtract(bigDecimalTwo);
        BigDecimal quotient =bigDecimalOne.divide(bigDecimalTwo);
        BigDecimal product = bigDecimalOne.multiply(bigDecimalTwo);

//        assertEquals(0, sum.compareTo(new BigDecimal("6.0")));
        assertTrue(sum.compareTo(new BigDecimal("6.0")) == 0);
        assertTrue(difference.compareTo(new BigDecimal("2.0")) == 0);
        assertTrue(quotient.compareTo(new BigDecimal("2.0")) == 0);
        assertTrue(product.compareTo(new BigDecimal("8.0")) == 0);


    }
}
