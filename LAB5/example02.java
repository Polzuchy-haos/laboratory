/*
 * �������� ��������� � �������, � �������� ���� ��� ���������� ���� � �����. 
 * �� ���������� ���������, � � ���� ��� ����������. 
 * ��� ������ ����� ������� � ���������� ���� ��� ������� �� ������� �������, 
 * ������� ��������� ������ ���������, ����������� ���������� ����� ������� (�� �������� ���������� �����). 
 * ��������, ���� ����� ������� ��������� �������� �A� � �D�, 
 * �� ��� ������ ������ � ���������� ���� ������ ���������� ��� ������� �� �A� �� �D� ������������.
 */

public class example02 {

	public static void main(String[] args) {
		MyClass2 bib = new MyClass2('a','l');
		bib.print();

	}

}

class MyClass2{
	
	public MyClass2(char a, char b){
		str1 = a;
		str2 = b;
	}
	
	private char str1;
	private char str2;
	
	public void print() {
		int a, b;
		b = str2;
		for(a = str1; a<=b; a++) {
			System.out.print((char)a +" ");
		}
		System.out.println("");
	}
}
