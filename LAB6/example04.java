/*
 * Напишите программу, в которой описан статический метод для вычисления двойного факториала числа, 
 * переданного аргументом методу. 
 * По определению, двойной факториал числа п (обозначается как n!!)
 * — это произведение через одно всех чисел, не больших числа п. 
 * То есть n!! = п * (n - 2) * (п - 4)* ... 
 * (последний множитель равен 1 для нечетного п и равен 2 для четного n). 
 * Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15. 
 * Предложите версию метода без рекурсии и с рекурсией.
 */

/*
class Factorial {
	11 это рекурсивный метод
	int fact(int n) {
		int result;
		if(n==l) return 1;
		result = fact(n-1) * n;
		return result;
 */
public class example04 {

	public static void main(String[] args) {
		MyClass4.version_one(5);
		System.out.println(MyClass4.version_two(6));

	}

}


class MyClass4{
	public static void version_one(int a) {
		int sum = 1;
		for(;a>0;a-=2) {
			sum *=a;
		}
		System.out.println(sum);
	}
	public static int version_two(int a) {
		int sum;
		if(a <= 1)
			return 1;
		sum = version_two(a-2) * a;
		return sum;
	}
}