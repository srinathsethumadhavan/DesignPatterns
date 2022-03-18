package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;



public class ArrayListTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Set<Integer>set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		ArrayList<Integer> list = new ArrayList(set);
		
		
		Iterator itr = list.iterator();
		
//		for(Integer i : list)
//			System.out.println(i);
//		while(itr.hasNext())
//			System.out.println(itr.next());

		
		ArrayList arrlist = new ArrayList();  
		arrlist.add("d");  
		arrlist.add("dd");  
		arrlist.add("ddd");  
		arrlist.add(2);  
		arrlist.add(54);
		
		 Collection constL =  Collections.unmodifiableCollection(new HashSet());
		 
		ListIterator iterator = arrlist.listIterator(4);  
		//System.out.println(iterator.previous ());    // false  
		//iterator =  arrlist.listIterator(6);  
		
		List<ArrayList> list3 = Arrays.asList(new ArrayList());
		
		//list3.add(2,arrlist);
		
		
		
		try {
			return ;
			
			
		}
//		catch(Exception e){
//			
//		}
		finally {
			System.out.println("hi");
		}
		
	}

}
