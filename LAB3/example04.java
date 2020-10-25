import java.util.Scanner;

public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		
		System.out.print("¬ведите два числа: ");
		
		int A1 = In.nextInt(), A2 = In.nextInt();
		
		for(;A1<A2+1;A1++) {
			System.out.print(A1 + ", ");
		}

	}

}
