/*
 * �������� ��������� �� ����������� �������, ���������� �������� ���������� ���������� ���������� ������. 
 * � ���������� ������ ������ �������� ������� ������� �������� �������:
 * ������ � � ���������, ������ � � ������������� � ��� �����.
 */
public class example09 {

	public static void main(String[] args) {
		char a[] = {'a', 'b', 'c','d'};
		a = MyClass9.strl(a);
		System.out.println(a);

	}

}

class MyClass9{
	
	public static char[] strl(char b[]) {
		int len = b.length;
		char []array = new char[len];
		for(int i = 0; i<len; i++) {
			array[i] = b[len-i-1];
		}
		
		
		return array;
		
	}
}
