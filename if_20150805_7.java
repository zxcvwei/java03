import java.util.Scanner;
public class if_20150805_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�ʧO");
        String str = scn.next(); 
        System.out.println("�п�J����");
        float n1 = scn.nextFloat();
      	if(str.equals("�k")){
        	float boy = (float)((float)(n1-170)*0.6+62);
        	System.out.println("�з��魫:"+boy);
        }else{
        	str.equals("�k");
        	float girl= (float)((float)(n1-158)*0.5+52);
        	System.out.println("�з��魫:"+girl);
        }
			
	}

}
