/*
 * �������� ��������� � �������, � �������� ���� �������� ������������� ����. 
 * �������� ���� ������������� � ������� ��������� ������. 
 * ������ ���������� ����� ������������ ����� �����, 
 * � ����� ����� ����� ���������� ��� ����������. 
 * ���� ������ ���������� ��� ����������, �� ���� �������� ������� ��������. 
 * ���� ����� ���������� � ������������� ����������, �� ��� �������� ������������� ����. 
 * ������ ���� ���������� ���������� ������ �������� ��������� 100, �� ��������� ���� ������������� ����� 100. 
 * ������������� � ������ �����������, 
 * ������� �������� �� ���� �� �������� ��� � ����� ��� ������������ �������� ����. 
 * ����� � ������ ������ ���� �����, ����������� ��������� �������� ����.
 */
public class example05 {

	public static void main(String[] args) {
		
		MyClass5 zero_0 = new MyClass5();
		MyClass5 zero_1 = new MyClass5();
		MyClass5 one_1 = new MyClass5(76);
		MyClass5 one_11 = new MyClass5(300);
		
		zero_0.print(); zero_1.write(); zero_0.print();
		zero_1.print(); zero_1.write(35); zero_1.print();
		
		one_1.print();
		one_11.print();
	}

}

class MyClass5{
	private int i_num1;
	
	public MyClass5() {
		i_num1 = 0;
	}
	
	public MyClass5(int a) {
		this.write(a);
	}
	
	public void write(int a) {
		if(a > 100)
			i_num1 = 100;
		else 
			i_num1 = a;
	}
	public void write() {
		i_num1 = 0;
	}
	
	public boolean cheak() {
		if(i_num1 > 100)
			return false;
		else return true;
	}
	public void print() {
		System.out.println(i_num1);
	}
	
}