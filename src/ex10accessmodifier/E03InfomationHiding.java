package ex10accessmodifier;

//과일판매자를 추상화한 클래스
class FruitSeller{
	//외부 클래스에서 접근할수 없도록 private으로 선언
	private int numOfApple; //판매자의 사과 보유갯수
	private int mymoney; //판매수익
	private final int APPLE_PRICE; //다시 상수로 선언함
	
	
	public FruitSeller(int money,int appleNum,int price) {
		mymoney= money;
		numOfApple=appleNum;
		APPLE_PRICE=price; //<-생성자 내에서는 상수를 초기화할수있음
	}

	public int saleApple(int money) {
		int num =money/APPLE_PRICE;
		numOfApple-=num;
		mymoney+=money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+numOfApple);
		System.out.println("[판매자]판매수익:"+mymoney);
	}
}
//구매자를 표현한 클래스
class FruitBuyer{
	private int myMoney;//보유금액
	private int numOfApple;//구매한 사과의 갯수
	
	public FruitBuyer(int _myMoney,int _numOFApple) {
		myMoney=_myMoney;
		numOfApple=_numOFApple;
	}
	
	public void buyApple(FruitSeller seller,int money) {
		numOfApple+= seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매지]사과갯수:"+numOfApple);
	}
}

public class E03InfomationHiding {

	public static void main(String[] args) {
	
		FruitSeller seller1 =new FruitSeller(0,100,1000);
		
		FruitSeller seller2=new FruitSeller(0, 80, 500);
		
		FruitBuyer buyer= new FruitBuyer(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상채");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	
		/*
		 멤버변수를 private으로 선언하면 외부클래스에서는 접근이 불가능 하므로 아래는 에러발생
		 */
		/*seller1.mymoney+=1000; //판매자1에게 1000원을 지불하고
		seller1.numOfApple-=50;//사과50개를 구매하였다
		buyer.numOfApple+=50;
		
		seller2.mymoney+=1000;//판매자2에게 100원을 지불하고
		seller2.numOfApple-=70;//사과 70개를 구매하였다
		buyer.numOfApple+=70; //하지만 구매자의 보유금액은 차감하지않았다
*/		
		/*
		 판매자1,2에게 각각의 금액을 지불하고 금액에 해당하는 사과를 정상적으로 구매하였다
		 정보은닉을 통해 판매의 규칙이 지켜지게됨
		 */
		buyer.buyApple(seller1, 1000);
		buyer.buyApple(seller2, 1000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
