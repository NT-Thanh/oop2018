package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Task1 {
    public List<String> getAllFuntions(File path){
        ArrayList<String> result = new ArrayList<>();

        BufferedReader br = null;
        String content = new String();
        String previous = new String();
        String aFuntion = new String();
        boolean gettingInput = false;
        int i = 0;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf-8"));
            while ((content = br.readLine()) != null){
                if(content.contains("static")){
                    gettingInput = true;
                }
                if(previous.equals("    }")){
                    result.add(aFuntion);
                    aFuntion = new String();
                    gettingInput = false;
                }
                if(gettingInput){
                    aFuntion += '\n' + content;
                }
                previous = content;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }
    public String findFunctionByName(String name){
        String result = new String("NOT FOUND !!!");
        File path = new File("src/week9/Utils.java");
        List<String> list = getAllFuntions(path);


        for(int i=0; i<list.size(); i++){
            String s = list.get(i).substring(0, list.get(i).indexOf(')'));
            int ind = s.indexOf('(');
            String newName = new String();
            newName += s.substring(0, ind);
            for(int j=ind; j<s.length(); j++){
                if(s.charAt(j) == ' '){
                    if(s.charAt(j-1) != ','){
                        newName += s.substring(ind, j);
                        ind=j;
                    }
                    else{
                        ind=j+1;
                        newName += ',';
                    }
                }
            }
            newName += ')';
            if(newName.contains(name)){
                result = list.get(i);
            }
        }


        return result;
    }

    public static void main(String[] args){
        Task1 t1 = new Task1();
        File path = new File("src/week9/Utils.java");
        List<String> array = t1.getAllFuntions(path);

        for(int i = 0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
        System.out.println("---------------FindFuntion-----------------");
        System.out.println(t1.findFunctionByName("findFileByName(String,String)"));
    }
}
