import java.util.Scanner;

/*
 * 8. �������� ��������� ����� �������, ������� �������������
��������� �����. ����������� ������� ������� ��������. ��� �������
��������� � ������� ���������� ������� ���������: �������� ����� ���
�����������, ����� ����� ������, ���������� ���������: �������� �����.
����� ���� ��� ������� ��� ������, ���������� ������� ���������������
������ � ���������� ������ ����� �������������� : �. ����� ����������
������ ������ ������������: ���������� �������� ��������������? (y/n)�,
���� ������������ ������ �y�, ����� ��������� �������� ��������������.
���� ������������ ������ �n�, ���� ��������� ������� ��������� ���
��������!�. ���� ������������ ������ ���-�� ������, �������� �� �y� ��� �n�,
�� ��������� ��� ������� ���������: �������� ���������� �����.
 */
public class example08{
	
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("������� ����� ��� ����������: ");
		String input = In.nextLine();
		System.out.println("������� ���� ��� ����������: ");
		int KEY = In.nextInt();
		String converts = CD(input,KEY);
		System.out.println(converts);
		System.out.println("������ ������������: (1/0)");
		int dec = In.nextInt();
		if(dec == 1)
			System.out.println(DC(converts,KEY));
		if(dec == 0)
			System.out.println("�� ��������");
	}
	
	public static String CD(String Input_text, int key) {
		char text[] = Input_text.toCharArray();
		int convert[] = new int[text.length];
		for(int i = 0; i<convert.length; i++){
			convert[i] = text[i] + key;
		}
		for(int i = 0; i<text.length; i++){
			text[i] = (char) convert[i];
		}
		
		return new String(text);
	}
	
	public static String DC(String Input_text, int key) {
		char text[] = Input_text.toCharArray();
		int convert[] = new int[text.length];
		for(int i = 0; i<convert.length; i++){
			convert[i] = text[i] - key;
		}
		for(int i = 0; i<text.length; i++){
			text[i] = (char) convert[i];
		}
		
		return new String(text);
	}
}