import org.demo.exo_02.Fib;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibTest {

    @Test
    public void testGetFibSeriesWithRangeOneIsNotEmpty() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        assertNotNull(result, "Result should not be null");
    }

    @Test
    public void testGetFibSeriesWithRangeOneContainsZero() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        assertEquals(1, result.size(), "Result should contain one element");
        assertEquals(0, result.get(0), "Result should contain {0}");
    }

    @Test
    public void testGetFibSeriesWithRangeSixContainsThree() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertTrue(result.contains(3), "Result should contain the number 3");
    }

    @Test
    public void testGetFibSeriesWithRangeSixHasSixElements() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertEquals(6, result.size(), "Result should contain six elements");
    }

    @Test
    public void testGetFibSeriesWithRangeSixDoesNotContainFour() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertFalse(result.contains(4), "Result should not contain the number 4");
    }

    @Test
    public void testGetFibSeriesWithRangeSixContainsExpectedSequence() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertArrayEquals(new Integer[]{0, 1, 1, 2, 3, 5}, result.toArray(), "Result should be {0, 1, 1, 2, 3, 5}");
    }

    @Test
    public void testGetFibSeriesWithRangeSixIsSorted() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertTrue(isSorted(result), "Result should be sorted in ascending order");
    }

    private boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}