package ex02variable;

public class E01JunsuType {

	public static void main(String[] args) {
		/*
		 정수 자료형
		 -byte, short, int, long 타입이 있다
		 -각 자료형의 표현범위는 교안을 참조한다
		 -일반적으로 cpu는 정수형 연산을 항꺠 int형을 가장빠르게 처리한다
		 -즉 정수형 변수는 대부분 int형을 사용한다.
		 */
		int int1= 100;
		int int2= 200;
		int result1=int1+int2;
		System.out.println("int1+int2= "+result1); //결과:300
		
		result1 =int1/int2;//두개의 정수를 나눠서 몫을 반환한다.
		System.out.println("int1/int2= "+result1);//결과:0
		
		/*
		 -int보다 작은 자료형을 연산하면 컴파일러는 int형으로 변환하여 연산한다.
		 -byte, short 형은 게임케릭터의 움직임의 표현이나 음원종보등을 저장할때 사용한다.
		 */
		
		byte byte1=50;
		
		byte byte2=55;
		int result2=byte1+byte2;//byte +byte=int 형
		System.out.println("byte1+byte2= "+result2);
		
		short short1=60;
		short short2=70;
		int result3=short1+short2;// short+short= int형
		System.out.println("short1+short2= "+result3);
		
		/*
		 -동일자료형의 연산은 동일자료형이 되는것이 기본원칙이다.
		 -큰 자료형과 작은자료형을 연산하면 큰 자료형으로 자동형변환된다.(데이터손실이 있기때문)
		 -단 byte와short는 예외적인 상황으로 생각하면 된다, (int형연산을 좋아하는 cpu특성 )
		 */
		
		long long1=1000;
		long long2=2000;
		long result4= int1+long1;//int+long =long형으로 변환
		System.out.println("int1+long1= " +result4);
		
		result4=long1+long2;//long 끼리의 연산은 기본규칙을 따른다.
		System.out.println("long1+long2= "+result4);
		
		//long long3=2200000000; [에러 발생]
		long long3=2200000000L;
		long long4=2200000000l;/*
		자바 컴파일러(cpu)는 정수형상수를 기본적으로 int형으로
		간주하기떄문에 위 정수를 메모리에 올리는순간에러가 발생한다.
		이떄는 접미사를 붙여서int형 자료가 아닌
		long형 저료라는것을 알려줘야 에러가 발생하지 않는다
		이와같이 대입을 위해 입력되는 숫자도 자료형을 기반으로
		메모리에 저장되고 이를 가르켜 '리터럴'이라고한다
		*/
		
		System.out.println("long3= "+long3 );

	}

}
