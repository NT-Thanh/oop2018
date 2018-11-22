package week11;

import java.io.Serializable;
import java.util.ArrayList;

public class Task2 {
    public <T extends Serializable & Comparable> T getMax(ArrayList<T> array){
        if(array == null || array.size() == 0)
            return null;
        T max = array.get(0);

        for(int i=0; i<array.size(); i++){
            if(max.compareTo(array.get(i)) < 0){
                max = array.get(i);
            }
        }
        return  max;
    }
    
    public static void main(String[] args){
        Task2 tk2 = new Task2();

        ArrayList array = new ArrayList();
        Byte[] by = {2, 3, 3, 1, 8, 5};
        Short[] sh = {-1, -3, 5, 6, 2};
        Character[] ch = {'z', 'c', 'a', 'd', 'm'};
        Double[] db = {3.14, 5.2, 66.6, -2.3, 10.5};

        ArrayList<Byte> arrayOfByte = new ArrayList<Byte>();
        for(int i=0; i<by.length; i++){
            arrayOfByte.add(by[i]);
        }
        ArrayList<Short> arrayOfShort = new ArrayList<Short>();
        for (int i=0; i<sh.length; i++){
            arrayOfShort.add(sh[i]);
        }
        ArrayList<Character> arrayOfChar = new ArrayList<Character>();
        for (int i=0; i<ch.length; i++){
            arrayOfChar.add(ch[i]);
        }
        ArrayList<Double> arrayOfDouble = new ArrayList<Double>();
        for(int i=0; i<db.length; i++){
            arrayOfDouble.add(db[i]);
        }

        System.out.println(tk2.<Byte>getMax(arrayOfByte));

        System.out.println(tk2.<Short>getMax(arrayOfShort));

        System.out.println(tk2.<Character>getMax(arrayOfChar));

        System.out.println(tk2.<Double>getMax(arrayOfDouble));
    }
}
