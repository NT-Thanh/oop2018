package week5_6;

import week5_6.Rectangle;

public class Square extends Rectangle{

    //TODO: Constructor
    public Square(){
        super();
    }
    public  Square(double side, double x, double y){
        super(side, side, x, y);
    }
    public  Square(double side, double x, double y, String color, boolean filled){
        super(side, side, x, y, color, filled);
    }

    //TODO: getter && setter
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    //TODO: move this square
    @Override
    public void moveTo(double x, double y) {
        setPosition(x, y);
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
        return "Square:{ side" + getWidth() + ", color: " + getColor() + '}';
    }
    public String position(){
        return super.getPosition();
    }
}
