package bigdecimal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class DemoOne {

    @Test
    public void whenBigDecimalCreated_thenValueMatches() {
        BigDecimal bigDecimalFromString = new BigDecimal("0.1");
        BigDecimal bigDecimalFromCharArray = new BigDecimal(new char[]{'3', '.', '1', '4', '1', '5', '8', '2'});
        BigDecimal bigDecimalFromInt = new BigDecimal(42);
        BigDecimal bigDecimalFromLong = new BigDecimal(123412345678901L);
        BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
        BigDecimal bigDecimalFromBigInteger = new BigDecimal(bigInteger);


//        Assert.assertEquals("0.1", bigDecimalFromString.toString());
        Assert.assertEquals("0.1", bigDecimalFromString.toString());
        Assert.assertEquals("3.141582", bigDecimalFromCharArray.toString());
        Assert.assertEquals("42", bigDecimalFromInt.toString());
        Assert.assertEquals("123412345678901", bigDecimalFromLong.toString());
        Assert.assertEquals(bigInteger.toString(), bigDecimalFromBigInteger.toString());
    }

    @Test
    public void whenBigDecimalCreatedFromDouble_thenValueMayNotMatch() {
/*
        the double constructor does an exact translation,
        0.1 does not have an exact representation in double
*/
        BigDecimal bigDecimal = new BigDecimal(0.1d);
        Assert.assertNotEquals("0.1", bigDecimal.toString());
    }

    @Test
    public void whenBigDecimalCreatedUsingValueOf_thenValueMatch() {
        BigDecimal bigDecimalFromLongOne = BigDecimal.valueOf(123412345678901L);
        BigDecimal bigDecimalFromLongTwo = BigDecimal.valueOf(123412345678901L, 2);
        BigDecimal bigDecimalFromDouble = BigDecimal.valueOf(0.1d);

        Assert.assertEquals("123412345678901", bigDecimalFromLongOne.toString());
        Assert.assertEquals("1234123456789.01", bigDecimalFromLongTwo.toString());
        Assert.assertEquals("0.1", bigDecimalFromDouble.toString());
    }

}
