import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		
		System.out.println("exemple 5");
		System.out.println("¬ведите число");
		Scanner In = new Scanner(System.in);
		int num = In.nextInt();
		System.out.println("“ыс€ч в числе " + num + " равно:" + (num /= 1000));
	}

}
