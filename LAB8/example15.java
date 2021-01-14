import java.util.Scanner;
public class example15 {

	public static void main(String[] args) {

		MyList ex = new MyList();
		ex.createTail(1, 2, 3, 4, 5);
		ex.AddFirst(9);
		ex.AddLast(865);
		ex.Insert(999,2 );
		System.out.println(ex.toString());
		ex.RemoveFirst();
		ex.RemoveLast();
		ex.Remove(3);		
		System.out.println(ex.toString());
//-------------------------------------------------------------		
		MyList exRec = new MyList();
//		exRec.createHeadRec(5, 6 ,7 ,58 ,6,0);
		exRec.createTailRec(10,9,8,7,6,5,4,3,2,1,0);
		System.out.println(exRec.toString());
		System.out.println(exRec.toStringRec(exRec.head));
//-------------------------------------------------------------
	}
}

class MyList{
	
	public static Scanner in = new Scanner(System.in);
	
	public MyList head; 
	public MyList tail;
	public int num;
	public MyList next;
	
	MyList(){
		
	}
	
	
	MyList(int _num, MyList _next){
		num = _num;
		next = _next;
	}
	
	void createHead(int ...len) {
		head = new MyList(len[0], null);
		tail = head;
		for(int x = 1; x<len.length; x++) {
			tail.next = new MyList(len[x], null);
			tail = tail.next;
		}


	}
	void createTail(int ...len) {
		tail = new MyList(len[0],null);
		head = tail;
		for(int x = 1 ; x<len.length;x++) {
			MyList buf = head;
			head = new MyList(len[x], buf);
			
		}
	}
	
	public String toString() {
		MyList ref = head; // ref – рабочая переменная для текущего узла
		String end = ref.num + " ";
		ref = ref.next;
		while (ref != null) { 
			end += ref.num + " "; 
			ref = ref.next;
		}
		return end;
	}
	
	void AddFirst(int x) {
		MyList buf = head;
		head = new MyList(x,buf);
		}
	
	void AddLast(int x){
		tail.next = new MyList(x,null);
		tail = tail.next;
	}
	
	void Insert(int x, int num){
		if(num == 0) {
			this.AddFirst(x);
		}
		MyList ref = head;
		MyList buf = null;
		for(int i = 0; i <= num; i++) {
			if(num-1 == i)
				buf = ref;
			ref = ref.next;
		}
		
		buf.next = new MyList(x, ref);
		
		
	}
	
	void RemoveFirst() {
		head = head.next;
	}
	
	void RemoveLast() {
		MyList ref = head;
		while (ref != null) {
			if(ref.next.next == null) {
				ref.next = null;
				return;
			}
			ref = ref.next;
		}
	}
	void Remove(int num) {
		if(num == 0) {
			this.RemoveFirst();
		}
		MyList ref = head;
		MyList buf = null;
		for(int i = 0; i <= num; i++) {
			if(num-1 == i)
				buf = ref;
			ref = ref.next;
		}
		buf.next = ref.next;
	}
	
	
//-------------------------------------------------------------------
	
	void createHeadRec(int ...len){
		head = new MyList(len[0], null);
		tail = head;
		int []buff = new int[len.length-1];
		for(int i = 1; i<buff.length; i++) {
			buff[i-1] = len[i];
		}
		rechead(tail,buff.length,buff);

		/*
		 * tail.next = new MyList(len[x], null);
		 * tail = tail.next;
		 */
	}
	
	private int rechead(MyList n, int len, int []b) {
		if(len == 1) {
			n.next = new MyList(b[b.length-len],null);
			n = n.next;
			return 0;
		}
		n.next = new MyList(b[b.length-len],null);
		n = n.next;
		
		
		return rechead(n,len-1,b);
	}
	
	void createTailRec(int ...len) {
		tail = new MyList(len[0],null);
		head = tail;
		int []buff = new int[len.length-1];
		for(int i = 1; i<buff.length; i++) {
			buff[i-1] = len[i];
		}
		rectail(head,buff.length,buff);
	}
	
	private int rectail(MyList n, int len, int []b) {
		if(len == 1) {
			MyList buf = head;
			head = new MyList(b[b.length-len],buf);
			return 0;
		}
		MyList buf = head;
		head = new MyList(b[b.length-len],buf);
		return rectail(n,len-1,b);
	}
	
	String toStringRec(MyList h) {
		if(h.next == null) return h.num + " ";
		String end = h.num + " ";
		return end + toStringRec(h.next);
	}
}