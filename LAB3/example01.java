import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		System.out.print("������� ���� ������: ");
		int num = In.nextInt();
		switch(num){
			case 1:
				System.out.println("�����������");
			break;
			case 2:
				System.out.println("�������");
			break;
			case 3:
				System.out.println("�����");
			break;
			case 4:
				System.out.println("�������");
			break;
			case 5:
				System.out.println("�������");
			break;
			case 6:
				System.out.println("�������");
			break;
			case 7:
				System.out.println("�����������");
			break;
			default:
				System.out.println("����������� �����");
			break;
		}

	}

}
