import java.util.Scanner;

public class if_20150805_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入測試年");
		int y = scn.nextInt();
		
		if (y % 400 == 0) {// 是閏年
			System.out.println(y+"是閏年");
		}else if(y%100==0){
			System.out.println(y+"不是閏年");
			System.out.println("離"+y+"最近的一次閏年是"+(y+4)+"年或是"+(y-4)+"年");
		}else if(y%4==0){
			System.out.println(y+"是閏年");
		}else{
			System.out.println(y+"不是閏年");
			if(y%4==1){
				System.out.println("離"+y+"最近的一次閏年是"+(y+3)+"年");
			}
			if(y%4==2){
				System.out.println("離"+y+"最近的一次閏年是"+(y+2)+"年");
			}
			if(y%4==3){
				System.out.println("離"+y+"最近的一次閏年是"+(y+1)+"年");
			}
		}
		
	}

}
