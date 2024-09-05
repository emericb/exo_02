import org.demo.exo_02.Fib;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibTest {
    @Test
    public void testGetFibSeriesWithRangeOne() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();

        assertNotNull(result, "Result should not be null");
        assertEquals(1, result.size(), "Result should contain one element");
        assertEquals(0, result.get(0), "Result should contain {0}");
    }

    @Test
    public void testGetFibSeriesWithRangeSix() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();

        assertNotNull(result, "Result should not be null");
        assertEquals(6, result.size(), "Result should contain six elements");
        assertTrue(result.contains(3), "Result should contain the number 3");
        assertFalse(result.contains(4), "Result should not contain the number 4");
        assertArrayEquals(new Integer[]{0, 1, 1, 2, 3, 5}, result.toArray(), "Result should be {0, 1, 1, 2, 3, 5}");
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
