/*
 * 1. �������� ��������� � �������, � ������� ���� �������� ���������� ���� � ��� �������� ������.
 * ���� �� ������� ��������� ��������� �������� ����. ��� ���� ����� ��� ������ ���������� ����������� ��� �������.
 * ������ ����� ��������� ������� � ���������� ���� ������ (�������� ����) � ��� ���.
 */


public class example01 {

	public static void main(String[] args) {
		Myclass1 bib = new Myclass1();
		bib.write('A');
		bib.print();
		

	}

}


class Myclass1{
	
	private char str1;
	
	void write(char m) {
		str1 = m;
	}
	
	int num(){
		int i = str1;
		return i;
		
	}
	
	void print() {
		System.out.println("������: '" + str1 + "' ��� ��� ����� " + this.num());
	}
	
	
	
}
