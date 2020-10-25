
public class example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[20][30];
		for(int A1 = 0; A1<20; A1++) {
			for(int A2 = 0;A2<30 ; A2++) {
				arr[A1][A2] = 2;
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
