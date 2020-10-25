import java.util.Random;

/*
 5. Напишите программу, в которой создается двумерный
целочисленный массив. Он заполняется случайными числами. Затем в этом
массиве строи и столбцы меняются местами: первая строка становится первым
столбцом, вторая строка становиться вторым столбцом и так далее. Например,
если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем
массив из 5 строк и 3 столбцов.
 */

public class example05 {

	public static void main(String[] args) {
		 
		int myar[][] = new int[3][5];
		Random rand = new Random();
		for(int i = 0; i<3; i++) {
			for(int i2 = 0; i2<5; i2++) {
				myar[i][i2] = rand.nextInt(500);
			}
		}
		
		for(int x[] : myar) {
			for(int y : x) {
				System.out.print(y + " ");
				
			}
			System.out.println("");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int clon[][] = new int[5][3];
		
		for(int i = 0; i<5; i++) {
			for(int i2 = 0; i2<3; i2++) {
				clon[i][i2] = myar[i2][i];
			}
		}
		
		for(int x[] : clon) {
			for(int y : x) {
				System.out.print(y + " ");
				
			}
			System.out.println("");
		}

	}

}
