import java.util.Scanner;
public class if_20150805_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���Z");
		float g = scn.nextFloat();
		if(g>97){
			System.out.println("���Z���ĬOA+");
		}else{
			if(g>93){
				System.out.println("���Z���ĬOA");
			}else{
				if(g>89){
					System.out.println("���Z���ĬOA-");
				}else{
					if(g>86){
						System.out.println("���Z���ĬOB+");
					}else{
						if(g>83){
							System.out.println("���Z���ĬOB");
						}else{
							if(g>79){
								System.out.println("���Z���ĬOB-");
							}else{
								if(g>76){
									System.out.println("���Z���ĬOC+");								
								}else{
									if(g>73){
										System.out.println("���Z���ĬOC");
									}else{
										if(g>69){
											System.out.println("���Z���ĬOC-");
										}else{
											if(g>66){
												System.out.println("���Z���ĬOD+");
											}else{
												if(g>63){
													System.out.println("���Z���ĬOD");
												}else{
													if(g>60){
														System.out.println("���Z���ĬOD-");
													}else{
														if(g<60){
															System.out.println("���Z���ĬOE");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
	}

}
