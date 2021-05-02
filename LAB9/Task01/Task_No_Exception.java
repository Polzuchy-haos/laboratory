/*
В программе, вычисляющей среднее значение среди положительных элементов
одномерного массива (тип элементов int), вводимого с клавиатуры, могут
возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– несоответствие числового типа данных;
– положительные элементы отсутствуют.
 */
package Task01;

import java.util.Scanner;

public class Task_No_Exception {


    public static void main(String argv[]){

        Scanner In = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size_array = In.nextInt();

        int array[] = new int[size_array];

        for(int i = 0; i<size_array; i++){
            array[i] = In.nextInt();
        }

        int medium = 0;

        for(int x : array){
            medium += x;
        }

        System.out.println("среднее массива :" + (float)medium/size_array);

    }


}
