import java.util.Scanner;
public class if_20150805_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("判斷奇偶");
		System.out.println("請輸入一正整數");
		int num=scn.nextInt();
		int a=num%2;
		if(a==1){
		System.out.println(num+"為奇數");
		}
		if(a==0){
		System.out.println(num+"為偶數");
		}
		
	}

}
