import java.util.Scanner;
public class if_20150805_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�O�_���T���Ϊ��X�k�T���(a<=b<=c)");
		System.out.println("�п�J���a");
		int a = scn.nextInt();
		System.out.println("�п�J���b");
		int b = scn.nextInt();
		System.out.println("�п�J���c");
		int c = scn.nextInt();
		if(a<=b && b<=c && a+b>c){
			System.out.println("�O");
		}else{
			System.out.println("���O");
		}
		
	}

}
