import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		
		System.out.println("exemple 5");
		System.out.println("������� �����");
		Scanner In = new Scanner(System.in);
		int num = In.nextInt();
		System.out.println("����� � ����� " + num + " �����:" + (num /= 1000));
	}

}
