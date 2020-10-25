import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		
		System.out.println("exemple 4");
		System.out.println("Ââåäèòå ÷èñëî");
		Scanner In = new Scanner(System.in);
		int num = In.nextInt();
		if((num >= 5) && (num <= 10))
			System.out.println("×èñëî îê");
		else 
			System.out.println("×èñëî íå ïîäõîäèò");
		

	}

}
