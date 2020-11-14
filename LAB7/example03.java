/*
 * �������� ���������, � ������� �� ������ ����������� ��������� ��������, 
 * � �� ������ ����� ��������� ��������� ��� ���� �������� (������� ������������ �� ���� �������). 
 * � ������ ����������� ���� �������� ������������� ����, 
 * ����� � ����� ���������� ��� ������������ �������� ���� � ����������� � ����� ����������. 
 * �� ������ ������ ���������� �������� ���������� ����, 
 * ����� � ����� ����������� ��� ������������ �������� ����� 
 * (���������� ������ �� �����������) � ����������� � ����� �����������. 
 * � ������� ������ ���������� �������� ��������� ����, 
 * ����� � ����� ����������� ��� ������������ �������� ����� 
 * (���������� ������ �� �����������) � ����������� � ����� �����������. 
 * ��� ������� ������ ���������� ����� toString () ���, 
 * ����� �� ��������� ������ � ��������� ������ � ���������� ���� ����� �������.
 */

public class example03 {

	public static void main(String[] args) {
		E1 ex1 = new E1(300);
		E2 ex2 = new E2(500, 's');
		E3 ex3 = new E3(1230, 'e', "help");
		
		
		System.out.println(ex1.toString());
		System.out.println(ex2.toString());
		System.out.println(ex3.toString());

	}

}

class E1{
	
	public int num;
	
	E1(int i){
		num = i;
	}
	
	void set(int i) {
		num = i;
	}
	
	public String toString() {
		
		String s = "��� ����� �1 � ���������� int = " + num;
		return s;		
	}
	
}

class E2 extends E1{
	
	public char bat;
	
	
	void set(int i, char a) {
		bat = a;
		num = i;
	}
	
	E2(int i, char a){
		super(i);
		bat = a;
	}
	
	public String toString() {
		
		String s = "��� ����� �2 � ���������� int = " + num + " char = " + bat;
		return s;		
	}
}

class E3 extends E2{
	
	E3(int i, char a, String s) {
		super(i, a);
		str = s;
	}

	public String str;
	
	void set(int i, char a, String s) {
		bat = a;
		num = i;
		str = s;
	}
	
	public String toString() {
		
		String s = "��� ����� �3 � ���������� int = " + num + " char = " + bat + " String = " + str;
		return s;		
	}
	
}
