import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		
		System.out.print("������� �������� ��� ������: ");
		
		String str = In.nextLine();
		
		switch(str) {
			case "�����������":
				System.out.println(1);
			break;
			case "�������":
				System.out.println(2);
			break;	
			case "�����":
				System.out.println(3);
			break;	
			case "�������":
				System.out.println(4);
			break;	
			case "�������":
				System.out.println(5);
			break;	
			case "�������":
				System.out.println(6);
			break;	
			case "�����������":
				System.out.println(7);
			break;	
			default:
				System.out.println("����������� ��������");
			break;	
		}
		

	}

}
