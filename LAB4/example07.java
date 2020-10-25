/*
7. Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.
*/
public class example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myarr[][] = new int[10][10];
		
		for(int i = 0; i<10; i++) {
			if(i%2==1) {
				for(int i2 = 9; i2>=0; i2--) {
					myarr[i][i2] = 1;
				}
			}
			else {
				for(int i2 = 0; i2<10; i2++) {
					myarr[i][i2] = 1;
				}
			}
			
			for(int x[] : myarr) {
				for(int y : x) {
					System.out.print(y + " ");
					
				}
				System.out.println("");
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
	}

}
