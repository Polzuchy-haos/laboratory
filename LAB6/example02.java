/*
 * �������� ��������� � �������, 
 * � ������� ���� �������� ����������� ������������� ���� � ��������� ������� ���������. 
 * � ������ ������ ���� ������ ����������� �����, 
 * ��� ������ �������� ������������ ������� �������� ������������ ����, 
 * ����� ���� �������� ���� ������������� �� �������.
 * 
 */
public class example02 {

	public static void main(String[] args) {
		MyClass2 ale = new MyClass2();
		MyClass2 not = new MyClass2();
		MyClass2 life = new MyClass2();
		
		ale.print();
		not.print();
		life.print();
		ale.print();

	}

}

class MyClass2{
	
	private static int  mem = 0;
	
	public static void print() {
		System.out.println(mem);
		mem++;
	}
	
}
