package TASK1;

import java.io.*;

public class example07 {

    public static void main(String argv[]){
        BufferedReader br = null;
        BufferedWriter out = null;

        try{

            br = new BufferedReader(new FileReader("MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("MyFile2.txt"));

            int lineCount = 0;
            String s;

            while((s = br.readLine()) == null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }


        }catch (IOException e){
            System.out.println("ERROR!!!");
        }finally {
            try {
                br.close();
                out.flush();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
