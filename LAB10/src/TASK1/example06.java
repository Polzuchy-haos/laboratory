package TASK1;

import java.io.*;

public class example06 {

    public static void main(String argv[]) throws IOException{

        Reader in = null;
        Writer out = null;

        try{

            in = new FileReader("File061.txt");
            out = new FileWriter("File062.txt", true);

            int oneByte;
            while((oneByte = in.read()) != -1){
                out.write((char)oneByte);
                out.append((char)oneByte);
                System.out.println((char)oneByte);

            }

        }catch (IOException e){
            System.out.println("Ошибка!!!!");
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
