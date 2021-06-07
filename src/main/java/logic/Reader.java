package logic;

import java.io.*;
import java.util.ArrayList;

public class Reader {
    public static final String PATH1 = "src/main/resources/emails.txt";
    public static final String PATH2 = "src/main/resources/dir1/emails.txt";
    public static final String PATH3 = "";
    ArrayList<String> arrayList = new ArrayList<>();
    String text;

    public void readFile(String path) {
        File file = new File(path);
        try {
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            int buff;
            while ((buff = inputStream.read()) > 0) {
                text = String.valueOf((char) buff);
//                System.out.print((char) buff);
                arrayList.add(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String e : arrayList) {
            System.out.print(e);
        }
    }

}
