package TASK2;

/*
Задание 3. Создать проект, позволяющий из одного текстового файла, содержащего несколько строк (тип String)
аранее подготовленного текста на русском языке (Пушкин, Лермонтов или другой российсмки классик на Ваш вкус),
построчно переписать в другой текстовый файл слова начинающиеся с согласных букв..
Требования:
– слова из предложения выделять методом split();
– в новом файле следует указать номер строки, в которой иско- мые слова находились в исходном файле;
– для каждой строки указать количество выбранных слов.
 */

import java.io.*;

public class TASK_TWO {

    static int NumLine = 0;

    static boolean Mycheak(String str){
        char x = str.charAt(0);
        switch (x){
            case 'Б':
                return true;
            case 'б':
                return true;
            case 'В':
                return true;
            case 'в':
                return true;
            case 'Г':
                return true;
            case 'г':
                return true;
            case 'Д':
                return true;
            case 'д':
                return true;
            case 'Ж':
                return true;
            case 'ж':
                return true;
            case 'З':
                return true;
            case 'з':
                return true;
            case 'К':
                return true;
            case 'к':
                return true;
            case 'Л':
                return true;
            case 'л':
                return true;
            case 'М':
                return true;
            case 'м':
                return true;
            case 'Н':
                return true;
            case 'н':
                return true;
            case 'П':
                return true;
            case 'п':
                return true;
            case 'Р':
                return true;
            case 'р':
                return true;
            case 'С':
                return true;
            case 'с':
                return true;
            case 'Т':
                return true;
            case 'т':
                return true;
            case 'Ф':
                return true;
            case 'ф':
                return true;
            case 'Х':
                return true;
            case 'х':
                return true;
            case 'Ц':
                return true;
            case 'ц':
                return true;
            case 'Ч':
                return true;
            case 'ч':
                return true;
            case 'Ш':
                return true;
            case 'ш':
                return true;
            case 'Щ':
                return true;
            case 'щ':
                return true;
            default:
                return false;
        }
    }

    static void proc(String s){


        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Text2.txt",true));

            String[] mem = s.split(" ");

            String str = String.valueOf(NumLine) + ") ";
            int word = 0;
            for (String x : mem){
                if(Mycheak(x) == true){
                    str += x + " ";
                    word++;
                }
            }
            str += " # WORD: " + word + "\n";

            System.out.println(str);
            out.write(str);
            out.flush();


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ERROR");
        }
        NumLine++;

    }


    public static void main(String argv[]){

        try {
            BufferedReader In_File = new BufferedReader(new FileReader("Text.txt"));
            String str;
            while((str = In_File.readLine()) != null){
                proc(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
