import java.util.Scanner;

public class example09_1
{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		System.out.print("name: ");
		String name = in.nextLine();
		System.out.print("Last_name: ");
		String last_name = in.nextLine();
		System.out.print("patronymic: ");
		String patronymic = in.nextLine();
		System.out.printf("HALLO %s %s %s",name,last_name, patronymic);
	}
}