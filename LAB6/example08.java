/*
 * �������� ��������� �� ����������� �������, ���������� �������� ���������� ������������� ������, 
 * � ����������� ������������ ������� �������� ��� ��������� ������� (����� �������� ���������, 
 * �������� �� ���������� ��������� � �������).
 */
public class example08 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(MyClass8.med(a));

	}

}

class MyClass8{
	
	public static int med(int a[]) {
		int sum = 0;
		for(int x : a)
			sum +=x;
		sum /= a.length;
		return sum;
	}
}