import java.util.Scanner;

public class example09_8
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("What first number: ");
		int one = in.nextInt();
		System.out.print("What seconf number: ");
		int second = in.nextInt();
		System.out.printf("result: %d",(one+second));
	}
}