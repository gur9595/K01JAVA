package ex03operator;

public class E04LogicOperator {

	public static void main(String[] args) {
		
		/*
		 논리연산자 
		 &&: 논리 and 양쪽모두가 true일때만 true 나머지는 false
		 ||: 논리 or 한쪽만 true 이면 true 양쪽모두 false일떄만 false
		 !: 논리 not 반대의 논리
		 */

		int num1=10, num2=20;
		
		boolean result1=(num1==100&&num2==20);//f and t = false
		boolean result2=(num1<12||num2>=30); // t or f = true
		
		System.out.println("result1의 결과:"+result1);
		System.out.println("result2의 결과:"+result2);
		
		//num1과 num2가 다를때 true를 반환, 따라서 if문 실핼
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		}
		else {
			System.out.println("num1과 num2는 같다");
		}
	}

}
