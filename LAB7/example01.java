/*
 * Напишите программу, в которой есть суперкласс с приватным текстовым полем, 
 * конструктором с текстовым параметром и где переопределен метод toString (). 
 * На основе суперкласса путем наследования создается подкласс. 
 * У него появляется еще одно приватное текстовое ноле. 
 * Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами, 
 * а еще в нем должен быть переопределен метод toString ().
 *  В обоих классах метод toString () переопределяется так, 
 *  что он возвращает строку с названием класса и значение текстового поля или текстовых полей.
 */
public class example01 {

	public static void main(String[] args) {
		F1 ex1 = new F1("Это первый экзепляр");
		System.out.println(ex1.toString());
		
		F2 ex2 = new F2("Это вторая экземпляр");
		System.out.println(ex2.toString());
		
		F2 ex3 = new F2("Это вторая экземпляр", "ТРетья строка");
		System.out.println(ex3.toString());

	}

}

class F1{
	private String ACDC;
	
	public F1(String a){
		ACDC = a;
	}
	
	public String toString() {
		return "Это строка класса F1: " + ACDC;
	}
	
}

class F2 extends F1{
	
	private String II;
	private String III;
	
	F2(String a) {
		super(null);
		this.II = a;
	}
	
	F2(String a, String b) {
		super(null);
		this.II = a;
		this.III = b;
	}
	
	public String toString() {
		if(this.III == null) {
			return "Это строка класса F2: " + II ;
		}
		else
			return "Это строка класса F2: " + II + " " + III  ;
		
	}
	
}
