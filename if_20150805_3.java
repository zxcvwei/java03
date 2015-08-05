import java.util.Scanner;
public class if_20150805_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("是否為三角形的合法三邊長(a<=b<=c)");
		System.out.println("請輸入邊長a");
		int a = scn.nextInt();
		System.out.println("請輸入邊長b");
		int b = scn.nextInt();
		System.out.println("請輸入邊長c");
		int c = scn.nextInt();
		if(a<=b && b<=c && a+b>c){
			System.out.println("是");
		}else{
			System.out.println("不是");
		}
		
	}

}
