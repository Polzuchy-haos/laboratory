import java.util.Arrays; // ����� ��� ����������� ������ Arrays, ��� ���������� ��������� ������� �� �����������
import java.util.Random; // ����� ��� ����������� ������ Random � �������� ������� ��� ��������� ���������� �����
import java.util.Scanner; // ����� ��� ����������� ������ Scanner, ��� ���������� � ������� ��������
public class example10 {
	 public static void main(String[] args) {
		 Scanner id = new Scanner(System.in); // �������� ������� ������ Scanner ��� ���������� ����� ��������� � �������
		 System.out.println("������� ������ �������"); // ��������� ������������ "��� ������� � ���������"
		 
		 int Size = id.nextInt(); // ������ � ���������� Size (������ ��� ���� ����� ������ ������ �������)
		 //�������� ���������� � �������
		 System.out.println("������ ������� ����� "+ Size); // ��������� ������������ "��� ������� � ���������"
		 int[] nums = new int[Size]; // �������� ������� � �������� �������� �� �������
		 Random random = new Random(); // �������� ������� ������ Random ��� ��������� "����������" �����
		 for (int i = 0 ; i < nums.length ; i++ ){
			 nums[i] = random.nextInt(200); // ���������� i-���� �������� ������� ���������� ��������
			 System.out.println("������� ������� ["+i+"] = " + nums[i]); // ��������� ������������ "��� ������� � ���������"
		 }
		 Arrays.sort(nums); // ���������� ������� �� ����������� ��� ���������
		 System.out.println("����������� ���������� ������� � �������� �������"); // ��������� ������������ "��� ������� � ���������"
		 int clon[] = new int[nums.length];
		 
		 for(int i = 0; i<nums.length; i++)
			 clon[i] = nums[i];
		 
		 for (int i = 0 ; i < nums.length ; i++ ){
			 nums[i] = clon[nums.length-i-1];
		 }
		 for(int x : nums)
			 System.out.print(x + " ");
	 }
}