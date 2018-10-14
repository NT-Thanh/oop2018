package week5_6;

import week5_6.Shape;

public class Rectangle extends Shape {
    private double width, length;
    private MyPoint topLeft;

    //TODO: Constructors
    Rectangle(){
        width = 1.0;
        length = 1.0;
        topLeft = new MyPoint(0, 0);
    }
    Rectangle(double width, double length, double x, double y){
        this.width = width;
        this.length = length;
        topLeft = new MyPoint(x, y);
    }
    Rectangle(double width, double length, double x, double y, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
        topLeft = new MyPoint(x,y);
    }
    //TODO: getters & setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String getPosition(){
        return topLeft.toString();
    }
    public void setPosition(double x, double y){
        topLeft = new MyPoint(x, y);
    }

    //TODO: move this Rectangle
    @Override
    public void moveTo(double x, double y) {
        setPosition(x, y);
    }
    //TODO : Area & prrimeter of this Rectangle
    public double getArea(){
        return width * length;
    }
    public  double getPerimeter(){
        return (width + length)*2;
    }
    @Override
    public String toString() {
        return "Rectangle: { width" + width + ", length: " + length + ", color: " + getColor() + '}';
    }
    public String position(){
        return topLeft.toString();
    }
}
