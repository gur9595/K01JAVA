package ex06array;
/*
 for each 문 
 	:배열의 일부가 아니라  전체를 첨조할때 주로 이용
 	개건된 for문이다
 	배열의 요소를 참조형태로 가져와서 사용한다
 	그러므로 참조의 목적으로만 사용해야 하고 값의 변셩은 기본적으로 허용하지 않는다
 	형식]
 		for(자료형 ㅂ참조변수: 배열의 이름){
 			실행문장;
 			[참조변수를 통해 배열의 요소값 출력가능]
 		}
 */
public class E07ForEachBasic {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum =arr[i];
		}
		System.out.println("기본for문을 이용한 합계:"+sum);
		
		/*
		 배열 arr의 요소를 하나씩 참조하여 출력하고 더이상 참조할 요소가 없을때 
		 for문이 자동으로 종료
		 */
		sum=0;
		for(int e:arr) {
			System.out.print(e+" ");
			sum+=e;
		}
		
		/*
		 참조형태로 각 요소를 가져와서 변수 b에할당하는 형식이므로 아래 증가연산자를  통해
		 증가하는 것은 실제 배열에 적용되지 않는다 해당foreach문 내에서만 증가한다
		 */
		System.out.println("\nforeach문을 이용한 합계:"+sum);
		
		System.out.println("배열arr의 요소값1증가시키기");
		for(int b:arr) {
			b++;
			System.out.println(b+"");//+1 증가된 값이 출력됨
		}
		System.out.println();
		System.out.println("배열arr의 요소 재출력하기");
		for(int c:arr) {
			System.out.println(c+" ");//+1중가된 부분이 적용되지 않으므로 기존값이 그대로 출력
		}
		System.out.println();
		
		/*
		 2차원 배열은 1차원 배열여러개를 겹처놓은 형태이므로 출력시에는
		  우선 하나의 행(1차원배열)을 가져와서...
		 */
		//각 요소를 하나씩 참조하여 출력한다
	}

}
