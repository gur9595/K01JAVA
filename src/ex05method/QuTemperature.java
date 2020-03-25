package ex05method;

import java.util.Scanner;

/*
 문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와
화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
  화씨 = 1.8 * 섭씨 + 32
  섭씨 = (화씨 - 32) / 1.8

 */
public class QuTemperature {

	static double celsius(double fa){
	     double cel=(fa-32)/1.8;
	     return cel;
	  }
	  static double fahrenheit(double ce){
	     double fah=(1.8*ce)+32;
	     return fah;
	  }

	  public static void main(String[] args) {
	     Scanner scanner=new Scanner(System.in);

	     System.out.print("화씨 입력: ");
	     double fa=scanner.nextDouble();
	     System.out.printf("섭씨로 변환된 값:%.2f \n",celsius(fa));

	     System.out.print("섭씨 입력: ");
	     double ce=scanner.nextDouble();
	     System.out.printf("화씨로 변환된 값:%.2f",fahrenheit(ce));

	  }


}
