import java.util.Scanner;

public class example08 {

	public static void main(String[] args) {
		char arr_EN[] = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};
		System.out.println("¬ведите размер массива: ");
		Scanner In = new Scanner(System.in);
		int size = In.nextInt();
		char array[]  = new char[size];
		
		for(int i = 0, h = 0; i<size; i++, h++) {
			if(h == 20)
				h = 0;
			array[i] =  arr_EN[h];
		}
		for(char x : array)
			System.out.print(x + " ");
	}

}
