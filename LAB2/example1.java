import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		System.out.println("exemple 1");
		Scanner In = new Scanner(System.in);
		System.out.println("Please, write number");
		int num = In.nextInt();
		if((num % 3)==0)
			System.out.println("Number Ok");
		else
			System.out.println("Number done");
	}

}
