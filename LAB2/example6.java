import java.util.Scanner;

public class example6 {
	
	public static int octa(int num) {
		int e = 0;
		int d = 0, m = 0;
		while(true) {
			m = num%8;
			if(m == 0)
				d++;
	//		System.out.println(m);
			e = e + m;
		//	System.out.println(e);
			num /=8;
	//		System.out.println(num);
			if(num < 8) {
				e = e * 10 + num;
				break;
			}
			else 
				e *= 10;
			
		}
		num = 0;
		while(true) {

			num = (num + e%10) * 10;
			e /= 10;
			if(e == 0)
				break;
		}
		return num;

	}

	public static void main(String[] args) {
		
		System.out.println("exemple 6");
		System.out.println("Введите число");
		
		Scanner In = new Scanner(System.in);
		int a = In.nextInt();
		a = octa(a);
		System.out.println("Число в восмеричной системе: " + a);
		System.out.println("Вторая цифра: " + ((a/10)%10));
		
		
		

	}

}
