import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		System.out.println("exemple 3");
		System.out.println("������� �����");
		Scanner In = new Scanner(System.in);
		int num = In.nextInt();
		if((num % 4) == 0){
			if(num < 10)
				System.out.println("����� ��");
		}
		else 
			System.out.println("����� �� ��������");
	}

}
