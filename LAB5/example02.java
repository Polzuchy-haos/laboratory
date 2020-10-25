/*
 * Ќапишите программу с классом, у которого есть два символьных пол€ и метод. 
 * ќн возвращает результат, и у него нет аргументов. 
 * ѕри вызове метод выводит в консольное окно все символы из кодовой таблицы, 
 * которые наход€тс€ Ђмеждуї символами, €вл€ющимис€ значени€ми полей объекта (из которого вызываетс€ метод). 
 * Ќапример, если пол€м объекта присвоены значени€ СAТ и СDТ, 
 * то при вызове метода в консольное окно должны выводитьс€ все символы от СAТ до СDТ включительно.
 */

public class example02 {

	public static void main(String[] args) {
		MyClass2 bib = new MyClass2('a','l');
		bib.print();

	}

}

class MyClass2{
	
	public MyClass2(char a, char b){
		str1 = a;
		str2 = b;
	}
	
	private char str1;
	private char str2;
	
	public void print() {
		int a, b;
		b = str2;
		for(a = str1; a<=b; a++) {
			System.out.print((char)a +" ");
		}
		System.out.println("");
	}
}
