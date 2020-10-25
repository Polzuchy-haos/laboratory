import java.util.Scanner;

public class example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner In = new Scanner(System.in);
		
		System.out.print("¬ведите количетсво вводимых чисел: ");
		
		int i_end = In.nextInt(), i_begin = 0, In_num, Sum = 0;
		while(i_begin++<i_end) {
			System.out.print("¬ведите число: ");
			In_num = In.nextInt();
			if((In_num%5 ==2)||In_num%3 == 1) {
				Sum +=In_num;
			}
		}
		System.out.println("—умма равна: " + Sum);

	}

}
