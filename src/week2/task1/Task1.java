package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        for(int i=Math.abs(a); i>0; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n < 0){
            System.out.println("Invalid Fibonacci, set value to -1");
            return -1;
        }
        if(n==0) return 0;
        else if(n==1) return 1;
        else return(fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main (String[] args){
        int a=-33, b=-100;
        System.out.println(gcd(a, b));


        int c=-5;
        System.out.println("Fibonacci(" + c + "): " + fibonacci(c));
    }
}
