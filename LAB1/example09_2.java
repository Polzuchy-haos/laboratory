import java.util.Scanner;

public class example09_2
{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		System.out.print("Name: ");
		String name = in.nextLine();
		System.out.print("age: ");
		int age = in.nextInt();
		System.out.printf("Your date: name %s age %d", name, age);
	}
}