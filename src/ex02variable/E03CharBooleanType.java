package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		/*
		 char형: 하나의문자응 저장할수있는 자료형우로 값을 저장할때
		 (single quotation)으로 감싸서 표현한다.
		 */
		
		char ch1='가';
		//char chStr='가나다라';에러발생문자열이므로 char 형변수에 대입불가
		String chStr="가나다라";
		System.out.println("ch1= "+ch1);
		System.out.println("chStr= "+chStr);
		/*
		 아스키코드 : 1byte로표현할수 있는 문자를 십진수코드로 정의한것을 말한다.
		 A=65로 표현
		 a=97로 표현
		 
		 유니코드: 1byte로 표현이 안되는 문자는 2btye가 필요하고 이를 16진수정의 한 값을 말한다.
		 */
		char ch2= 'A';
		int num1=2;
		int num2=ch2+num1;//65+2=67
		System.out.println("num2="+num2);
		System.out.println("(char)num2="+(char)num2);
		
		char ch3= (char)(ch2+num1);
		System.out.println("ch3문자출력"+ch3);
		System.out.println("ch3아스키코드출력"+(int)ch3);
		
		char ch4='1';//숫자가 아니라 문자이므로 49로 저장
		char ch4_1='1'+1;
		System.out.println("ch4=" +ch4+", ch4_1="+ch4_1+", ch4_1="+(int)ch4_1);
		/*
		 boolean형 : true혹은 false두가지의 값만 가질수 있는 데이터형으로 
		 	산술연산이나 비교연산은 사용이 불가능하다.
		 	단 논리연산은 가능하다.
		 */
		boolean bn1=true;
		boolean bn2=false;
		System.out.println("bn1=" +bn1+", bn2= "+bn2);
		/*
		 && 논리and연산으로 양쪽모두 참일떄 참을변환한다.
		 	나머지는 거짓을 변환한다
		 || 논리 or연산으로 둘줄하나만 참이면 참을 변환한가
		 	둘다 거짓일떄 거짓을 반환
		 */
		boolean bn3=bn1&&bn2;
		System.out.println("bn3(and)= "+bn3);
		
		bn3=bn1||bn2;
		System.out.println("bn3(or)= "+bn3);
		
		bn3='가'>30000; //가 유니코드 44032이므로 true반환
		
		System.out.println("bn3= "+bn3);
		
	
		
	}

}
