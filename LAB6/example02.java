/*
 * Напишите программу с классом, 
 * в котором есть закрытое статическое целочисленное поле с начальным нулевым значением. 
 * В классе должен быть описан статический метод, 
 * при вызове которого отображается текущее значение статического поля, 
 * после чего значение поля увеличивается на единицу.
 * 
 */
public class example02 {

	public static void main(String[] args) {
		MyClass2 ale = new MyClass2();
		MyClass2 not = new MyClass2();
		MyClass2 life = new MyClass2();
		
		ale.print();
		not.print();
		life.print();
		ale.print();

	}

}

class MyClass2{
	
	private static int  mem = 0;
	
	public static void print() {
		System.out.println(mem);
		mem++;
	}
	
}
