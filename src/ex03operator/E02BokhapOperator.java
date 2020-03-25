package ex03operator;

public class E02BokhapOperator {

	public static void main(String[] args) {
		/*
		 복합대입연산자
		 	: 산술연산자와 대입연산자를 연결해놓은 형태로
		 	외우측의 값을 연산하여 좌측의 변수에 대입하는  형태의 구조를 가진다
		 	문법구조상 항상 현재타입을 유지하는특성
		 */

		double e= 3.1;
		e+=2.1;
		e*=2;
		e=e+e;
		System.out.println("e의 결과값: "+e);
		
		int n =5;
		//n=n*2.7; 에러발생 계산의 결과가 double 이므로 대입불가
		n = (int)(n*2.7); //명시적 형변환
		n*=2.7; // 정상 기존의 자료형을 유지한다
				//문법구조상 명시적 형변환된 결과가 반환된다고 생각하면된다.
		System.out.println("n의 결과값: "+n);
		
	}

}
