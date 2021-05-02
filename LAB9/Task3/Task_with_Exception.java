package Task3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task_with_Exception {

    public static void main(String argv[]){

        try {
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
        }catch(InputMismatchException e){
            System.out.println("ввод строки вместо числа");
        }catch (ArrayStoreException e){
            System.out.println("ввод или вычисление значения за границами диапазона типа.");
        }
    }
}
