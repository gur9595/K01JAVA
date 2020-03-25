package ex04controlstatement;
/*
 문제3] 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
파일명 : Qu_04_08.java
출력]	
* * * * *
* * * *
* * *
* *
*

 */
public class Qu_04_08 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
	        for(int j=1;j<=5;j++){
	           if(i<=j){
	              System.out.print("*");
	           }
	        }
	        System.out.println();
	     }


	}

}
