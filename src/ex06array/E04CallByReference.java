package ex06array;
/*
 Call By Reference(참조에 의한 호출)
 	:메소드를 호출할때 참조값을 전달함으로써 서로다른 
 	지역에서도 동일한 메모리를 참조할수있게하는 호출방법
 	메소드의 지역이 다르더라도 참조값을 통해 참조하므로
 	A영역에서의 값의 변경을 B영역에서도 그대로 참조할수있는장점이있다
 	그리고 참조값만 전달하므로 프로그램의 퍼포먼스도 향상되고 메모리도 절약할수있다
 */
public class E04CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {100,200};
		System.out.println("[메인메소드]-swap전 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[1]);
		}
		System.out.println();
		callByReference(arr);
		System.out.println("[메인메소드]-swap이후 출력");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

	private static void callByReference(int[] ref) {
		// TODO Auto-generated method stub
		int temp;
		temp =ref[0];
		ref[0] =ref[1];
		ref[1]=temp;

		System.out.println("[callByReference메인메소드]-swap이후 출력");
		for(int i=0;i<ref.length;i++) {
			System.out.println(ref[i]+" ");
		}
	}

}
