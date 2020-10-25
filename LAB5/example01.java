/*
 * 1. Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
 * Один из методов позволяет присвоить значение полю. Еще один метод при вызове возвращает результатом код символа.
 * Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
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
		System.out.println("Символ: '" + str1 + "' его код равен " + this.num());
	}
	
	
	
}
