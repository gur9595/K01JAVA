package ex02variable;

public class E05ConstantVar {

	public static void main(String[] args) {

		/*
		 상수 : 저장된 값이 변하지 않ㅇ는 메모리의 한종류
		 선언방법: final 자료형 변수명= 초기값;
		 -상수는 딱 한번만 초기화되며, 중간에 값을 변경하면 에러발생
		 -선언시 전체를 대문자로 선언하며 연결되는 단어가 있는경우_를 사용
		 -주로 프로그램내에서 코드의 가독성으 높여주기 위해 횔용된다
		 */
		final double PI=3.14;
		System.out.println("PI(원주율)="+PI);
		
		//PI=3.141592; 상수는 한번 초기화하면 변경불가능
		
		//상수가 초기화되지 않는 상태에서 출력하면 에러발생
		final String NICK_NAME;
		//System.out.println("우리는"+NICK_NAME);
		NICK_NAME="코스모61기";
		System.out.println("우리는 "+NICK_NAME);
		/*\
		 가위바위보 게임을 제작하기위해 개발자는 아래와같이 결정하였다.
		 가위:1 바위:2 보:3
		 */
		final int SCISSOR=1;
		final int ROCK=2;
		final int PAPER=3;
		
		int computer, user;
		/*
		 1,3은 개발자 본인만 알수있는 내용이므로 가독성이 떨어지는 코드로 작성
		 */
		computer=1;
		user=3;
		
		System.out.println("컴퓨터가 이겼습니다");
		/*
		 PAPER와같은 단어는 누가 보더라도 이해할수 있으므로 가독성이 높은 명시적 코드가 좋다
		 */
		computer=SCISSOR;
		user=PAPER;
		System.out.println("Computer Win");
		
	}

}
