import java.util.Scanner;

public class example09_5
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("What year were you born: ");
		int bib = in.nextInt();
		System.out.print("your age:");
		System.out.print(((bib-2020)*-1));
	}
}