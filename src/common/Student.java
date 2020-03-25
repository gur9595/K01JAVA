package common;

public class Student extends Person {
	public String strNumber;

	public Student(String name, int age, String strNumber) {
		super(name,age);
		this.strNumber = strNumber;
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.getInfo()+", 학번:"+strNumber;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("학생의정보");
		System.out.println(getInfo());
	}
	
}
