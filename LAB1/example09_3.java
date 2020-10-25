import java.util.Scanner;

public class example09_3
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Day of week: ");
		String week = in.nextLine();
		System.out.print("Month: ");
		String month = in.nextLine();
		System.out.print("day: ");
		int day = in.nextInt();
		System.out.printf("%s %s %d", week, month, day);
	}
}