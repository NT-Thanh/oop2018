package week4.task2;

import java.text.DecimalFormat;

public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14;

    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;

    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
//        DecimalFormat df = new DecimalFormat("#.0000");
//        double s = PI*radius*radius;
//        return Double.parseDouble(df.format(s));
        return PI*radius*radius;
    }
    public double getPerimeter(){
//        DecimalFormat df = new DecimalFormat("#.0000");
//        double s = 2*PI*radius;
//        return Double.parseDouble(df.format(s));
        return 2*PI*radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
