package BTT9_Test;

import BTT9.MathUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @BeforeAll
    static void setUp() {
        System.out.println("=== Bắt đầu chạy MathUtilsTest ===");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("=== Kết thúc ===");
    }


    @Test
    public void testMaxAGreaterThanB() {
        assertEquals(10, MathUtils.max(10, 5));
    }

    @Test
    public void testMaxAEqualsB() {
        assertEquals(7, MathUtils.max(7, 7));
    }

    @Test
    public void testMaxALessThanB() {
        assertEquals(8, MathUtils.max(3, 8));
    }


    @Test
    public void testMaxBothMinValue() {
        assertEquals(
                Integer.MIN_VALUE,
                MathUtils.max(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testMaxMinAndMaxValue() {
        assertEquals(
                Integer.MAX_VALUE,
                MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void testMaxMaxAndMinValue() {
        assertEquals(
                Integer.MAX_VALUE,
                MathUtils.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void testMaxBothMaxValue() {
        assertEquals(
                Integer.MAX_VALUE,
                MathUtils.max(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }


    @Test
    public void testDivideByPositiveNumber() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    public void testDivideByNegativeNumber() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> MathUtils.divide(10, 0));
    }

    @Test
    public void testNegativeNumerator() {
        assertEquals(-4, MathUtils.divide(-9, 2));
    }
}