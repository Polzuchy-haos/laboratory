import java.util.Scanner;

public class example09_10{
	
	public static void main(String args[]){
		Scanner Input = new Scanner(System.in);
		System.out.println("Please, write two numbers");
		int A1 = Input.nextInt();
		int A2 = Input.nextInt();
		System.out.printf("Sum: %d, Dif: %d", A1+A2, A1-A2);
	}	
}	