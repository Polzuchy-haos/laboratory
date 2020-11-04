/*
 * Напишите программу со статическим методом, 
 * аргументом которому передается произвольное количество целочисленных аргументов. 
 * Результатом метод возвращает массив из двух элементов: 
 * это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
 */
public class example10 {

	public static void main(String[] args) {
		int ora[] = {0,1,2,3,4,5,6,7,8,9,10,11};
		int d[] = MyClass10.MinMax(ora);
		System.out.println(d[0] + " " + d[1]);
	}

}

class MyClass10{
	public static int[] MinMax(int ...v) {
		int max = v[0],min = v[0];
		for(int x : v) {
			if(max<=x)
				max = x;
			if(min>=x)
				min = x;
		}
		int mem[] = new int[2];
		mem[0] = min; mem[1] = max;
		return mem;
	}
}