package week5_6;

public class Circle extends Shape{
    private double radius;
    private MyPoint point;
    private final double PI = 3.14;
    //TODO: Constructors
    public Circle(){
        point = new MyPoint(0, 0);
        radius = 1.0;
    }
    public Circle(double radius, double x, double y){
        point = new MyPoint(x, y);
        this.radius = radius;
    }
    public Circle(double radius, double x, double y, String color, boolean filled){
        super(color, filled);
        point = new MyPoint(x, y);
        this.radius = radius;

    }
    //TODO: getters & setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getPosition() {
        return point.toString();
    }
    public void setPosition(double x, double y) {
        point = new MyPoint(x, y);
    }

    //TODO: move this circle
    @Override
    public void moveTo(double x, double y) {
        setPosition(x, y);
    }
    public String position(){
        return point.toString();
    }

    //TODO: Area and perimeter of this circle
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    @Override
    public String toString() {
        return "Circle:{ radius: " + radius + ", color: " + this.getColor() + '}';
    }
}
