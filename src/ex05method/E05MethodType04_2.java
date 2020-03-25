package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {
	
/*
 시나리오] 여러개의 숫자를 입력받은후 최대값을 구하는 
 메소드를 정의하시오. 단 숫자의 갯수는 매개변수로 전발받고
 숫자의 갯수만큼 scanner클래스를 통해 입력받는다
 입력받은 숫자중 최대값을 찾아서 반환하도록 정의한다.
 */
	public static void main(String[] args) {
		int maxValue1=returnMaxNumber(4);
		System.out.println("최대값1:"+maxValue1);
		int maxValue2=returnMaxNumber(6);
		System.out.println("최대값2:"+maxValue2);
	}
	static int returnMaxNumber(int numberCnt) {
		Scanner scanner=new Scanner(System.in);
		
		int maxVal=0; //최대 값을 반환변수
		for (int i=1; i<=numberCnt;i++) {
			System.out.println("정수를 입력하세요");
			int inputNum=scanner.nextInt();
			
			if(i==1) {
				//입력받은 숫자중 가장 첫번째 입력값을 기준값으로 설정
				maxVal =inputNum;
			}
			else {
				//두번째 값붙터 maxVal과 비교
 				if(maxVal<inputNum) {
 					//만약 maxValue 보다 입력값이 더 크다면 입력값으로 교체한다
					maxVal=inputNum;
				}
 				//maxValue값이 더 크다면 기존값을 유지하면 되므로 else는필요
			}
		}
		return maxVal;
	}

}
