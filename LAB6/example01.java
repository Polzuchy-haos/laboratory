/*
 * 1. Напишите программу с классом, в котором есть два поля: символьное и текстовое. 
 * В классе должен быть перегруженный метод для присваивания значений полям. 
 * Если метод вызывается с символьным аргументом, то соответствующее значение присваивается символьному полю. 
 * Если метод вызывается с текстовым аргументом, то он определяет значение текстового поля. 
 * Методу аргументом также может передаваться символьный массив. 
 * Если массив состоит из одного элемента, то он определяет значение символьного поля. 
 * В противном случае (если в массиве больше одного элемента) 
 * из символов массива формируется текстовая строка и присваивается значением текстовому полю.
 */
public class example01 {

	public static void main(String[] args) {
		MyClass1 bib = new MyClass1();
		bib.write("helo".toCharArray());
		bib.print();

	}

}


class MyClass1{
	
	private char _char;
	private String str;
	
	
	public void write(char a) {
		_char = a;
	}
	public void write(String a) {
		str = a;
	}
	public void write(char a[]) {
		System.out.println(a);
		if(a.length == 0)
			return;
		if(a.length == 1)
			_char = a[0];
		else
			str = String.valueOf(a);
	}
	public void print() {
		System.out.println("Char: " + _char);
		System.out.println("String:" + str);
	}
	
}