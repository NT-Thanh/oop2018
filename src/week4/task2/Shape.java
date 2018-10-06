package week4.task2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args){
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(4, 5, "gray", true);
        Circle circle = new Circle(3, "brown", true);
        Square square = new Square(2, "white", false);

        System.out.println(square.getArea());
        square.setSide(4);
        System.out.println("Square's Area: " + square.getArea() + " Perimeter: " + square.getPerimeter() + " Color:" + square.getColor() +" Filled: " + square.isFilled());
        System.out.println("Circle's Area: " + circle.getArea() + " Perimeter: " + circle.getPerimeter() + " Color:" + circle.getColor() +" Filled: " + circle.isFilled());
        System.out.println("Rectangle's Area: " + rectangle.getArea() + " Perimeter: " + rectangle.getPerimeter() + " Color:" + rectangle.getColor() +" Filled: " + rectangle.isFilled());;

    }
}
