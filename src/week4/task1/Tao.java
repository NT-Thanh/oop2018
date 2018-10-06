package week4.task1;

public class Tao extends  HoaQua {
    private String color, taste;

    public Tao() {
        color = "orange";
        taste = "good";

    }

    //TODO: getters & setters
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTaste() {
        return taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }

    public boolean isPopular() {
        if (taste == "good" || taste == "excellent")
            return true;
        return false;
    }
    public boolean eatDirectly(){
        return true;
    }
}
