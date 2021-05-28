package TASK1;

import java.io.*;
import java.util.Scanner;

public class example05 {

    public static void main(String argv[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fname = "C:\\Users\\userKDI\\Documents\\" + sc.nextLine();

        try{

            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Полный  путь файла: " + f1.getAbsolutePath());
            System.out.print("Введите количество строк: ");
            int n = sc.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for(int i = 0; i<n; i++){
                System.out.print("Строка " + (i+1) +": ");
                String s = sc.nextLine();
                dOut.writeUTF(s);

            }
            dOut.flush();
            dOut.close();

            DataInputStream dIN = new DataInputStream(new FileInputStream(f1));
            while(true){
                System.out.println(dIN.readUTF());
            }


        }catch (Exception e){
            System.out.println(e);
        }

    }

}
