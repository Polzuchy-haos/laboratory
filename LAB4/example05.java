import java.util.Random;

/*
 5. �������� ���������, � ������� ��������� ���������
������������� ������. �� ����������� ���������� �������. ����� � ����
������� ����� � ������� �������� �������: ������ ������ ���������� ������
��������, ������ ������ ����������� ������ �������� � ��� �����. ��������,
���� �������� ������ ������� �� 3 ����� � 5 ��������, �� � ����� ��������
������ �� 5 ����� � 3 ��������.
 */

public class example05 {

	public static void main(String[] args) {
		 
		int myar[][] = new int[3][5];
		Random rand = new Random();
		for(int i = 0; i<3; i++) {
			for(int i2 = 0; i2<5; i2++) {
				myar[i][i2] = rand.nextInt(500);
			}
		}
		
		for(int x[] : myar) {
			for(int y : x) {
				System.out.print(y + " ");
				
			}
			System.out.println("");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int clon[][] = new int[5][3];
		
		for(int i = 0; i<5; i++) {
			for(int i2 = 0; i2<3; i2++) {
				clon[i][i2] = myar[i2][i];
			}
		}
		
		for(int x[] : clon) {
			for(int y : x) {
				System.out.print(y + " ");
				
			}
			System.out.println("");
		}

	}

}
