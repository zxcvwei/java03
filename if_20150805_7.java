import java.util.Scanner;
public class if_20150805_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別");
        String str = scn.next(); 
        System.out.println("請輸入身高");
        float n1 = scn.nextFloat();
      	if(str.equals("男")){
        	float boy = (float)((float)(n1-170)*0.6+62);
        	System.out.println("標準體重:"+boy);
        }else{
        	str.equals("女");
        	float girl= (float)((float)(n1-158)*0.5+52);
        	System.out.println("標準體重:"+girl);
        }
			
	}

}
