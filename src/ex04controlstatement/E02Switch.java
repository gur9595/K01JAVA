package ex04controlstatement;

import java.util.Scanner;

/*
 switch 문 
 	if문 처엄 조건에 따라 분기하는 제어문으로 정수식의 값과 
 	동일한 부분은 찾아 실행하는 형태를 가지고있다
 	
 	형식
 		switch (산술식 정수식){
 		case 값1:
 			실행문1; break:
 		case 값2:
 			실행문2; break:
 			default:
 			위 의 값과 매칭되지 않을떄 실행되는문장
 			else와 같은 의미라 보면된다
 		}
 */
public class E02Switch {
	
	/*
	 Scanner 클래스
	 	:JDK5.0부터 추가된 클래스로 키보드를 통해 사용자로부터 값을 입력받을때사용
	 	nextLine():문자를 입력
	 	nextInt():정수를 입력
	 */

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int iNum=scanner.nextInt();
		System.out.println("입력한 숫자는: " +iNum);
		
		int remain=iNum%3;
		
		switch(remain) {
		case 0:
			System.out.println("나머지는 0입니다.");
			break;
		case 1:
			System.out.println("나머지는 1입니다.");
			break;
			default:
		case 2:
			System.out.println("나머지는 2입니다.");
		}
		
		/*
		 switch 문 사용사 주의사항
		 long 타잉ㅂ의 변수는 사용이 불가능하다
		 -byte short int char Sting만 사용가능
		 -논리식도 사용이 불가능하다.
		 */
		
		/*long ln=100;
		switch(ln) {
		case 100:
			System.out.println("long타입 사용?");
			default:
				System.out.println("안되는군!");
		}
		switch(iNum%3==0) {
			System.out.print(b);
		}*/
		/*
		 문자열이나 문자는 switch문에서 사용가능
		 */
		String title ="자바";
		switch(title) {
		case "자바": System.out.println("자바 좋아");
		break;
		case "JAVA":System.out.println("JAVA Gooood");
		break;
		}
		/*
		 여러 case르 ㄹ동시에 처리할꺠는 break문없이 case를 나열한다
		 if문에서 ||로 연결한것과 동일
		 */
		
		int season=4;
		switch(season) {
		case 3:case 4:case 5:
			System.out.println("봄입니다.");
			break;
		case 6: case 7: case 8: case 9:
			System.out.println("여름입니다");
			break;
		case 11: case 12: case 1: case 2:
			System.out.println("겨울입니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
