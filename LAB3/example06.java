import java.util.Scanner;

public class example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.print("¬ведите размер массива: ");
		int size = In.nextInt();
		int arr[] = new int[size];
		for(int i = 0, num; i<size; i++) {
			System.out.print("¬ведите число дл€ " + i + " элемента массива: ");
			num = In.nextInt();
			if(num % 5 == 2) {
				arr[i] = num;
			}
			else {
				System.out.println("„исло не корректно,значени€ будет равно 0");
			}
		}
		for(int a : arr) {
			System.out.print(a + ", ");
		}
	}

}
