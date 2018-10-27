package week7.task1;

public class Numeral extends Expression {
    private  int value;

    public Numeral(int i){
        value = i;
    }
    public Numeral(){

    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Num: " + value;
    }
}
