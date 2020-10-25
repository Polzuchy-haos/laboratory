import java.util.Scanner;

/*
 * 8. Напишите программу «Шифр Цезаря», которая зашифровывает
введенный текст. Используете кодовую таблицу символов. При запуске
программы в консоль необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ». Далее необходимо
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ».
 */
public class example08{
	
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.println("Введите текст для шифрования: ");
		String input = In.nextLine();
		System.out.println("Введите ключ для шифрования: ");
		int KEY = In.nextInt();
		String converts = CD(input,KEY);
		System.out.println(converts);
		System.out.println("Хотите расшифровать: (1/0)");
		int dec = In.nextInt();
		if(dec == 1)
			System.out.println(DC(converts,KEY));
		if(dec == 0)
			System.out.println("До свидание");
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