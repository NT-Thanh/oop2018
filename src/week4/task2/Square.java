package week4.task2;

public class Square extends Rectangle{

    public Square(){
        new Rectangle();
    }
    public  Square(double side){
        new Rectangle(side, side);
    }
    public  Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString() {
        return "Square{}";
    }
}
