import java.util.Scanner;

public class example09_13{
	
	public static void main(String arg[]){
		Scanner Input = new Scanner(System.in);
		System.out.println("Please, write two number");
		double A1 = Input.nextDouble();
		double A2 = Input.nextDouble();
		System.out.println(Math.pow(A1,A2));
	}	
}