import java.util.Scanner;
public class if_20150805_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J��妨�Z");
		float c = scn.nextFloat();
		System.out.println("�п�J�^�妨�Z");
		float en = scn.nextFloat();
		System.out.println("�п�J�ƾǦ��Z");
		float m = scn.nextFloat();
		float total = c+en+m;
		System.out.println("�п�J���Z�Ӽ�");
		int num = scn.nextInt();
		float average = (float)(total/num);
		System.out.println("�`�M="+total);
		System.out.println("����="+average);
		
	}

}
