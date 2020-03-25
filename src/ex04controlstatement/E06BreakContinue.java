package ex04controlstatement;
/*
 break문
 	:반복문이나 switch문에서 주로 사용되며 블록내에서
 	break문을 만나게 되면 해당 블럭을 탈출
 	만약 중첩된 반복문이라면 가장 가까운 블럭 하나만 탈출

 continue문
 	:반복문에서 continue를 만나면 블럭의 처음으로 돌아가서 조건을 확인
 	따라서 continue아래 문장은 실행되지않음
 */
public class E06BreakContinue {

	public static void main(String[] args) {
		/*
		 반복문 내에서 break, continue문을 사용할때는 반드시
		 아래와 같이 조건문을 사용해야한다 그렇지 않으면 에러발생
		 */

		int i=0;
		while(true) {
			i++;
			System.out.printf("[i가 %d일때]\n",i);
			
			System.out.println("continue이전 출력문");
			if(i%2==0)continue;
			System.out.println("continue이후 출력문");
			
			System.out.println("break이전 출력문");
			if(i==3)break;
		}
		System.out.println("break이후 출력문");
		
		/*
		 중첩 반복문 안에서 break문을 만나면 가장 가까운 반복문 하나를 탈출
		 */
		
		for(int x=1; x<=5;x++) {
			System.out.println("x="+x);
			for(int y=1;y<=5;y++) {
				System.out.println("y="+y);
				if(y==3)break;
			}
		}
		
		
	}

}
