/*
 * Напишите программу с классом, у которого есть символьное и целочисленное поле. 
 * В классе должны быть описаны версии конструктора с двумя аргументами 
 * (целое число и символ – определяют значения полей), а также с одним аргументом типа double. 
 * В последнем случае действительная часть аргумента определяет код символа (значение символьного поля), 
 * а дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля. 
 * Например, если аргументом передается число 65.1267, 
 * то значением символьного поля будет символ ‘A’ с годом 65, 
 * а целочисленное поле получит значение 12 (в дробной части учитываются только десятые и сотые).
 */
public class example04 {

	public static void main(String[] args) {
		MyClass4 zero = new MyClass4();
		MyClass4 one_1 = new MyClass4('c');
		MyClass4 one_2 = new MyClass4(52);
		MyClass4 two_1 = new MyClass4('c', 52);
		MyClass4 two_2 = new MyClass4(36,'t');
		MyClass4 dou = new MyClass4(65.5621);
		
		
		zero.print();
		one_1.print();
		one_2.print();
		two_1.print();
		two_2.print();
		dou.print();
	}

}

class MyClass4{
	
	private char str1;
	private int num1;
	
	MyClass4(){
		str1 = '\0';
		num1 = 0;
	}
	
	MyClass4(char a){
		str1 = a;
		num1 = 0;
	}
	MyClass4(int a){
		num1 = a;
		str1 = '\0';
	}
	MyClass4(char a, int b){
		str1 = a;
		num1 = b;
	}
	MyClass4(int a, char b){
		str1 = b;
		num1 = a;
	}
	MyClass4(double b){
		int a = (int) b;
		str1 = (char) a;
		b = (b-a)*100;
		num1 = (int) b;
		}
	public void print() {
		System.out.println(str1 + " " + num1);
	}
	
	
	
}
