package ex10accessmodifier;
/*
 class를 정의 할때 반드시 public과default만 가능하다
 
 private class PrivateClass1{
	void myFunc() {
		System.out.println("난 정의할수없는 클래스");
	}
}*/
/*
 접근지정자를 생략했으므로 default클래스로 지정
 해당 클래스는 동일 패키지내에서만 접근가능
 */
class DefultClass1{
	void myFunc() {
		System.out.println("DefaultClass클래스의 myFunc()메소드 호출");
	}
}
public class E01AccessModifier1 {

	//멤버변수를 각각의 접근지정자를 통해 선언
	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	/*
	 동일클래슨내에서는 private멤버라 할지라도 접급이가능
	 즉 동일한 클래스라면 접근지정자의 영향을받지않는다
	 */
	private void privateMethod() {
		privateVar=100;
		System.out.println("privateMethod 메소드 호출");
		
	}
	void defaultMethod() {
		privateVar=200;
		System.out.println("default 메소드 호출");
		
	}
	/*
	 * private으로 선언된 멤버를 외부클래스에서 접근하고 싶을때는 public으로 선언 된 멤버메소드를 이용해서 간접적으로 접군
	 */
	public void publicMethod() {
		privateVar=300;
		System.out.println("public 메소드 호출");
	}
}
