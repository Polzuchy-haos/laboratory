/*
 * �������� ���������, � ������� ������������ ������� ������������ �� ���� �������. 
 * � ������ ������ ���� �������� ���������� ����. �� ������ ������ ���������� �������� ��������� ����. 
 * � ������� ������ ���������� �������� ������������� ����. 
 * � ������ �� ������� ������ ���� �����������, ����������� ��������� ������ �� ������ �������� �����, 
 * ���������� ����������� ������������, � ����� ����������� �������� �����.
 */
public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class R1{
	public char bat;
	
	R1(char c){
		bat = c;
	}
	
	R1(R1 a){
		this.bat = a.bat;
	}
}

class R2 extends R1{
	R2(char c, String s) {
		super(c);
		str = s;
	}

	R2(R2 a){
		super(a);
		this.str = a.str;
	}
	
	public String str;
	
}

class R3 extends R2{
	R3(char c, String s, int n) {
		super(c, s);
		num = n;
	}
	
	R3(R3 a){
		super(a);
		this.num = a.num;
	}

	public int num;
}
