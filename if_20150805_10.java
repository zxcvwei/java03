import java.util.Scanner;
public class if_20150805_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�W�Ǵ�6�Ӧ��Z");
		float t1 = scn.nextFloat();
		float t2 = scn.nextFloat();
		float t3 = scn.nextFloat();
		float t4 = scn.nextFloat();
		float t5 = scn.nextFloat();
		float t6 = scn.nextFloat();
		System.out.println("�п�J�U�Ǵ����Ӧ��Z");
		float d1 = scn.nextFloat();
		float d2 = scn.nextFloat();
		float d3 = scn.nextFloat();
		float d4 = scn.nextFloat();
		float d5 = scn.nextFloat();
		int count1 = 0;
		int count2 = 0;
		if(t1<60){
			count1++;
		}
		if(t2<60){
			count1++;
		}
		if(t3<60){
			count1++;
		}
		if(t4<60){
			count1++;
		}
		if(t5<60){
			count1++;
		}
		if(t6<60){
			count1++;
		}
		if(d1<60){
			count2++;
		}
		if(d2<60){
			count2++;
		}
		if(d3<60){
			count2++;
		}
		if(d4<60){
			count2++;
		}
		if(d5<60){
			count2++;
		}
		
		System.out.println("�W�Ǵ��@��" +count1+ "��Q��");
		System.out.println("�U�Ǵ��@��" +count2+ "��Q��");
		if(count1>4 && count2>3){
			System.out.println("�h��");
		}
		if(count1<4 || count2<3){
			System.out.println("�b��");
		}
		
	}

}
