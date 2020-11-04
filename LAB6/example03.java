/*
 * 3. Напишите программу с классом, в котором есть статические методы,
 * которым можно передавать произвольное количество целочисленных аргументов (или целочисленный массив). 
 * Методы, на основании переданных аргументов или массива, позволяют вычислить: наибольшее значение, 
 * наименьшее значение, а также среднее значение из набора чисел.
 */
public class example03 {

	public static void main(String[] args) {
		int a = MyClass3.medium(123,158,123,68,52,3,1,123,88513);
		System.out.println(a);
	}
}	

class MyClass3{
	public static int HIGH(int ...v) {
		int h = 0;
		for(int x : v) {
			if(x>h)
				h=x;
		}
		return h;
		
	}
	public static int LOW(int ...v) {
		int l = 0;
		for(int x : v) {
			if(x<l)
				l=x;
		}
		return l;
		
	}
	public static int medium(int ...v) {
		int sum = 0 ,i = 0;
		for(int x : v) {
			sum +=x;
			i++;
		}
		sum/=i;
		return sum;
		
	}
}
