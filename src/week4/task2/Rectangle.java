package week4.task2;

public class Rectangle extends Shape {
    private double width, length;

    Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

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

    public double getArea(){

        return width * length;
    }
    public  double getPerimeter(){
        return (width + length)*2;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
