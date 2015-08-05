import java.util.Scanner;
public class if_20150805_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入國文成績");
		float c = scn.nextFloat();
		System.out.println("請輸入英文成績");
		float en = scn.nextFloat();
		System.out.println("請輸入數學成績");
		float m = scn.nextFloat();
		float total = c+en+m;
		System.out.println("請輸入成績個數");
		int num = scn.nextInt();
		float average = (float)(total/num);
		System.out.println("總和="+total);
		System.out.println("平均="+average);
		
	}

}
