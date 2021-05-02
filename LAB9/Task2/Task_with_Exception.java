package Task2;

/*
В программе, где требуется из матрицы вывести столбец с номером, заданным с
клавиатуры, могут возникать ошибки в следующих случаях:
– ввод строки вместо числа;
– нет столбца с таким номером
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Task_with_Exception {

    public static void main(String argv[]){

        try{
            int bob[][] = new int[10][10];

            Random rand = new Random(0);
            Scanner In = new Scanner(System.in);

            for(int x = 0; x<10; x++){
                for(int y = 0; y<10; y++){
                    bob[x][y] = rand.nextInt(100);
                }
            }

            for(int x[] : bob){
                for( int y: x){
                    System.out.print(y + "\t");
                }
                System.out.println();
            }
            System.out.print("Введите номер столбца: ");

            int Number = In.nextInt();

            for(int x = 0; x<10; x++){
                System.out.print(bob[x][Number] + "\t");

            }
        }catch (InputMismatchException e){
            System.out.println("ввод строки вместо числа;");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("нет столбца с таким номером;");
        }






    }

}
