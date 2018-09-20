package week2.task2;

public class Fraction {

    int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        numerator = this.numerator;
        denominator = this.denominator;
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
        return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(1, 1);
        f.numerator = numerator*other.numerator;
        f.denominator = denominator*other.denominator;
        f.reduce();
        return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction f = new Fraction(1, 1);
        f.numerator = numerator*other.denominator;
        f.denominator = denominator*other.numerator;
        f.reduce();
        return null;
    }
    public boolean equals(Object obj){
        return (this == obj);
    }
    public void reduce(){
        // TODO: Toi gian phan so
        int a=1;
        for(int i=numerator; i>0; i--){
            if(numerator%i==0 && denominator%i==0) a=i;
        }
        if(a!=1) {
            numerator /= a;
            denominator /= a;
        }
    }
}
