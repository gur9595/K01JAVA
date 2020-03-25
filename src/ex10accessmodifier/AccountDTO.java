package ex10accessmodifier;
/*
 DTO클래스 (Data Transfer Object)
 	:데이터 ㄱ환을 위한 객체이다 스프링에서는 bean빈 이라고 부르기도한다
 	주로DTO객체는 로직을 전혀 가지고있지 않은 순수한데이터 객체이며
 	맴버변수에 접근하기위한 getter/setter메소드를 가지고있다
 	VO(Value Object)라고부른다
 */
public class AccountDTO {

	//1. 속성(멤버변수)
	private String name;
	private String accountNumber;
	private int balance;
	//기본생성자, 인자생성자 정의 (필요한 경우에만 정의한다)
	public AccountDTO() {}
	//2. getter/setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public AccountDTO(String name, String accountNumber, int balance) {
	
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
}
