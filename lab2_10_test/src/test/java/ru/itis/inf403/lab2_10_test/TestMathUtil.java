package ru.itis.inf403.lab2_10_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestMathUtil {

    static MathUtil mathUtil;

    @BeforeAll
    static void init() {
        mathUtil = new MathUtil();
    }

    @Test
    void testSum() {
        int expected = 10; //эталонное заранее вычисленное значение
        int actual = MathUtil.sum(5, 5);

        assertEquals(expected, actual);
        assertEquals(0, MathUtil.sum(-5,5));
        assertEquals(-2, MathUtil.sum(-1,-1));
        assertEquals(-1,
                MathUtil.sum(Integer.MIN_VALUE,Integer.MAX_VALUE));
    }

    @Test
    void testCompare() {
//        assertEquals(1, MathUtil.compare(5,4));
//        assertEquals(0, MathUtil.compare(4,4));
//        assertEquals(-1, MathUtil.compare(4,9));

        assertTrue(MathUtil.compare(5,4) > 0);
        assertTrue(MathUtil.compare(4,4) == 0);
        assertTrue(MathUtil.compare(4,9) < 0);

    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 10",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"

    })

    void testSum1(int a, int b, int expectedResult) {
        assertEquals(expectedResult, MathUtil.sum(a, b));
    }

    @Test
    void testDivide() {
        assertThrows(IllegalAccessException.class, () -> {MathUtil.divide(1,0);});
    }

    @Test
    void testSort() {
        MathUtil mathUtil = new MathUtil();
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8},
                mathUtil.sort(new int[] {1,2,3,4,5,6,7,8}));
    }

    @AfterAll
    static void destroy() {

    }
}
