package ex03operator;

public class E03BeekyoOperator {

	public static void main(String[] args) {

		/*
		 비교연산자
		 : 좌우측항의 값이 크거나 같거나 한지 비교하는 연산자
		 */
		int num1=10, num2=20;
		
		/*
		 num1이 클때 참으로 아래는 거짓으로
		 */
		
		if(num1>num2) {
			System.out.println("num1이 더 큽니다");
		}
		else {
			System.out.println("num2가 더 큽니다");
		}
		
		/*
		 num1과 num2가 다를 때 참을 반환하므오 아래조건은 참
		 */
		
		if(num1 != num2) {
			System.out.println("num1과 num2는 다르다");
		}
		else {
			System.out.println("num1과 num2는 같다");
		}
		
	}

}
