package ex05method;

import java.util.Scanner;

/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................6*9=54
메소드명 : inputGugudan(int sNum, int eNum)
 */

//for 문으로 제작한 구구단을 아래와 같이 업데이트
public class E04MethodType03_2 {
	static void gogoban(int sNum, int fNum) {
		for(int dan=sNum;dan<=fNum;dan++) {
			for(int su=2;su<=9;su++) {
				System.out.printf("%dX%d = %-2d  ",dan,su,(dan*su));
			}
			System.out.println();
		} 
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.printf("첫번째숫자:");
		int a=scanner.nextInt();
		System.out.printf("두번째숫자:");
		int b=scanner.nextInt();
		gogoban(a,b);
	}
	

}
