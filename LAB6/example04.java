/*
 * �������� ���������, � ������� ������ ����������� ����� ��� ���������� �������� ���������� �����, 
 * ����������� ���������� ������. 
 * �� �����������, ������� ��������� ����� � (������������ ��� n!!)
 * � ��� ������������ ����� ���� ���� �����, �� ������� ����� �. 
 * �� ���� n!! = � * (n - 2) * (� - 4)* ... 
 * (��������� ��������� ����� 1 ��� ��������� � � ����� 2 ��� ������� n). 
 * ��������, 6!! = 6 � 4 � 2 = 48 � 5!! = 5 � 3 � 1 = 15. 
 * ���������� ������ ������ ��� �������� � � ���������.
 */

/*
class Factorial {
	11 ��� ����������� �����
	int fact(int n) {
		int result;
		if(n==l) return 1;
		result = fact(n-1) * n;
		return result;
 */
public class example04 {

	public static void main(String[] args) {
		MyClass4.version_one(5);
		System.out.println(MyClass4.version_two(6));

	}

}


class MyClass4{
	public static void version_one(int a) {
		int sum = 1;
		for(;a>0;a-=2) {
			sum *=a;
		}
		System.out.println(sum);
	}
	public static int version_two(int a) {
		int sum;
		if(a <= 1)
			return 1;
		sum = version_two(a-2) * a;
		return sum;
	}
}