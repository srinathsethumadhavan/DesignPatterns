package DSA_Hot_Qns;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        
       
        String[] result = new String[queries.length];
        Map<String,List<String>> vowelMap = new HashMap();
        Map<String,List<String>> map = new HashMap();
        Map<String,List<String>> wordsMap = new HashMap();
        
        for(int i=0;i<wordlist.length;i++){
            
            String lowercaseWord = wordlist[i].toLowerCase();
            
             if(!wordsMap.containsKey(lowercaseWord))
                wordsMap.put(lowercaseWord,new ArrayList());
             wordsMap.get(lowercaseWord).add(wordlist[i]);
          
            String vowelLessWord = wordlist[i].replaceAll("[AaEeIiOoUu]", "-");
            String vowelLessLowercaseWord = vowelLessWord.toLowerCase();
            
            if(!vowelMap.containsKey(vowelLessLowercaseWord))
                vowelMap.put(vowelLessLowercaseWord,new ArrayList());
             vowelMap.get(vowelLessLowercaseWord).add(vowelLessWord);
            
            if(!map.containsKey(vowelLessWord))
                 map.put(vowelLessWord,new ArrayList());
            map.get(vowelLessWord).add(wordlist[i]);
        }
        
  
        boolean isFound = false;
        
        
        for(int i=0;i<queries.length;i++){
            String lowecaseQuery =  queries[i].toLowerCase();
            if(wordsMap.containsKey(lowecaseQuery)){
                if(wordsMap.get(lowecaseQuery).contains(queries[i])){
                    result[i]=queries[i];
                    isFound = true;
                }
                else{
                    result[i]= wordsMap.get(queries[i].toLowerCase()).get(0);
                     isFound = true;
                }
            }
                
           if(isFound!=true){
               String lowercasevowlLessQuery  = queries[i].replaceAll("[AaEeIiOoUu]", "-").toLowerCase();
                if(vowelMap.containsKey(lowercasevowlLessQuery)){
                    result[i]=  map.get(vowelMap.get(lowercasevowlLessQuery).get(0)).get(0);
                    isFound = true;                 
                }
           }
            if(isFound!=true)
                result[i]="";           
            isFound = false;
            }
                
        
    return result;
    }
}