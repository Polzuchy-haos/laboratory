import java.util.Scanner;

public class example07 {

	public static void main(String[] args) {
		
		char abc[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		Scanner In = new Scanner(System.in);
		System.out.println("Введите размер массива: ");
		int size = In.nextInt();
		char array[] = new char[size];
		for(int i = 0, h = 0; i<size; i++,h+=2) {
			if(h==26)
				h = 1;
			if(h == 27)
				h = 0;
			array[i] = abc[h];
			
		}
		System.out.println("Прямой порядок: ");
		for(char x : array) {
			System.out.print(x + " ");
		}
		System.out.println("");
		System.out.println("Обратный порядок: ");
		for(int i = size-1;  i>=0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
