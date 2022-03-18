package DSA_Hot_Qns;
import java.util.LinkedList;

public class CompressedStringIterator {
	
	
	public static void main(String[] args) {
		CompressedStringIterator c = new CompressedStringIterator("L1e2t1C1o111d13e1");
	}
	
	LinkedList<Integer> freqList ;
	LinkedList<Character> charList;
	char currentChar ;
	int freqCount;
	CompressedStringIterator(String compressedString){
		
		LinkedList<Integer> freqList = new LinkedList() ;
		LinkedList<Character> charList = new LinkedList() ;
		
		int n = compressedString.length();
		
		int i=0;
		while(i<n) {
			
			if(Character.isLetter(compressedString.charAt(i))) {
				charList.add(compressedString.charAt(i));
				i++;
			}else {
				int l = i;
				while(i<n && !Character.isLetter(compressedString.charAt(i))) {
					i++;
				}
				int freq = Integer.parseInt(compressedString.substring(l,i));
				freqList.add(freq);
			}
		}
		
		
		
		
		currentChar  = charList.poll();
		freqCount = freqList.poll();
		
		
		
	}
	
	
	public char next() {
		
		
		if(charList.size()==0 && freqList.size()==0)
		return ' ';
		else {
			char toReturn = currentChar;
			freqCount--;
			if(freqCount==0) {
				if(charList.size()>0)
					currentChar = charList.poll();
				if(freqList.size()>0)
					freqCount = freqList.poll();
			}
			return toReturn;
		}
	}
	
	
	public boolean hasNext() {
		
		
		return !(charList.size()==0 && freqList.size()==0) ;
	}
}
