import java.util.Scanner;
public class if_20150805_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("以三邊長判斷直角.銳角.鈍角三角形");
		System.out.println("(a<=b<=c)");
		System.out.println("請輸入邊長a");
		float a = scn.nextFloat();
		System.out.println("請輸入邊長b");
		float b = scn.nextFloat();
		System.out.println("請輸入邊長c");
		float c = scn.nextFloat();
		if(a*a+b*b==c*c){
			System.out.println("直角三角形");
		}else{
			if(a*a+b*b<c*c){
				System.out.println("鈍角三角形");
			}else{
				if(a*a+b*b>c*c){
					System.out.println("銳角三角形");
				}
			}
		}
			
		
		
		
	}

}
