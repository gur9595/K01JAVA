package common;

public class Teacher extends Person{
	String subject; //담당과목

	public Teacher(String n, int a, String suject) {
		super(n, a);
		this.subject = suject;
	}
	
	@Override
	public String getInfo() {
		return String.format("%s  ,과목: %s", super.getInfo());
	}
	
	@Override
	public void showInfo() {
		System.out.println(getInfo());
	}
}
