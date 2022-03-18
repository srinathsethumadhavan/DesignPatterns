package DSA_Hot_Qns;
import java.util.Arrays;

public class CalMain {

	public static void main(String[] args) {
	
		
		
						
		int[][] scheduled = new int[][] {{25,15},{10,5}};
		MyCalendar cal = new MyCalendar(scheduled);
		
		int[][] newPrograms = new int[][] {{18,7},{12,10}};
		boolean[] result  = new boolean[newPrograms.length];
		int i=0;
		for(int[] np : newPrograms)
			result[i++]=cal.book(np[0],np[0]+np[1]);
		System.out.println(Arrays.toString(result));
	}

}
