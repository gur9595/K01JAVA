package ex06array;

import java.util.Scanner;

/*
 파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

출력예시) 총 10개의 정수를 입력하시오.
1 2 3 4 5 6 7 8 9 10

순서대로입력된결과: 1 2 3 4 5 6 7 8 9 10
홀수/짝수 구분입력결과 : 1 3 5 7 9 10 8 6 4 2

 */
public class QuFillArray {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		int intAr1[]=new int[10];
		int intAr2[]=new int[10];
		
		
		System.out.print("총 10개의 정수를 입력하시오");
		for(int i=0;i<intAr1.length;i++) {
			int num=scanner.nextInt();
			intAr1[i]=num;
		}
		System.out.print("순서대로입력된결과: ");
		for(int i=0;i<intAr1.length;i++) {
			System.out.print(intAr1[i]+" ");
		}
		System.out.println();
		int countA=9,countB=0;
		for(int i=0;i<intAr2.length;i++) {
			
			if(intAr1[i]%2==0) {
				intAr2[countA]=intAr1[i];
				countA -=1;
			}
			else if(intAr1[i]%2==1) {
				intAr2[countB]=intAr1[i];
				countB +=1;
			}
		}
		System.out.print("홀수/짝수 구분입력결과: ");
		for(int i=0;i<intAr2.length;i++) {
			System.out.print(intAr2[i]+" ");
		}
	}

}
