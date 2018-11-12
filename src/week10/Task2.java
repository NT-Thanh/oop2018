package week10;

import java.util.Random;

public class Task2 {


    public double[] generateArray(int size){
        double[] array = new double[size];
        double start = 10;
        double end = 2000;
        double random;
        for(int i=0; i<array.length; i++){
            random = new Random().nextDouble();
            array[i] = start + (random * (end - start));
        }
        return array;
    }
    public void bubbleSort(double[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i; j<array.length; j++){
                if(array[j]<array[i]){
                    double s = array[i];
                    array[i] = array[j];
                    array[j] = s;
                }
            }
        }
    }

    public static void main(String[] args){
        Task2 t2 = new Task2();
        double[] array = t2.generateArray(1000);
        for(int i=0; i<1000; i++){
            System.out.println(array[i]);
        }
        t2.bubbleSort(array);
        System.out.println("----------AFTER SORT-----------");
        for(int i=0; i<1000; i++){
            System.out.println(array[i]);
        }
    }
}
