
public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[20][30];
		for(int A1 = 0; A1<20; A1++) {
			int i = 0;
			while(i++<A1) {
				arr[A1][i] = 1;	
			}
			
			
		}
		for(int A1 = 0; A1<20; A1++) {
			for(int A2 = 0;A2<30 ; A2++) {
				System.out.print(arr[A1][A2]);
			}
			System.out.println("");
		}
		
	}

}
