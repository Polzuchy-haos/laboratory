/*
 * Ќапишите программу с классом, в котором есть два закрытых целочисленных пол€ (назовем их max и min). 
 * «начение пол€ max не может быть меньше значени€ пол€ min. 
 * «начени€ пол€м присваиваютс€ с помощью открытого метода. 
 * ћетод может вызыватьс€ с одним или двум€ целочисленными аргументами. 
 * ѕри вызове метода значени€ пол€м присваиваютс€ так: 
 * сравниваютс€ текущие значени€ полей и значени€ аргументов, переданных методу. 
 * —амое большое из значений присваиваетс€ полю max, 
 * а самое маленькое из значений присваиваетс€ полю min. 
 * ѕредусмотрите конструктор, который работает по тому же принципу, 
 * что и метод дл€ присваивани€ значений пол€м. 
 * ¬ классе также должен быть метод, отображающий в консольном окне значени€ полей объекта.
 */
public class example06 {

	public static void main(String[] args) {
		MyClass bib = new MyClass(-10, 36);
		bib.print();
		bib.write(-12);
		bib.print();
		bib.write(67, -88);
		bib.print();

	}

}

class MyClass{
	private int min;
	private int max;
	
	public MyClass(int a) {
		this.write(a);
	}
	public MyClass(int a,int b) {
		this.write(a,b);
	}
	
	public void write(int a) {
		int _min = min ,_max = max;
		if(a>=_max)	_max = a;
		if(a<=_min)	_min = a;
		max = _max; min = _min;
	}
	public void write(int a, int b) {
		int _min = min ,_max = max;
		if(a>=_max)	_max = a;
		if(b>=_max)	_max = b;
		if(a<=_min)	_min = a;
		if(b<=_min)	_min = b;
		max = _max; min = _min;
	}
	public void admin_write(int a, int b) {
		min = a;
		max = b;
	}
	public void print() {
		System.out.println(min + " " + max);
	}
}