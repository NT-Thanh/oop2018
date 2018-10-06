package week4.task1;

public class CamThanhPhong extends Cam {
    private int price, production;

    CamThanhPhong(){
        price = 19;
        production = 140;
    }

    //TODO: getters & setters
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getProduction() {
        return production;
    }
    public void setProduction(int production) {
        this.production = production;
    }

    public boolean isForExporting(){
        if(production >= 200) return true;
        return false;
    }
    public boolean isCheap(){
        if(price <= 20) return true;
        return false;
    }
}
