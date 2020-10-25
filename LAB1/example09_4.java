import java.util.Scanner;

public class example09_4
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Month: ");
		int month = in.nextInt();
		System.out.print("day: ");
		int day = in.nextInt();
		if(month>=1 && month<=12) System.out.println("mount...OK");
		else System.out.println("month...Error");
		if(day>=1 && day<=31) System.out.println("day...OK");
		else System.out.println("day...Error");
	}
}