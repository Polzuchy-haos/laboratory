/*
 * �������� ��������� �� ����������� �������, 
 * ������� ����������� ����� ��������� ����������� ����� 12 + 22 + 32 + ... + �2. 
 * ����� � ���������� ���������� ������. 
 * ���������� ������ ������ � ��������� � ��� ��������. 
 * ��� �������� ���������� ����� ������������ ������� 12 + 22 +32+�+n2=(n+l) (2n + 1)/6
 */
public class example05 {

	public static void main(String[] args) {
		System.out.println(MyClass5.one(4));
		System.out.println(MyClass5.two(4));
	}

}

class MyClass5{
	public static int one(int a){
		int result = 0;
		for(int i = 1; i<=a; i++) {
			result += (i * i);
		}
		return result;
	}
	
	public static int two(int a) {
		int result = 0;
		if(a == 1)
			return 1;
		result = two(a-1) + (a * a);
		return result;
	}
}