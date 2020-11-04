/*
 * 1. �������� ��������� � �������, � ������� ���� ��� ����: ���������� � ���������. 
 * � ������ ������ ���� ������������� ����� ��� ������������ �������� �����. 
 * ���� ����� ���������� � ���������� ����������, �� ��������������� �������� ������������� ����������� ����. 
 * ���� ����� ���������� � ��������� ����������, �� �� ���������� �������� ���������� ����. 
 * ������ ���������� ����� ����� ������������ ���������� ������. 
 * ���� ������ ������� �� ������ ��������, �� �� ���������� �������� ����������� ����. 
 * � ��������� ������ (���� � ������� ������ ������ ��������) 
 * �� �������� ������� ����������� ��������� ������ � ������������� ��������� ���������� ����.
 */
public class example01 {

	public static void main(String[] args) {
		MyClass1 bib = new MyClass1();
		bib.write("helo".toCharArray());
		bib.print();

	}

}


class MyClass1{
	
	private char _char;
	private String str;
	
	
	public void write(char a) {
		_char = a;
	}
	public void write(String a) {
		str = a;
	}
	public void write(char a[]) {
		System.out.println(a);
		if(a.length == 0)
			return;
		if(a.length == 1)
			_char = a[0];
		else
			str = String.valueOf(a);
	}
	public void print() {
		System.out.println("Char: " + _char);
		System.out.println("String:" + str);
	}
	
}