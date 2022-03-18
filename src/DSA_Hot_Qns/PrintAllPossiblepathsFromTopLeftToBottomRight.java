package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintAllPossiblepathsFromTopLeftToBottomRight {
	
	public static void main(String[] args) {
		
		int [][] mat = {};
		
		
		Queue<Pair> queue = new LinkedList();
		List<Integer> list = new ArrayList();
		
		list.add(mat[0][0]);
		
		Pair p = new Pair(0,0);
		queue.add(p);
		
		
		
		

	}
	
	

}

class Pair{
	int i;
	int j;
	List<Integer> list;
	Pair(){
		
	}
	Pair(int i ,int j){
		this.i = i;
		this.j = j;
		//this.list = list;
	}
}
