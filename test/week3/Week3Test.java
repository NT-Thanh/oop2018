package week3;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static week3.Week3.max;
import static week3.Week3.minOfArray;


public class Week3Test {
    private int[][] array;

    @Before
    public void fillInArray() {
        array = new int[5][100];
        array[0] = new int[]{32, 75, 33, 1, 29, 10111};
        array[1] = new int[]{6, 7, 8, 9, 20, 33, 45, 1023};
        array[2] = new int[]{-6, -34, 7, 203, 664, 23, 210};
        array[3] = new int[]{2, 12, 65, 0, 74, 786};
        array[4] = new int[]{123, 456, 789, 101, 232, 32, 2};

    }

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {
        assertEquals(7, max(3, 7));
        assertEquals(100, max(54, 100));
        assertEquals(-10, max(-25, -10));
        assertEquals(9, max(9, 7));
        assertEquals(4, max(4, -12));

    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray() {
        assertEquals(1, minOfArray(array[0]));
        assertEquals(6, minOfArray(array[1]));
        assertEquals(-34, minOfArray(array[2]));
        assertEquals(0, minOfArray(array[3]));
        assertEquals(2, minOfArray(array[4]));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI() {
        assertEquals("Thieu can", Week3.calculateBMI(40, 1.49));
        assertEquals("Binh thuong", Week3.calculateBMI(50, 1.55));
        assertEquals("Thua can", Week3.calculateBMI(60, 1.60));
        assertEquals("Beo phi", Week3.calculateBMI(70, 1.60));
        assertEquals(null, Week3.calculateBMI(-40, 1.49));
    }
}
