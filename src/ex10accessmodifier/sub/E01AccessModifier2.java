package ex10accessmodifier.sub;
class DefaultClass2{
	void myFunc() {
		System.out.println("DefaultClass클래스의 myfunc메소드 호출");
		
	}
}
public class E01AccessModifier2 {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	
	private void privateMethod() {
		privateVar=400;
		System.out.println("privateMethod 메소드 호출");
		
	}
	void defaultMethod() {
		privateVar=500;
		System.out.println("default 메소드 호출");
		
	}
	public void publicMethod() {
		privateVar=600;
		System.out.println("public 메소드 호출");
	}
}
