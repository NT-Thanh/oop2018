package week7.task2;

import java.io.*;
import java.util.ArrayList;

public class Task2 {
    void throwNullPointerException () throws NullPointerException{
        String a = null;
        int z = a.length();
//        throw new NullPointerException("This is NullPointerException");
    }
    void throwArrayIndexOfBoundException () throws ArrayIndexOutOfBoundsException{
        int[] a = {1, 2, 3};
        int b = a[3] + a[2];
//        throw new ArrayIndexOutOfBoundsException("This is ArrayIndexOutOfBoundsException");
    }
    void throwArithmeticException () throws ArithmeticException{
        int b = 7/0;
//        throw new ArithmeticException("This is ArithmeticException");
    }
    void throwClassCastException () throws ClassCastException {
        Object obj = new Object();
        Task2 tk2 = (Task2) obj;
//        throw new ClassCastException ("This is ClassCastException ");
    }
    void throwIOException () throws IOException {
        BufferedWriter bw= null;
        FileOutputStream fos= new FileOutputStream("C:\\Users\\Administrator\\Desktop\\ds.txt");

        bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
        bw.close();
        bw.newLine();
//        throw new IOException ("This is IOException ");
    }
    void throwFileNotFoundException() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\dx.txt");
//        throw new FileNotFoundException ("This is FileNotFoundException ");
    }
    public static void main(String[] args){
        Task2 tk = new Task2();
        try {
            tk.throwArithmeticException();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        try {
            tk.throwFileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            tk.throwArrayIndexOfBoundException();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        try {
            tk.throwClassCastException();
        }catch(ClassCastException e){
            e.printStackTrace();
        }
        try {
            tk.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            tk.throwNullPointerException();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

}
