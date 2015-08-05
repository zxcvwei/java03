import java.util.Scanner;
public class if_20150805_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入日期");
		int d = scn.nextInt();
		if(d==7){
			System.out.println("吃素");
		}else{
			if(d==17){
				System.out.println("吃素");
			}else{
				if(d==27){
					System.out.println("吃素");
				}else{
					System.out.println("不吃素");
				}
			}
		}
			
	}

}
