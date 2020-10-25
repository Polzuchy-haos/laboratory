import java.util.Random;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

/*
 6. Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.
 */
public class example06 {

	public static void main(String[] args) {
		
		Scanner In = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Введите количество строк: ");
		int size_x = In.nextInt();
		System.out.println("Введите количество столбцов: ");
		int size_y = In.nextInt();
		
		int myarr[][] = new int[size_x][size_y];
		
		for(int i = 0; i<size_x; i++) {
			for(int i2 = 0; i2<size_y; i2++) {
				myarr[i][i2] = rand.nextInt(500);
			}
		}
		
		for(int x[] : myarr) {
			for(int y : x) {
				System.out.print(y + " ");
				
			}
			System.out.println("");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int size_x_del = rand.nextInt(size_x), size_y_del = rand.nextInt(size_y);
		
		int real [][] = new int[size_x - 1][size_y - 1];
		
		System.out.println("Удаляемая строка: " + size_x_del + "\n" + "Удаляемая столбец: " + size_y_del);
		
		Boolean flagx = false, flagy = false;
		
		for(int i = 0; i<size_x - 1; i++) {
			if(i == size_x_del)
				flagx = true;
			for(int i2 = 0; i2<size_y - 1; i2++) {
				if(i2 == size_y_del)
					flagy = true;
				if(flagx & flagy) {
					real[i][i2] = myarr[i+1][i2+1];
					continue;
				}	
				if(flagx) {
					real[i][i2] = myarr[i+1][i2];
					continue;
				}
				if(flagy) {
					real[i][i2] = myarr[i][i2+1];
					continue;
				}
				real[i][i2] = myarr[i][i2];
			}
			
		}
		
		
		for(int x[] : real) {
			for(int y : x) {
				System.out.print(y + " ");
				
			}
			System.out.println("");
		}
		
	}

}
