package week2.task3;

public class Task3 {
    Customer[] customer = new Customer[100];
    Chair[] chair = new Chair[100];
    Desk[] desk = new Desk[100];

    public static void main(String[] args){
        Task3 t = new Task3();
        //TODO: build up customers
        t.customer[0] = new Customer("Pete", "child", "for studying", 70);
        t.customer[1] = new Customer("Homie", "adult", "for work", 250);
        t.customer[2] = new Customer("Jame", "adult", "for work", 150);
//        t.customer[0].setAge(null);
//        t.customer[0].setBuyingPurpose(null);
        //TODO: build up productions
        t.desk[0] = new Desk(4, 4, "black");
        t.desk[1] = new Desk(6, 5, "brown");
        t.desk[2] = new Desk(3, 2, "gray");
        t.chair[0] = new Chair(6, 8, "wood");
        t.chair[1] = new Chair(3, 3, "gold");
        t.chair[2] = new Chair(2, 2, "air");
        //TODO: find out what to buy
        for(int i=0; t.customer[i] != null; i++){
            System.out.println(t.customer[i].infomation() + " can buy:");
            for(int j=0; t.desk[j] != null; j++){
                if(t.customer[i].isSuitableDesk(t.desk[j]))
                    System.out.println(t.desk[j].infomation()+ " price: " + t.desk[j].price());
            }
            for(int j=0; t.chair[j] != null; j++){
                if(t.customer[i].isSuitableChair(t.chair[j]))
                    System.out.println(t.chair[j].infomation()+ " price: " + t.chair[j].price());
            }
            System.out.println("Pay by " + t.customer[i].payingMethod());
            System.out.println("------------------");
        }
    }

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Customer {
    String name, age, buyingPurpose;
    int priceCanPay;
    //TODO: getters & setters

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getPriceCanPay() {
        return priceCanPay;
    }

    public String getBuyingPurpose() {
        return buyingPurpose;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPriceCanPay(int priceCanPay) {
        this.priceCanPay = priceCanPay;
    }

    public void setBuyingPurpose(String buyingPurpose) {
        this.buyingPurpose = buyingPurpose;
    }
    //TODO: Constructors

    Customer(){
        name = "unknown";
        age = "unknown";
        buyingPurpose = "unknown";
        priceCanPay = 100;
    }
    Customer(String name, String age, String buyingPurpose, int priceCanPay){
        this.name = name;
        this.age = age;
        this.buyingPurpose = buyingPurpose;
        this.priceCanPay = priceCanPay;
    }
    //TODO: 3 methods

    public boolean isSuitableChair(Chair chair){
        if(chair.price()<=priceCanPay && chair.suitalbeForWhom().equals(age) && chair.type().equals(buyingPurpose))
            return true;
        else return false;
    }
    public boolean isSuitableDesk(Desk desk){
        if(desk.price()<=priceCanPay && desk.suitalbeForWhom().equals(age) && desk.type().equals(buyingPurpose))
            return true;
        else return false;
    }
    public String payingMethod(){
        if(priceCanPay >= 200) return "credit card";
        else return "cash";
    }

    public String infomation() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", buyingPurpose='" + buyingPurpose + '\'' +
                ", priceCanPay=" + priceCanPay +
                '}';
    }
}

class Chair {
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

    //TODO: Constructors
    Chair(){
        height = 1;
        weight = 1;
        material = "wood";
    }
    Chair(int height, int weight, String material){
        this.height = height;
        this.weight = weight;
        this.material = material;
    }

    //TODO: 3 methods
    public int price(){
        if (height <= 0 || weight <= 0) return 0;
        return height*10 + weight*10;
    }
    public String suitalbeForWhom(){
        if (height <= 0 || weight <= 0) return "no one";
        else if (height <= 4) return "child";
        else return "adult";
    }
    public String type(){
        if (height <= 0 || weight <= 0) return "for nothing";
        else if(height > 4 && weight > 4) return "for work";
        else return "for studying";
    }

    public String infomation() {
        return "Chair{" +
                "height=" + height +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }
}

class Desk {
    int height, acreage;
    String color;
    //TODO: getters & setters

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getAcreage() {
        return acreage;
    }

    public String getColor() {
        return color;
    }
    //TODO: Constructors

    Desk(){
        height = 1;
        acreage = 1;
        color = "black";
    }
    Desk(int height, int acreage, String color){
        this.height = height;
        this.acreage = acreage;
        this.color = color;
    }
    //TODO: 3 methods

    public int price(){
        if (height <= 0 || acreage <= 0) return 0;
        return height*8 + acreage*10;
    }
    public String type(){
        if (height <= 0 || acreage <= 0) return "for nothing";
        else if(height <=4 && acreage <=4) return "for studying";
        else return "for work";
    }
    public String suitalbeForWhom(){
        if (height <= 0 || acreage <= 0) return "no one";
        else if (height <= 4) return "child";
        else return "adult";
    }

    public String infomation() {
        return "Desk{" +
                "height=" + height +
                ", acreage=" + acreage +
                ", color='" + color + '\'' +
                '}';
    }
}
