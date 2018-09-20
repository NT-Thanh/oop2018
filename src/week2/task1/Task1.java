package week2.task1;

import javax.xml.bind.SchemaOutputResolver;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        for(int i=a; i>0; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 0;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if(n==0) return 0;
        else if(n==1) return 1;
        else return(fibonacci(n-1) + fibonacci(n-2));
        return 0;
    }
}
