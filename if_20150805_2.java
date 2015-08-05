import java.util.Scanner;
public class if_20150805_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入店家名稱");
		String store = scn.next();
		System.out.println("請輸入飲料全名");
		String drink = scn.next();
		System.out.println("請輸入價格(元)");
		int prise = scn.nextInt();
		if(store.equals("50嵐")){
			System.out.println("不喝");
		}else{
			if(drink.equals("綠茶")||drink.equals("咖啡")){
				if(prise<=45){
					System.out.println("喝");
				}
			
			}else{
				System.out.println("不喝");
			}
		}
	}

}
