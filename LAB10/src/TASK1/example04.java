package TASK1;

import java.io.*;
import java.util.Scanner;

public class example04 {

    public static void main(String argv[]){

        try{
            File f1 = new File("C:\\Users\\userKDI\\Documents\\T1.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in, "cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.print("HOW MANY NUMBER: ");
            int count = sc.nextInt();

            for(int i = 0; i<count; i++){
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();


            File f2 = new File("C:\\Users\\userKDI\\Documents\\T2.txt");
            f2.createNewFile();
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));

            try{
                while(true){
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число = " + (float)number);
                }
            }catch (EOFException e){

            }
            wr.flush();
            wr.close();
            rd.close();


        }catch (IOException e){
            System.out.println("END of File");
        }

    }
}
