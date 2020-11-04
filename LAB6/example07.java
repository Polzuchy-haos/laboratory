/*
 * Ќапишите программу со статическим методом, аргументом которому передастс€ символьный массив, 
 * а результатом возвращаетс€ ссылка на целочисленным массив, 
 * состо€щий из кодов символов из массива- аргумента.
 */
public class example07 {

	public static void main(String[] args) {
		char mem[] = "Hello World".toCharArray();
		System.out.println(mem);
		int a[] = MyClass7.str(mem);
		for(int x : a) {
			System.out.print(x + " ");
		}

	}

}

class MyClass7{
	
	public static int[] str(char a[]) {
		int b[] = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			b[i] = (int)a[i];
		}
		return b;
	}
}