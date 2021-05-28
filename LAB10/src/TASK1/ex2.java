package TASK1;

import java.io.*;

public class ex2 {

    public static void main(String argv[]){
        try {
            BufferedReader File_R = new BufferedReader(new FileReader("dTest.txt"),2048);
            String s = File_R.readLine();
            File_R.close();



           BufferedWriter File_W = new BufferedWriter(new FileWriter("Myfile1.txt"),2048);
            File_W.append(s);
            File_W.close();

            DataInputStream out = new DataInputStream(new FileInputStream("Myfile1.txt"));
            for(int i = 0; i< 5; i++){
                System.out.println(out.readDouble());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
