import java.util.Scanner;
public class if_20150805_14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身高(cm)");
		float hcm = scn.nextFloat();
		System.out.println("請輸入體重(kg)");
		float wkg = scn.nextFloat();
		
		float hin = (float)(hcm*0.39);
		float wbon = (float)(wkg*2.21);
		System.out.println(hin+"英吋");
		System.out.println(wbon+"磅");
		
		
	}

}
