import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		System.out.println("exemple 2");
		Scanner In = new Scanner(System.in);
		System.out.println("Write number");
		int num = In.nextInt();
		if((num % 5) == 2){
			if((num % 7) == 1){
				System.out.println("Number Ok");
			}
		}
		else
			System.out.println("Number done");
		

	}

}
