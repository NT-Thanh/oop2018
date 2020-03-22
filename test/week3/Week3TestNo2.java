package week3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Week3TestNo2 {
    private int[] week3sArray1;
    private int[] week3sArray2;

    @Before
    public void init(){
        week3sArray2 = new int[]{0,9,7,2,4,1};
        week3sArray1 = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testMax(){
        int result = 7;

        assertEquals(result, week3.Week3.max(1, 7));
    }

    @Test
    public void testminOfArray(){
        int result1 = 1;
        int result2 = 0;

        assertEquals(result1 ,week3.Week3.minOfArray(week3sArray1));
        assertEquals(result2 ,week3.Week3.minOfArray(week3sArray2));
    }
}
