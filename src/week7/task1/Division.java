package week7.task1;

public class Division extends BinaryExpression{
    private Expression left, right;

    public Expression Division(Expression left_, Expression right_){
        left = left_;
        right = right_;
        Numeral num = new Numeral(left_.evaluate() / right_.evaluate());

        Expression ex = num;
        return ex;
    }

    @Override
    public String toString() {
        return "DivisionOf:(" + left.toString() + ", " + right.toString() + ')';
    }
}
