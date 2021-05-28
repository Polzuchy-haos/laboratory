package TASK1;

import java.io.*;

public class ex11 {

    public static void main(String argv[]){

        try {
            DataOutputStream in = new DataOutputStream(new FileOutputStream("Myfile1.txt"));
            in.writeDouble(54.56);
            in.writeDouble(52.56);
            in.writeDouble(53.56);
            in.writeDouble(51.56);
            in.writeDouble(50.56);
            in.flush();
            in.close();

            DataInputStream out = new DataInputStream(new FileInputStream("dTest.txt"));
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
