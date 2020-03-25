package ex04controlstatement;
/*
 if문
 	형식2
 		if(조건문){
 			조건문이 참일때
 		}
 		else{
 			조건문이 거직일때
 		}
 */
public class E01if02 {
	public static void main(String[] args) {
		int num= 101;
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		/*
		 삼항연산자 (조건연산자)
		 	if~else 문과 동일 하지만 짧은코드로 가능 실무에서 자주 사용되는 문장임
		 	형식: 변수=(조건식)?참일때값:거짓일때값;
		 */
		String numberResult=(num%2==0)?"짝수임":"홀수임";
		System.out.println("숫자"+num+"은"+numberResult);
		/*
		 시나리오] 숫자를 홀짝인지 먼저 판간후 100이상인지를 판단하는 프로그램을 
		 if~else구문이용 하시오
		 */
		int num2=120;
		if(num2%2==0) {//짝수일때...
			if(num2>=100) {
				System.out.println("짝수이면서 100이상");
			}
			else {
				System.out.println("짝수이면서 100미만");
			}
		}
		else { //홀수일때 ...
			if(num2>=100) {
				System.out.println("홀수이면서 100이상");
			}
			else {
				System.out.println("홀수이면서 100미만");
			}
		}
	}
}
