import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		
		System.out.print("Введите названия дня недели: ");
		
		String str = In.nextLine();
		
		switch(str) {
			case "Понедельник":
				System.out.println(1);
			break;
			case "Вторник":
				System.out.println(2);
			break;	
			case "Среда":
				System.out.println(3);
			break;	
			case "Четверг":
				System.out.println(4);
			break;	
			case "Пятница":
				System.out.println(5);
			break;	
			case "Суббота":
				System.out.println(6);
			break;	
			case "Воскресенье":
				System.out.println(7);
			break;	
			default:
				System.out.println("Некоректное название");
			break;	
		}
		

	}

}
