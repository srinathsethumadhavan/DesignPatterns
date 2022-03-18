package DSA_Hot_Qns;

public class Testing1 {

	public static void main(String[] args) {
		
		System.out.println(isOneAway("acbd",null));
		
		/*
		 * One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
EXAMPLE
pale, ple -> true pales, pale -> true pale, bale -> true pale, bake -> fals

ale
ple
pae
pal


pale elp

		 */
	}
	
	
	public static boolean  isOneAway(String s1,String s2) {
		
		if(s1==null && s2==null)
			return true;
		if(s1==null || s2==null)
			return false;
		if(s1.isEmpty() && s2.isEmpty())
			return true;
		
		
		int dev = Math.abs(s1.length()-s2.length());
		if(dev>1)
			return false;
		
		int count =0;
		if(dev==0) {
			//replacement
			
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i))
					count++;
				if(count>1)
					return false;
			}
			
			return count<=1;
			
			
		}else if(dev==1) {
			//rem or in
			
			int l1 = s1.length();
			int l2= s2.length();
			
			if(l1>l2) {
				for(int i=0;i<l1;i++) {
					String temp = s1.substring(0,i)+s1.substring(i+1);
					if(temp.equals(s2))
						return true;
				}
			}else {
				for(int i=0;i<l2;i++) {
					String temp = s2.substring(0,i)+s2.substring(i+1);
					if(temp.equals(s1))
						return true;
				}
			}
			
			
		}
		
		
		return false;
		
	}

}
