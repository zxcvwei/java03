import java.util.Scanner;
public class if_20150805_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入成績");
		float g = scn.nextFloat();
		if(g>97){
			System.out.println("成績等第是A+");
		}else{
			if(g>93){
				System.out.println("成績等第是A");
			}else{
				if(g>89){
					System.out.println("成績等第是A-");
				}else{
					if(g>86){
						System.out.println("成績等第是B+");
					}else{
						if(g>83){
							System.out.println("成績等第是B");
						}else{
							if(g>79){
								System.out.println("成績等第是B-");
							}else{
								if(g>76){
									System.out.println("成績等第是C+");								
								}else{
									if(g>73){
										System.out.println("成績等第是C");
									}else{
										if(g>69){
											System.out.println("成績等第是C-");
										}else{
											if(g>66){
												System.out.println("成績等第是D+");
											}else{
												if(g>63){
													System.out.println("成績等第是D");
												}else{
													if(g>60){
														System.out.println("成績等第是D-");
													}else{
														if(g<60){
															System.out.println("成績等第是E");
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
