import java.util.Scanner;

public class example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.print("������� ������ �������: ");
		int size = In.nextInt();
		int arr[] = new int[size];
		for(int i = 0, num; i<size; i++) {
			System.out.print("������� ����� ��� " + i + " �������� �������: ");
			num = In.nextInt();
			if(num % 5 == 2) {
				arr[i] = num;
			}
			else {
				System.out.println("����� �� ���������,�������� ����� ����� 0");
			}
		}
		for(int a : arr) {
			System.out.print(a + ", ");
		}
	}

}
