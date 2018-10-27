package week7.task1;

public abstract class Expression {
    @Override
    public abstract String toString();

    public int evaluate(){
        return ((Numeral) this).getValue();
    }
}
