package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.List;

public class ParseCommandLineArg {

	public static void main(String[] args) {
		
		String str = " ./a.out \"First Second Third\"";
		
		int i = 0;
		int j = 0;
		
		List<String> list = new ArrayList();
		while(i<str.length()) {
			
			if(str.charAt(i)==' ')
				i++;
			if(str.charAt(i)=='\'') {
				j=i+1;
				while(str.charAt(j)!='\'') 
					j++;
				
				list.add(str.substring(i+1,j)) ;
				
				i=j+1;
			}else if(str.charAt(i)=='\"') {
				j=i+1;
				while(str.charAt(j)!='\"') 
					j++;
				
				list.add(str.substring(i+1,j)) ;
				
				i=j+1;
			}else {
				j=i+1;
				while(str.charAt(j)!=' ') 
					j++;
				
				list.add(str.substring(i,j)) ;
				i=j+1;
			}
		}
		
		System.out.println(list);

	}

}
