package ex09package;

import ex09package.kosmo.perimeter.Circle;
/*
 메인 클래스에서 다른패키지 클래스를 import하여 사용하려면
 해당 클래스는 반드시 public 으로 선언 되어야한다
 그렇지 않으면 "not visible" 에러가 발생한다
 */
public class CircleMain {
	public static void main(String[] args) {
		//원의 넓이 :클래스 사용을 위해 풀패키지 경로 사용
		ex09package.kosmo.area.Circle circle=new ex09package.kosmo.area.Circle(6.5);
		System.out.println("반지름이 6.5인 원의 넓이"+circle.getArea());
		//원의 둘레 : import하여 클래스를 문서에 포함시킴
		Circle circle2=new Circle(4.5);
		System.out.println("반지름이 4.5인 원의둘레"+circle2.getPerimeter());
	}
}
