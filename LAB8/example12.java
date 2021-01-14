import java.util.Scanner;


public class example12 {
	static Scanner In = new Scanner(System.in);
	

	static int write(int[] x, int len) {
		if(len == 0) return 0;
		x[x.length - len] = In.nextInt();
		return write(x, len-1);
	}
	
	static int puts(int[] x, int len) {
		if(len == 0) return 0;
		System.out.print(x[x.length - len] + " ");
		return puts(x,len-1);
		
	}
	

	public static void main(String[] args) {
		int bob[] = new int[4];
		write(bob,bob.length);
		
		for(int x : bob) {
			System.out.print(x + " ");
		}
		
		puts(bob,bob.length);

	}

}

