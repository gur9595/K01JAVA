package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 자동형변환 : 작은ㅅ강자의 데이터를 큰상자에 대입할때 자동으로 형변환
		 */
		byte b1= 65;
		short s1;
		s1=b1;
		System.out.printf("b2은 %d , s1은 %d%n",b1,s1);
		
		/*
		 아래코드는 자동형변환이 아님 cpu는 int보다 작은 자료형을
		 int로 간주하고 연산을 진행하며 결과도 int로 반환한다.
		 cpu의 득성이라 생각하자
		 */
		int num1=b1+s1;
		int num2=num1;
		System.out.println("num1은 "+num1);
		
		/*
		 char형에 byte형을 바로 대입할수 없다
		 성질이 다르므로 형변화후 대입
		 */
		//char ch1=b1;
		char ch2=(char)b1;
		System.out.println("b1="+b1+", ch2= "+ch2);
		
		/*
		 명시적 형변환 : 큰샂아의 자료를 작은상자의 자료형에 할당해야할때 사용한다
		 단 이때 데이터의 손실이 있을수 있으므로 주의
		 */
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터손실:b2=%d, s2=%d\n",b2,s2);
		
		/*
		 소주점 아래부분이 버려지므로 데이터 손실함 
		 따라서 득수한경우가 아니라면 사용을 자제하는것이 좋다
		 */
		int num3;
		double dl=3.14;
		num3=(int)dl;
		System.out.printf("데이터손실:num3=%d, dl=%.2f %n", num3, dl);
		
		/*
		 char와 int를 연산하면 결과는 int를 반환하므로 
		 char형변수에 대입하려면 명시적 형변환후 해야한다
		 */
		char ch3= 'A', ch4;
		int num4=2;
		//ch4=ch3+num4; 타입이 맞지않음
		ch4=(char)(ch3+num4);
		System.out.println("ch4="+ch4);
	}

}
