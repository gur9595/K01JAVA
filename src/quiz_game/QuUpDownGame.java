package quiz_game;

import java.util.Random;
import java.util.Scanner;

/*
 파일명 : QuUpDownGame.java

게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 
Enter키를 제거해주도록 하자.
 */
class UpDownGame{
	int count =0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void game() {
		Scanner num= new Scanner(System.in);
		int ranNum=(int)(Math.random()*100);

		System.out.println("****UpDownGame****");
		
		while (count<7) {
			System.out.println("숫자를 입력하세요:");
			int num1=num.nextInt();
			if(num1<ranNum) {
				System.out.println("낮습니다");
				System.out.println(count);
				count++;
			}
			else if(num1>ranNum) {
				System.out.println("높습니다");
				System.out.println(count);
				count++;
			}
			else {
				System.out.println("정답입니다");
				break;
			}
		}
	}
}
public class QuUpDownGame {

	public static void main(String[] args) {

		Scanner num= new Scanner(System.in);

		UpDownGame upDownGame =new UpDownGame();

		upDownGame.game();

		while(upDownGame.getCount()==7) {
			if(upDownGame.getCount()==7) {
				System.out.println("실패 하였습니다. 다시하기(1) 종료(0)");
				int num2=num.nextInt();

				if(num2==1) {
					upDownGame.setCount(0);
					upDownGame.game();
				}
				else if(num2==0) {
					System.out.println("종료");
					break;
				}
				
			}
		}

	}

}
