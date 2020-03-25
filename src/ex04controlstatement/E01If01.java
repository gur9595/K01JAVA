package ex04controlstatement;

import java.io.IOException;

/*
 if문(조건문, 분기문)
 	형식1
 		if(조건문){
 			실행문1;
 			실행문2;
 		
 		}
 		
 	-if문읜 조건문은 반드시 비교식혹은 노리식이어야 한다
 	-즉 결과값이 boolean타입이여야한다
 	-실행항 문장이 하나인경우 중괄호를 생략하능
 */
public class E01If01 {

	public static void main(String[] args) throws IOException {
	
		int num=10;
		
		/*
		 아래 문장은 조건식이 아닌 산술식이므로 에러발생됨/ 
		 */
		/*if(num%2) {
			System.out.println("잘못된 조건식입니다");
		}
		if(num) {
			System.out.println("이것도 잘못된 조건식입니다");
		}*/
		
		/*
		 if문의 조건은 아래와 같이 boolean값을 반환하는 조건식이어야 한다.
		 */
		if(num%2==0) {
			
			System.out.printf("%d는 짝수입니다.",num);
		}
		if(num%2==0&&num>=00) {
			System.out.printf("%n%d는 짝수이고 10보다"+" 크거나 같다 \n",num);
		}
		//경우에 따라 무조건 실행되는 if문도 필요함
		if(true) {
			System.out.println("무조건 실행되는 if문입니다");
		}
		/*
		 if(조건식); 조건식에 감솬없이 다음 문장이 실행되는 형태로 
		 세미콜론은 문장의 끝을 나타내므로 주의해야한다
		 */
		if(num%2 !=0);
		{
			//위조건에 상관없이 무조건 출력되는 문장임
			System.out.printf("%d는 홀수입니다",num);
		}
		/*
		 조건검사루 실헹할 문장이 하나인 경우에는 {}중괄호를 생략할수 있다 
		 단 실행문이 2개이상인 경우에는 한문장만 실행되므로 주의해야한다
		 */
		if(num%2==0)
			System.out.println("\n"+num+"은 짝수이다");
		if(num%2 !=0) {
			System.out.println("num은"+num+"입니다.");
			System.out.println(num+"은 홀수입니다.");
		}
		
		/*
		 System.in.read();
		 		: 사용저에게 하나의 문자를 입력받을때 사용하는 메소드로
		 		입력한 문자의 아스키코드값을 반환한다
		 		해당함수는 IOException을 기본적으로 가지고 있어
		 		이를 무시하시 위해 main함수에서 throws처리를 해준다
		 */
		
		/*System.out.print("하나의 문자를 입력하세요");
		int asciiCode=System.in.read();
		System.out.println("입력한문자:"+asciiCode);
		System.out.println("입력한문자:"+(char)asciiCode);*/
		
		/*
		 [시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해 구하시오
		 */
		/*
		 아스키코드값을 알고 있을때 구현방법
		 '0'=48
		 '9'=57이므로 해당 구간안에 있다면 숫자로 판단할수 있다.
		 ※ 숫자의 구간을 정할깬은 반드시 논리 AND를 사용해야 한다.
		 */
		System.out.print("하나의 문자를 입력하세요 : ");
		int asciiCode=System.in.read();
		if(asciiCode>=48 && asciiCode<=57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("숫자가 아닙니다.");
		}
		/*
		 아스키코드값을 모를떄 구현방법
		 char형 문자는 메모리에 저장시  아스키코드값으로 저장되므로 아래처럼
		 비교연산이 가능하다 또한 산술연산도 가능하다
		 */
		boolean isNumber=(asciiCode>='0' && asciiCode<='9');
		if(isNumber==true) {
			System.out.println("입녉한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한문자는 숫자가 아닙니다.");
		}
			
		
		
	}

}
  