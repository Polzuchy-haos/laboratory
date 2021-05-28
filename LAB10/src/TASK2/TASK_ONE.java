package TASK2;
/*
Создать проект, позволяющий из одного, предварительно созданного программными средствами файла,
переписать данные, соответствующие условию - в исходном файле содержится две строки в формате UTF-8 и 5 чисел типа double.
В результирующий файл переписать вторую строку и положительные числа.
 */

import java.io.*;
import java.util.Scanner;

public class TASK_ONE {

    public static void send_in_File(){

        try {

            DataOutputStream outD = new DataOutputStream(new FileOutputStream("D:\\Project\\JAVA\\LAB10\\MyFile1.txt"));
            outD.writeDouble(1.1);
            outD.writeDouble(2.2);
            outD.writeDouble(3.3);
            outD.writeDouble(4.4);
            outD.writeDouble(5.5);
//            outD.flush();
//            outD.close();

            BufferedWriter outS = new BufferedWriter(new FileWriter("D:\\Project\\JAVA\\LAB10\\MyFile1.txt",true),2048);
            outS.append('\n');
            outS.append("ONE TWO FREE\n");
            outS.append("ZERO ONE BOB\n");
            outS.flush();
            outS.close();



        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String argv[]){

        send_in_File();

        try {
            DataInputStream In = new DataInputStream(new FileInputStream("MyFile1.txt"));

            double Array[] = new double[5];



            for(int i = 0; i<5; i++){
                Array[i] = In.readDouble();
            }


            BufferedReader File_R = new BufferedReader(new FileReader("MyFile1.txt"),2048);

            File_R.readLine();
            File_R.readLine();

            String s1 = File_R.readLine();
            String s2 = File_R.readLine();

            File_R.close();

            for(double x: Array)
                System.out.print(x + " ");
            System.out.println("");
            System.out.println(s1 + "\n" + s2);


            DataOutputStream Out = new DataOutputStream(new FileOutputStream("MyFile2.txt"));

            for(double x : Array){
                if(x > 0){
                    Out.writeDouble(x);
                }
            }
            Out.flush();
            Out.close();

            BufferedWriter File_O = new BufferedWriter(new FileWriter("MyFile2.txt",true));
            File_O.append(s2);
            File_O.flush();
            File_O.close();







        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
