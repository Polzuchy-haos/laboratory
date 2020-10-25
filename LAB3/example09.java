import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example09 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Введите размаер массива: ");
		int size = In.nextInt();
		int array[] = new int[size];
		Random rand = new Random();
		
		for(int i = 0; i < size; i++) {
			array[i] = rand.nextInt(200);
		}
		for(int x : array)
			System.out.print(x + " ");
		//Arrays.sort(array);
		System.out.println();
		/*
		int  A1=0, A2=200;
		for(int i = 0; i<size; i++) {
			if(array[i]<A2) {
				A1 = i;
				A2 = array[i];
			}

		}
		System.out.print(A1 + " " + A2 + " ");
		*/
		
		int Min = 200;
		for(int x : array) {
			if(x<Min)
				Min = x;
		}
		System.out.println("Минимальное число: " + Min);
		System.out.print("Позиции нахождения: ");
		for(int i = 0; i<size ; i++) {
			if(array[i]==Min)
				System.out.print(i + " ");
		}
			
		

	}

}
