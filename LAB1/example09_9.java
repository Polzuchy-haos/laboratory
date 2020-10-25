import java.util.Scanner;

public class example09_9
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("What number: ");
		int one = in.nextInt();
		System.out.printf(" %d %d %d %d", (one-1), one, (one+1),((one-1)+one+(one+1))*(one+1),Math.sqrt(((one-1)+one+(one+1))));
	}
}