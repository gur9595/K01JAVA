package ex09package.kosmo.buyer;
/*
 클래스는 외부 패키지에 정의되어있으므로 반드시 import해야한다
  buyapple() 메소드에서 매개변수로 사용되고있기때문
 */
import ex09package.kosmo.seller.FruitSeller4;

//구매자를 표현한 클래스
public class FruitBuyer4{
	int myMoney;//보유금액
	int numOfApple;//구매한 사과의 갯수
	
	public FruitBuyer4(int _myMoney,int _numOFApple) {
		myMoney=_myMoney;
		numOfApple=_numOFApple;
	}
	
	public void buyApple(FruitSeller4 seller,int money) {
		
		numOfApple+= seller.saleApple(money);
		myMoney-=money;
	}
	

	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매지]사과갯수:"+numOfApple);
	}

	public void buyApple1(FruitSeller4 seller1, int money) {
		// TODO Auto-generated method stub
		
	}

}
