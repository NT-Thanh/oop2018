package week7.task1;

public class ExpressionTest {
    public static void main(String[] args){
        Addition add = new Addition();
        Division div = new Division();
        Multiplication mul = new Multiplication();
        Subtraction sub = new Subtraction();
        Numeral num1 = new Numeral(1);
        Numeral num2 = new Numeral(2);
        Numeral num3 = new Numeral(3);
        Numeral num10 = new Numeral(10);
        Numeral num0 = new Numeral(0);
        Expression left = num10;
        Expression right = num2;

        System.out.println(add.Addition(left, right).toString());
        try{
            System.out.println(div.Division(left, num0).toString());
        }catch(Exception ArithmeticException){
            System.out.println("Can not / by zero");
        }
        System.out.println(mul.Multiplication(left, right).toString());
        System.out.println(sub.Subtraction(left, right).toString());

        System.out.println(mul.Multiplication(add.Addition(sub.Subtraction(mul.Multiplication(num10, num10), num1), mul.Multiplication(num2, num3)), add.Addition(sub.Subtraction(mul.Multiplication(num10, num10), num1), mul.Multiplication(num2, num3))));
    }
}
