import java.util.Scanner;

public class if_20150805_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���զ~");
		int y = scn.nextInt();
		
		if (y % 400 == 0) {// �O�|�~
			System.out.println(y+"�O�|�~");
		}else if(y%100==0){
			System.out.println(y+"���O�|�~");
			System.out.println("��"+y+"�̪񪺤@���|�~�O"+(y+4)+"�~�άO"+(y-4)+"�~");
		}else if(y%4==0){
			System.out.println(y+"�O�|�~");
		}else{
			System.out.println(y+"���O�|�~");
			if(y%4==1){
				System.out.println("��"+y+"�̪񪺤@���|�~�O"+(y+3)+"�~");
			}
			if(y%4==2){
				System.out.println("��"+y+"�̪񪺤@���|�~�O"+(y+2)+"�~");
			}
			if(y%4==3){
				System.out.println("��"+y+"�̪񪺤@���|�~�O"+(y+1)+"�~");
			}
		}
		
	}

}
