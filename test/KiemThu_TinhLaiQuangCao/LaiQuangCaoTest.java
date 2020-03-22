package KiemThu_TinhLaiQuangCao;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static KiemThu_TinhLaiQuangCao.LaiQuangCao.BenefitCalculator;

public class LaiQuangCaoTest {
    private int [][] Data;
    private double [] Result;
    @Before
    public void inItData(){
        Data = new int [10][25];
        Result = new double[25];
        Data[0] = new int []{4, 8, 12, 3, 32, 5};
        Data[1] = new int []{5, 9, 14, 4, 35, 10};
        Data[2] = new int []{7, 8, 19, 8, 26, 9};
        Data[3] = new int []{8, 7, 23, 9, 22, 11};
        Data[4] = new int []{6, 10, 16, 12, 26, 15};
        Data[5] = new int []{2, 11, 22, 2, 14, 17};
        Data[6] = new int []{1, 14, 34, 3, 25, 11};
        Data[7] = new int []{3, 12, 21, 11, 39, 23};
        Data[8] = new int []{5, 5, 18, 17, 21, 15};
        Data[9] = new int []{1, 1, 1, 1, 1, 1};

        Result = new double[]{102.0, 132.0, 123.0, 129.0, -1, 349.03, 134.0, 213.0, 154.0, 30.28};
    }

    @Test
    public void testBenefitCalculator(){
        assertEquals(Result[0], BenefitCalculator(Data[0][0], Data[0][1], Data[0][2], Data[0][3], Data[0][4], Data[0][5]), 0.1);
        assertEquals(Result[1], BenefitCalculator(Data[1][0], Data[1][1], Data[1][2], Data[1][3], Data[1][4], Data[1][5]), 0.1);
        assertEquals(Result[2], BenefitCalculator(Data[2][0], Data[2][1], Data[2][2], Data[2][3], Data[2][4], Data[2][5]), 0.1);
        assertEquals(Result[3], BenefitCalculator(Data[3][0], Data[3][1], Data[3][2], Data[3][3], Data[3][4], Data[3][5]), 0.1);
        assertEquals(Result[4], BenefitCalculator(Data[4][0], Data[4][1], Data[4][2], Data[4][3], Data[4][4], Data[4][5]), 0.1);
        assertEquals(Result[5], BenefitCalculator(Data[5][0], Data[5][1], Data[5][2], Data[5][3], Data[5][4], Data[5][5]), 0.1);
        assertEquals(Result[6], BenefitCalculator(Data[6][0], Data[6][1], Data[6][2], Data[6][3], Data[6][4], Data[6][5]), 0.1);
        assertEquals(Result[7], BenefitCalculator(Data[7][0], Data[7][1], Data[7][2], Data[7][3], Data[7][4], Data[7][5]), 0.1);
        assertEquals(Result[8], BenefitCalculator(Data[8][0], Data[8][1], Data[8][2], Data[8][3], Data[8][4], Data[8][5]), 0.1);
        assertEquals(Result[9], BenefitCalculator(Data[9][0], Data[9][1], Data[9][2], Data[9][3], Data[9][4], Data[9][5]), 0.1);

    }
}