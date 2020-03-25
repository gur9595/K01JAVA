package ex03operator;

public class E05ShortCircuitEvaluation {

	public static void main(String[] args) {

		/*
		 SCE(short circuit evaluation)
		 	하나의 조건 검사만으로 결과를 알수있는 경우 java컴파일러는 
		 	뒤의 조건을 수행하지 않고 건너뛰게 된다
		 	이경우 변수의 값이 변결되는 코드는 실행을 하지않는다
		 */
		int num1=0, num2=0;
		boolean result;
		
		/*
		 &&(논리and)의 경우 둘줄하나만 false이면 false를 반환하므오
		 첫번째 조건이false이면 두번째 조건을 검사하지 않는다
		 */
		result =(num1+=10)<0&&(num2+=10)>0;
		System.out.println("result= "+result);
		System.out.println("num1= "+num1+", num2= "+num2); //10,0
		
		/*
		 ||(논리or)의 경우 둘중하나만 true이면 true를 반환 하므로
		 첫번째 조건이 true이면 두번째 조건을 검사하지않는다
		 */
		result =(num1+=10)>0||(num2+=10)<0;
		System.out.println("result= "+result);
		System.out.println("num1= "+num1+", num2= "+num2);
		
		/*
		 따라서 num2의 결과가 프로그램에 영향을 미치게 되는 경우라면 
		 별도의 처리를 해야하고 코드작성에 주의해야한다
		 */
	}

}
