package ex05method;
/*
 아래와 같은 출력결과를 보이는 업그레이드 구구단 프로그램을 작성하시오.
Class Name : QuUpgradeGuGu.java
---------- java ----------
2 x 1 = 2
2 X 2 = 4
2 X 2 X 2 = 8
2 X 2 X 2 X 2 = 16
2 X 2 X 2 X 2 X 2 = 32
2 X 2 X 2 X 2 X 2 X 2 = 64
2 X 2 X 2 X 2 X 2 X 2 X 2 = 128
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 256
2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 X 2 = 512
3 X 1 = 3
3 X 3 = 9
3 X 3 X 3= 27
………중간 생략………
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 43046721
9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 X 9 = 387420489
출력 완료 (0초 경과) - 정상 종료

 */
public class QuUpgradeGuGu {

	public static void main(String[] args) {
		
		int result=1;
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				for(int l=1;l<=j;l++) {
	
					System.out.printf("%d",i);
					System.out.print(" X ");
					
				}
				result*=i;
				System.out.println(" = "+result);
			}
			result=1;
		}
	}

}




















