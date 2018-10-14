package week5_6;

public class Triangle extends Shape {
    double a, b, c;
    MyPoint topPoint;

    //TODO:Contructor
    Triangle(){
        a=3; b=4; c=5;
        topPoint = new MyPoint(0, 0);
    }
    Triangle(double a, double b, double c, double x, double y){
        this.a = a;
        this.b = b;
        this.c = c;
        topPoint = new MyPoint(x, y);
        this.check();
    }
    Triangle(double a, double b, double c, double x, double y, String color, boolean filled){
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
        topPoint = new MyPoint(x, y);
        this.check();
    }
    //TODO: getters
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public String getPosition(){
        return topPoint.toString();
    }
    //TODO: resize this Triangle
    public void setSide(double a, double b, double c, double x, double y){
        this.a = a;
        this.b = b;
        this.c = c;
        topPoint = new MyPoint(x, y);
        this.check();
    }
    //TODO: move this Triangle
    @Override
    public void moveTo(double x, double y) {
        topPoint = new MyPoint(x, y);
    }
    @Override
    public String position(){
        return topPoint.toString();
    }
    //TODO: is this obj a Triangle ???
    private boolean check(){
        if((a+b)>c && (b+c)>a && (a+c)>b) return true;
        System.out.println("SOMETHING IS WRONG WITH YOUR TRIANGLE!!!");
        return false;
    }

    @Override
    public String toString() {
        return "Triangle:{side a: " + a + ", side b: " + b + ", side c: " + c + ", color: " + this.getColor() + '}';
    }
}
