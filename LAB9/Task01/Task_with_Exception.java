package Task01;
/*
В программе, вычисляющей среднее значение среди положительных элементов
        одномерного массива (тип элементов int), вводимого с клавиатуры, могут
        возникать ошибки в следующих случаях:
        – ввод строки вместо числа;
        – несоответствие числового типа данных;
        – положительные элементы отсутствуют.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_with_Exception {

    public static void main(String argv[]){
        try{
            Scanner IN = new Scanner(System.in);

            System.out.print("Введите размер массива: ");
            int size_array = IN.nextInt();

            int array[] = new int[size_array];

            for(int i = 0; i<size_array; i++){
                array[i] = IN.nextInt();
            }

            int medium = 0;

            for(int i = 0; i<size_array; i++){
                if(array[i] >= 0){
                    break;
                }
                if(i == size_array-1){
                    if(array[i]<0){
                        throw new OnlyNegativExceptoin();
                    }
                }
            }

            for(int x : array){
                medium += x;
            }

            System.out.println("среднее массива :" + medium/size_array);

        }catch (InputMismatchException e){
            System.out.println("Исключение несоответствия ввода");
        }catch (ArrayStoreException e){
            System.out.println("Присвое элементом массива обьектом несовместимого типа");
        } catch (OnlyNegativExceptoin onlyNegativExceptoin) {
            System.out.println("Только негативные значения массива");
        }


    }
}

class OnlyNegativExceptoin extends Exception{

    OnlyNegativExceptoin(){

    }
    public String toString(){
        return "OnlyNegativExceptoin";
    }

}
