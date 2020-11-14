/*
 * �������� ���������, � ������� ���� ���������� � ��������� ��������� �����, 
 * ������������� � ��������� ���������� � ��� ������������� ����� toString (). 
 * �� ������ ����������� ����� ������������ ��������� ��������. 
 * � ���� ���������� ��� ���� ��������� ��������� ����. 
 * ����� �������� ������ ����� ������ ������������ � ����� � ����� ���������� �����������, 
 * � ��� � ��� ������ ���� ������������� ����� toString ().
 *  � ����� ������� ����� toString () ���������������� ���, 
 *  ��� �� ���������� ������ � ��������� ������ � �������� ���������� ���� ��� ��������� �����.
 */
public class example01 {

	public static void main(String[] args) {
		F1 ex1 = new F1("��� ������ ��������");
		System.out.println(ex1.toString());
		
		F2 ex2 = new F2("��� ������ ���������");
		System.out.println(ex2.toString());
		
		F2 ex3 = new F2("��� ������ ���������", "������ ������");
		System.out.println(ex3.toString());

	}

}

class F1{
	private String ACDC;
	
	public F1(String a){
		ACDC = a;
	}
	
	public String toString() {
		return "��� ������ ������ F1: " + ACDC;
	}
	
}

class F2 extends F1{
	
	private String II;
	private String III;
	
	F2(String a) {
		super(null);
		this.II = a;
	}
	
	F2(String a, String b) {
		super(null);
		this.II = a;
		this.III = b;
	}
	
	public String toString() {
		if(this.III == null) {
			return "��� ������ ������ F2: " + II ;
		}
		else
			return "��� ������ ������ F2: " + II + " " + III  ;
		
	}
	
}
