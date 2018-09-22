package week2.task2;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Fraction {

    int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        if(denominator==0){
            System.out.println("Invalid Fraction");
            return ;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(1, 1);
        f.numerator = numerator*other.denominator + other.numerator*denominator;
        f.denominator = denominator*other.denominator;
        f.reduce();
        return f;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(1, 1);
        f.numerator = numerator*other.denominator - other.numerator*denominator;
        f.denominator = denominator*other.denominator;
        f.reduce();
        return f;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(1, 1);
        f.numerator = numerator*other.numerator;
        f.denominator = denominator*other.denominator;
        f.reduce();
        return f;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(1, 1);
        f.numerator = numerator*other.denominator;
        f.denominator = denominator*other.numerator;
        f.reduce();
        return f;
    }
    public boolean equals(Object obj){
        //TODO: So sanh 2 phan so
        Fraction other = (Fraction) obj;
        if(denominator ==0 || other.denominator == 0) return false;
        else if(other.subtract(this).numerator==0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        if(denominator==0) return "Invalid Fraction";
        else if(numerator == 0) return "{0}";
        return "Fraction{" + numerator +'/' + denominator +'}';
    }

    public void reduce(){
        // TODO: Toi gian phan so
        int a=1;
        for(int i=Math.abs(numerator); i>0; i--){
            if(numerator%i==0 && denominator%i==0){
                a=i;
                break;
            }
        }
        if(a!=1) {
            numerator /= a;
            denominator /= a;
        }
        
    }
    public static void main(String[] args){
        Fraction ps = new Fraction(20,8);
        System.out.println(ps.toString());
        Fraction ps2 = new Fraction(33,4);
        System.out.println(ps2.toString());
        System.out.println("Add result: " + ps.add(ps2).toString());

        System.out.println("Subtract result: " + ps.subtract(ps2).toString());

        System.out.println("Multiply result: " + ps.multiply(ps2).toString());

        System.out.println("Divide result: " + ps.divide(ps2).toString());

        System.out.println("Equals result: " + ps.equals(ps2));
    }
}