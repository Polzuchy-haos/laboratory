import java.util.Scanner;

public class example09_12{
		
		public static double hyp(double a, double b){
			return Math.sqrt(a*a + b*b);
		}
	
		public static void main(String args[]){
			Scanner Input = new Scanner(System.in);
			System.out.println("Write two side");
			double A1 = Input.nextDouble();
			double A2 = Input.nextDouble();
			System.out.println(hyp(A1,A2));
		}
}	