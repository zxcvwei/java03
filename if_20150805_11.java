import java.util.Scanner;
public class if_20150805_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�j�g�Τp�g���^��r��");
		char[] a = scn.next().toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]>=97 && a[i]<=122){
				String str = String.valueOf(a[i]);
				
				System.out.print(str.toUpperCase());
			}
			if(a[i]>=65 && a[i]<=90){
				String str = String.valueOf(a[i]);
				
				System.out.print(str.toLowerCase());
			}
		}
		
		
	}

}
