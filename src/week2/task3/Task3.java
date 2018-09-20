package week2.task3;

public class Task3 {

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

public class Task3_Ball {
    int radius, weigth;
    String color;

    Task3_Ball(){
        radius = 1;
        weigth = 1;
        color = "white";
    }

    public int getRadius() {
        return radius;
    }

    public int getWeigth() {
        return weigth;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int price(){
        return radius*10 + weigth*10;
    }
    public String suitableForWhom{
        if(radius>=3) return "For Adult";
        else return "For Children";
    }
    public String type{
        if(color.equals("white")) return "For competition";
        else return "For excercise";
    }
}
public class Task3_Chair {
    int height, weight, matierial;

}
public class Task3_Desk {
}
