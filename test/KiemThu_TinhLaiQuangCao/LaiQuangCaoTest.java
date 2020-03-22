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
        Data = new int [10][10];
        Result = new double[10];
        Data[0] = new int []{4, 8, 12, 3, 32, 5};
        Data[1] = new int []{5, 9, 14, 4, 35, 10};
        Data[2] = new int []{7, 8, 19, 8, 26, 9};
        Data[3] = new int []{8, 7, 23, 9, 22, 11};
        Data[4] = new int []{6, 10, 16, 6, 47, 15};

        Result = new double[]{102.0, 132.0, 123.0, 129.0, 182.0};
    }

    @Test
    public void testBenefitCalculator(){
        assertEquals(Result[0], BenefitCalculator(Data[0][0], Data[0][1], Data[0][2], Data[0][3], Data[0][4], Data[0][5]), 0.001);
        assertEquals(Result[1], BenefitCalculator(Data[1][0], Data[1][1], Data[1][2], Data[1][3], Data[1][4], Data[1][5]), 0.001);
        assertEquals(Result[2], BenefitCalculator(Data[2][0], Data[2][1], Data[2][2], Data[2][3], Data[2][4], Data[2][5]), 0.001);
        assertEquals(Result[3], BenefitCalculator(Data[3][0], Data[3][1], Data[3][2], Data[3][3], Data[3][4], Data[3][5]), 0.001);
        assertEquals(Result[4], BenefitCalculator(Data[4][0], Data[4][1], Data[4][2], Data[4][3], Data[4][4], Data[4][5]), 0.001);

    }
}