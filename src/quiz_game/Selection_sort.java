package quiz_game;

public class Selection_sort {

	public static void main(String[] args) {
		int[] sort=new int[10];
		for(int i=0;i<sort.length;i++) {
			int num= (int)(Math.random()*100);			
			sort[i]=num;
		}
		
		for(int i=0;i<sort.length;i++) {
			System.out.println(sort[i]+" ");
		}
	}
}
