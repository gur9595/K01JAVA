package ex10accessmodifier.cal;

public class Calculator {

	private Adder adder;
	private Subtractor subtractor;
	
	public Calculator() {
		adder=new Adder();
		subtractor=new Subtractor();
	}
	/*
	 멤버메소드
	 	:덧셈 혹은 뺄셈 연산후 결과흫 반환하는 메소드로
	 	각연산을 위해 해당 default클래스의 멤버메소드를 호출한후 결과흫 반환한다
	 */
	public int addTwoNumber(int n1, int n2) {
		return adder.addTwoNumber(n1,n2);
	}
	public int subTwoNumber(int n1, int n2) {
		return subtractor.subTwoNumber(n1,n2);
	}
	/*
	 연산의 횟수를 디스플레이 해주는 메소드
	 정보은닉되어있는 멤버변수의 출력을 위해 getter메소드를 호출
	 */
	public void showOpratingTime() {
		System.out.println("덧셈횟수:"+adder.getCntAdd());
		System.out.println("뺄셈횟수:"+subtractor.getCntSub());
	}
	
}
//덧셈
class Adder{
	private int cntAdd;

	Adder(){
		cntAdd=0;
	}
	public int getCntAdd() {
		return cntAdd;
	}
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1+n2;
	}
}
//뺄셈
class Subtractor{
	private int cntSub;
	public Subtractor() {
		cntSub=0;
	}
	public int getCntSub() {
		return cntSub;
	}
	int subTwoNumber(int num1,int num2) {
		cntSub++;
		return num1-num2;
	}
}
