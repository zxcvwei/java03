import java.util.Scanner;
public class if_20150805_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���a�W��");
		String store = scn.next();
		System.out.println("�п�J���ƥ��W");
		String drink = scn.next();
		System.out.println("�п�J����(��)");
		int prise = scn.nextInt();
		if(store.equals("50�P")){
			System.out.println("����");
		}else{
			if(drink.equals("���")||drink.equals("�@��")){
				if(prise<=45){
					System.out.println("��");
				}
			
			}else{
				System.out.println("����");
			}
		}
	}

}
