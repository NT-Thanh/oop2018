package week9;

import sun.plugin2.message.Message;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path){
        BufferedReader br = null;
        String content = new String();
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "utf-8"));

            String ALine;
            while ((ALine = br.readLine()) != null){
                content += ALine + '\n' ;
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void writeContentToFile(String path){
        BufferedWriter bw = null;
        String content = new String("new content");
        try{
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"));
            bw.write(content);
            bw.newLine();

            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void continueWriteContentToFile(String path){
        BufferedWriter bw = null;
        String content = new String("new content");
        try{
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path, true), "utf-8"));
            bw.write(content);
            bw.newLine();

            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File f = new File(folderPath);
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.equals(fileName);
            }
        });
        if(matchingFiles != null)
            return matchingFiles[0];

        System.out.println("FileNotFound!!!!");
        return null;
    }

    public static void main(String[] args){
        File file = findFileByName("src/week9/", "ds.txt");

        writeContentToFile("src/week9/ds.txt");

        System.out.println(readContentFromFile("src/week9/ds.txt"));
        System.out.println("------AFTER CONTINUE WRITING-------");

        continueWriteContentToFile("src/week9/ds.txt");
        continueWriteContentToFile("src/week9/ds.txt");
        continueWriteContentToFile("src/week9/ds.txt");

        System.out.println(readContentFromFile("src/week9/ds.txt"));

    }
}
