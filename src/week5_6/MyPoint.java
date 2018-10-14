package week5_6;

public class MyPoint {
    double x, y;
    MyPoint(){
        x=0;
        y=0;
    }
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position: " + '(' + x + ", " + y + ')';
    }
}
