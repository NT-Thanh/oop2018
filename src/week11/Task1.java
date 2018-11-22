package week11;

import java.io.Serializable;
import java.util.ArrayList;

public class Task1 {
    public <T extends Serializable & Comparable> ArrayList<T> task1Sort(ArrayList<T> array){
        for(int i=0; i<array.size(); i++){

            for(int j=i;j<array.size(); j++){
                if(array.get(i).compareTo(array.get(j)) > 0){
                    T te = array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, te);
                }
            }
        }
        return array;
    }

    public static void main(String[] args){
        Task1 tk1 = new Task1();
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

        array = tk1.<Byte>task1Sort(arrayOfByte);
        System.out.println(array.toString());

        array = tk1.<Short>task1Sort(arrayOfShort);
        System.out.println(array.toString());

        array = tk1.<Character>task1Sort(arrayOfChar);
        System.out.println(array.toString());

        array = tk1.<Double>task1Sort(arrayOfDouble);
        System.out.println(array.toString());
    }
}
