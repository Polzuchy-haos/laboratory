import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.print("¬ведите количество чисел в последовательности: ");
		int num = In.nextInt();
		int a = 1, b = 1, c, i = 0;
		System.out.print(a + ", "+ b + ", ");
		while(i++<num) {
			c = a;
			a += b;
			System.out.print(a + ", ");
			b = c;
		}
		

	}

}
