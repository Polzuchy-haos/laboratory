package Task3;
/*
В программе, вычисляющей сумму элементов типа byte одномерного массива,
вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– ввод или вычисление значения за границами диапазона типа.
 */

import java.util.Scanner;
import java.util.Random;

public class Task_No_Exception {

    public static void main(String argv[]){

        Random rand = new Random();
        Scanner In = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        int size_array = In.nextInt();

        byte bob[] = new byte[size_array];

        for(int i = 0; i<size_array; i++){
            bob[i] = In.nextByte();
        }

        short medium = 0;

        for(byte x : bob){
            medium += x;
        }

        System.out.println("Сумма значение массива: " + medium);
    }

}
