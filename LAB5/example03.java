/*
 * Ќапишите программу с классом, у которого есть два целочисленных пол€. 
 * ¬ классе должны быть описаны конструкторы, 
 * позвол€ющие создавать объекты без передачи аргументов, 
 * с передачей одного аргумента и с передачей двух аргументов.
 */
public class example03 {

	public static void main(String[] args) {
		MyClass3 zero = new MyClass3();
		MyClass3 one = new MyClass3(68);
		MyClass3 two = new MyClass3(15, 48);
		
		zero.print();
		one.print();
		two.print();

	}

}

class MyClass3{
	private int A1;
	private int A2;

	public MyClass3() {
		A1 = 0;
		A2 = 0;
	}
	public MyClass3(int a) {
		A1 = a;
		A2 = 0;
	}
	public MyClass3(int a, int b) {
		A1 = a;
		A2 = b;
	}
	
	public void print() {
		System.out.println(A1 + " " + A2);
	}
}
