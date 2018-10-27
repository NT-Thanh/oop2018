package week7.task1;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression ex){
        expression = ex;
    }

    @Override
    public String toString() {
        return "Square: " + expression.toString();
    }
}
