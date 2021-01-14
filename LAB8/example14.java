
public class example14 {
	
	public static void Head(){
		
		Bob head = new Bob(0,null);
		Bob tail = head;
		
		for (int i = 0; i < 9; i++) { 
			tail.next = new Bob(i+1, null);
			tail = tail.next; // указатель на созданный элемент запоминается
		}
		
		Bob ref = head; // ref – рабочая переменная для текущего узла
		while (ref != null) { 
			System.out.print(" " + ref.num); 
			ref = ref.next;
		}
		
	}
	
	public static void Tail() {

		Bob tail = new Bob(9,null);
		Bob head = tail;
		
		for (int i = 9; i > 0; i--) { 
			head.next = new Bob(i-1, null);
			head = head.next; // указатель на созданный элемент запоминается
		}
		Bob ref = tail; // ref – рабочая переменная для текущего узла
		while (ref != null) { 
			System.out.print(" " + ref.num); 
			ref = ref.next;
		}
		
		
	}

	public static void main(String[] args) {
		
		Head();
		System.out.println("\n-----------------------------------------------------------");
		Tail();
		
	}

}

class Bob{
	public int num;
	public Bob next;
	
	Bob(int x, Bob n){
		this.num = x;
		this.next = n;
	}
}
