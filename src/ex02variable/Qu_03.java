package ex02variable;
/*
 문제3] 파일명 : Qu_03.java
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면애의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14
 */
public class Qu_03 {

	public static void main(String[] args) {
		int ray=10;
		int area_int=(int)(ray*ray*3.14);
		float area_float=(float)(ray*ray*3.14);
		double area_double=(ray*ray*3.14);
		
		System.out.printf("int형 넓이:%d\n",area_int);
		System.out.printf("float형 넓이:%f\n",area_float);
		System.out.printf("double형 넓이:%f\n",area_double);
		
		
	}

}
