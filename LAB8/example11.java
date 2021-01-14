import java.util.Scanner;

public class example11 {
	
	static int rect(int x) {
		if(x<=0) {
			return 0;
		}
		if(x%2 == 1) {
			x = x/2;
			return 1 + rect(x)*10;
		}
		x = x/2;
		return 0 + rect(x)*10;

	}


	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
		System.out.print("Введите число для перевода: ");
		int num = IN.nextInt();
		System.out.println("Число: " + rect(num));
		

	}
	

}
