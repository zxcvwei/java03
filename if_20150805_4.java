import java.util.Scanner;
public class if_20150805_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�H�T����P�_����.�U��.�w���T����");
		System.out.println("(a<=b<=c)");
		System.out.println("�п�J���a");
		float a = scn.nextFloat();
		System.out.println("�п�J���b");
		float b = scn.nextFloat();
		System.out.println("�п�J���c");
		float c = scn.nextFloat();
		if(a*a+b*b==c*c){
			System.out.println("�����T����");
		}else{
			if(a*a+b*b<c*c){
				System.out.println("�w���T����");
			}else{
				if(a*a+b*b>c*c){
					System.out.println("�U���T����");
				}
			}
		}
			
		
		
		
	}

}
