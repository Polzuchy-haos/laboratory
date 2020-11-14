/*
 * Ќапишите программу, в которой есть суперкласс с защищенным текстовым полем, 
 * конструктор с текстовым параметром и метод, 
 * при вызове которого в консольном окне отображаетс€ название класса и значение пол€. 
 * Ќа основе суперкласса создаютс€ два подкласса (оба на основе одного и того же суперкласса). 
 * ¬ одном из классов по€вл€етс€ защищенное целочисленное поле, 
 * там есть конструктор с двум€ параметрами и переопределен метод дл€ отображени€ значений полей объекта 
 * и названи€ класса. ¬о втором подклассе по€вл€етс€ защищенное символьное поле, 
 * конструктор с двум€ параметрами и переопределен метод, 
 * отображающий в консоли название класса и значени€ полей. 
 * ¬ главном методе создайте объекты каждого из классов. 
 * ѕроверьте работу метода, отображающего значени€ полей объектов, дл€ каждого из объектов. 
 * ¬ызовите этот же метод через объектную переменную суперкласса, 
 * котора€ ссылаетс€ на объект производного класса.
 */
public class example05 {

	public static void main(String[] args) {
		X1 ex1 = new X1("bib");
		X12 ex2 = new X12("alo", 'c');
		X13 ex3 = new X13("star", 300);
		
		ex1.print();
		ex2.print();
		ex3.print();
		
		X1 ex4 = ex3;
		
		ex4.print();
		
		ex4 = ex2;
	
		ex4.print();

	}

}


class X1{
	protected String gaf;
	
	X1(String g){
		gaf = g;
	}
	
	void print() {
		System.out.println("CLASS X1: " + gaf);
	}
	
}

class X12 extends X1{

	protected char bib;
	
	X12(String g, char b) {
		super(g);
		
		// TODO Auto-generated constructor stub
	}
	
	void print() {
		System.out.println("CLASS X12: " + gaf + bib);
	}
	
}

class X13 extends X1{

	protected int num;
	
	X13(String g, int i) {
		super(g);
		num = i;
		// TODO Auto-generated constructor stub
	}
	
	void print() {
		System.out.println("CLASS X13: " + gaf + num);
	}
	
}