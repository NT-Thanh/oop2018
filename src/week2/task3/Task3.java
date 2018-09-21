package week2.task3;

public class Task3 {

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Task3_Ball {
    int radius, weight;
    String color;

    //TODO: Constructor
    Task3_Ball() {
        radius = 1;
        weight = 1;
        color = "white";
    }
    Task3_Ball(int radius, int weight, String color){
        this.radius = radius;
        this.weight = weight;
        this.color = color;
    }

    //TODO: getters & setters
    public int getRadius() {
        return radius;
    }

    public int getWeigth() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //TODO: 3 Phương thức
    public int price() {
        return radius * 10 + weight * 10;
    }

    public String suitableForWhom(){
        if (radius <= 4 && radius > 0) return "For Children";
        else if (radius <= 0) return "For no one";
        else return "For Adult";
    }

    public String type(){
        if (color.equals("white")) return "For competition";
        else return "For excercise";
    }
}

class Task3_Chair {
    int height, weight;
    String material;

    //TODO: getters & setters
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMatierial(String matierial) {
        this.material = material;
    }

    // TODO: Constructors
    Task3_Chair(){
        height = 1;
        weight = 1;
        material = "wood";
    }
    Task3_Chair(int height, int weight, String material){
        this.height = height;
        this.weight = weight;
        this.material = material;
    }

    //TODO: 3 Phương thức
    public int price(){
        return height*10 + weight*10;
    }
    public String suitalbeForWhom(){
        if (height <= 4 && height > 0) return "For Children";
        else if (height <= 0) return "For no one";
        else return "For Adult";
    }


}

class Task3_Desk {

}
