package ex05method;
/* 문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.
실행예 :
2
3
5
7
……중략……
97

 */
public class QuFindPrimeNumber {

	static boolean isPrimeNumber(int num){
		/*if(num==1) {
		 	//1은 소수가 아니므로 무조건 false를 반환
			return false;
		}
		else {
			//모든 자연수는 1과 자신으로 나눠지므로 
			//두 조건을 제외한 나머지수로 나눠 떨어지는지 판단한다
			 
			for(int i=2; i<num;i++) {
				//1과 자신을 제외한 숫자로 나눠서 떨어지면 소수가 아니므로
				//그이후는 검사할 필요가 없다 판단되는 즉시 false를 반환
				if(num%i==0) {
					return false;
				}
			}
		}
		return true; //소수인경우 true반환
		*/

	     boolean result=true;

	     for(int i=2;i<num;i++){

	        if(num%i==0){
	           result=false; //소수아님
	           break;
	        }
	        else {
	           result=true; //소수임
	        }
	     }
	     return result;
	  }

	  public static void main(String[] args) {
	     for(int i=2;i<=100;i++){
	        if(isPrimeNumber(i)==true){
	           System.out.println(i);
	        }
	     }
	  }


}
