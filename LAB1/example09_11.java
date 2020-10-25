import java.util.Scanner;

public class example09_11{
	
	public static double nlog(double A, double B){
		return (Math.exp(B * Math.log(A)));
	}	
	
	public static void main(String args[]){
		Scanner Input = new Scanner(System.in);
		System.out.println("Write two side");
		double A1 = Input.nextDouble();
		double A2 = Input.nextDouble();
		System.out.println(nlog(A1,A2));
	}
}	