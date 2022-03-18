package DSA_Hot_Qns;
import java.util.Arrays;

public class CountMaxWordsInSentence {

	public static void main(String[] args) {
		

		String s = "We test coders. Give us a try?";
		System.out.println(countMaxWords(s));
      /*
       * 
       * sentence is terminated by  ? . !
       */
	}
	
	
	
	public static int countMaxWords(String S) {
		
		S=S.replace("!", "-").replace("?","-").replace(".","-");
		
		String[] sentences = S.split("-");
		
		int maxWordsCount = Integer.MIN_VALUE;
		
		
		for(String sentence : sentences) {
			String[] words = sentence.split("\s++");
			
			int wordsCount  = 0;
			for(String word:words) {
				if(word.trim().length()>0)
					wordsCount++;
			}
			
			maxWordsCount= Math.max(maxWordsCount, wordsCount);
			}
		
		
		return maxWordsCount;
	}

}
