package KiemThu_TinhLaiQuangCao;


public class LaiQuangCao {
    public static final int SMALL_VIEW = 1;
    public static final int SMALL_CLICK = 2;
    public static final int LARGE_VIEW = 2;
    public static final int LARGE_CLICK = 4;

    public static double BenefitCalculator(int small, int large, int smallView, int smallClick, int largeView, int largeClick){
        double result = 0;
        double smallBenefit = smallView*1 + smallClick*2;
        double largeBenefit = largeView*2 + largeClick*4;
        double smallClickRate = smallClick/smallView;
        double largeClickRate = largeClick/largeView;

        if(small + large > 15){
            return -1;
        }

        if(smallClickRate>0.2){
            smallBenefit *= 1.10;
            int bonusTime = (int)((smallClickRate - 0.2)/0.1);
            for(int i = 0; i<bonusTime; i++){
                smallBenefit *= 1.15;
            }
        }
        if(largeClickRate>0.2){
            largeBenefit *= 1.10;
            int bonusTime = (int)((largeClickRate - 0.2)/0.1);
            for(int i = 0; i<bonusTime; i++){
                largeBenefit *= 1.15;
            }
        }

        result = smallBenefit + largeBenefit;

        return result;
    }
}
