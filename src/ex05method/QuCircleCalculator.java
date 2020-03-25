package ex05method;
/*
 *  문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름
실행예 :
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985

 */
public class QuCircleCalculator {

	static double circleRound(double b){
	     double Round=2*3.14*b;
	     return Round;
	  }
	 
	  static double circleArea(double a){
	     double Area=a*a*3.14;
	     return Area;
	  }
	 
	  public static void main(String[] args) {

	     double x=5.5;

	     System.out.printf("원의 둘레(%.1f) : %.2f\n",x,circleRound(x));
	     System.out.printf("원의 넓이(%.1f) : %.3f ",x,circleArea(x));
	  }


}
