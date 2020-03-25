package ex08class;

//과일판매자를 추상화한 클래스
class FruitSeller3{
	int numOfApple; //판매자의 사과 보유갯수
	int mymoney; //판매수익
	final int APPLE_PRICE; //다시 상수로 선언함
	
	/*
	 상수는 값의 변경이 불가능하고 단 한번만 초기화되기 때문에
	 일반적인 멤버메소드에서는 초기화 할수 없다
	 단 생성자 메소드에서는 초기화가 가능하다
	 마음대로 호출할수없고 객체생성시 단 한번만 호출되는 특성이 
	 동일하기떼문에 한번이상 초기화되지 않음이 보장되기때문
	 */
	public FruitSeller3(int money,int appleNum,int price) {
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
class FruitBuyer3{
	int myMoney;//보유금액
	int numOfApple;//구매한 사과의 갯수
	
	public FruitBuyer3(int _myMoney,int _numOFApple) {
		myMoney=_myMoney;
		numOfApple=_numOFApple;
	}
	
	public void buyApple(FruitSeller3 seller,int money) {
		numOfApple+= seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매지]사과갯수:"+numOfApple);
	}
}

public class E06FruitSalesMain3 {

	public static void main(String[] args) {
		/*
		 생성자를 통해서 객체 생성과 동시에 초기화되므로 
		 init메소드를 호출할 필요가 없어진다
		 따라서 객체생성 코드를 한줄로 줄일수 있다
		 */
		FruitSeller3 seller1 =new FruitSeller3(0,100,1000);
		
		FruitSeller3 seller2=new FruitSeller3(0, 80, 500);
		
		FruitBuyer3 buyer= new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상채");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);

		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
